package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.material3.TooltipKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.WorkRequest;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SwitchNetworkResult;
import com.okinc.business.defi.dapp.base.FragmentNavigator;
import com.okinc.business.defi.dapp.net.DappInfoByUrl;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.view.DappBrowserMultiModeToolbar;
import com.okinc.business.defi.dapp.webview.DappNewWebFragment$initData$1;
import com.okinc.business.defi.dapp.webview.DappNewWebFragment$onWalletSelected$2$1;
import com.okinc.business.defi.dapp.webview.DappNewWebFragment$selectWallet$1$1;
import com.okinc.business.defi.dapp.webview.DappNewWebFragment$toastWhenVisible$1;
import com.okinc.business.defi.dapp.webview.DappNewWebFragment$toastWithSuccessWhenVisible$1;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import com.okinc.dapp.bean.DappChains;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.web3.security.bridge.MnemonicKt;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC13137dAe;
import o.C13241dEa;
import o.C15148dyp;
import o.C33129mqd;
import o.C43251rlk;
import o.C52761wXj;
import o.C56391yDq;
import o.C6818aWZ;
import o.InterfaceC9737bbI;
import o.dBW;
import o.dDI;
import o.dES;
import o.dIO;
import o.dLX;
import o.xWQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dBW extends AbstractC14835dsu implements dDI.ActionBar, dES {
    public static java.lang.String AEQbTJ;
    public static final ActionBar Companion;
    public static java.lang.String EZpvd;
    public static final int OLrzqt;
    public static Function0<Unit> copydefault;
    public java.util.List<DappChains> AhwBna;
    public boolean AuCTel;
    public boolean AuCTelauCTel;
    public AbstractC13464dMh AubY;
    public C13241dEa AwvSrB;
    public boolean DTwDnp;
    public int DbNXlk;
    public java.lang.String OcIXYQ;
    public java.lang.Long QKVWgx;
    public OKReminder QOLQEE;
    public android.widget.FrameLayout QVAiDq;
    public android.widget.ImageView QbewEr;
    public android.widget.TextView QfsBiF;
    public LottieAnimationView RJOkX;
    public java.lang.String RcXXUw;
    public int UeEOUB;
    public android.view.View aKErDB;
    public long dNCPSb;
    public java.lang.Runnable djSkpj;
    public C55113xdn dvKsVJ;
    public boolean fARcdN;
    public java.lang.String fFgQHt;
    public boolean fJNWhG;
    public InterfaceC9738bbJ fetchVPNInfo;
    public Function0<Unit> gHZMYf;
    public java.lang.Long getFieldNames;
    public DappTabData hDKMBd;
    public boolean isConnected;
    public Function0<Unit> sSMYrx;
    public dDI wlaJM;
    public android.webkit.ValueCallback<android.net.Uri[]> zLjUOn;
    public PlatformItem zsXlph;
    public volatile boolean zuBGHE;
    public java.lang.String AxsJAY = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String ejfBZ = "";
    public C58216yxB values = new C58216yxB();
    public final int djBIcL = 1;
    public final int gEmmrt = 2;
    public final java.lang.Object getNewProxyInstance = new java.lang.Object();
    public java.lang.String dxcTrN = SubdomainStrategy.Global.INSTANCE.toString();
    public java.lang.String QUSxYX = "";
    public java.lang.String uzCIH = "";
    public java.lang.String ORxRYg = "default";
    public java.util.ArrayList<java.lang.Long> valueOf = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.dDx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return dBW.AhwBna();
        }
    });
    public java.lang.String fIwbmz = "";
    public java.lang.String iwGUEr = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QUSxYX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AuCTelauCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(DappTabData dappTabData) {
        this.hDKMBd = dappTabData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Long l) {
        this.QKVWgx = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return dLX.Fragment.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getNewProxyInstance() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.dES
    public DappTabData uzCIH() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean wlaJM() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.dES
    public java.lang.String zLjUOn() {
        return this.QUSxYX;
    }

    public final C15059dxF hDKMBd() {
        return (C15059dxF) this.AkhnZx.getValue();
    }

    public static final C15059dxF AhwBna() {
        return new C15059dxF();
    }

    @Override // o.dES
    public void AEQbTJ(int i) {
        C13241dEa c13241dEa = this.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.setDappType(i);
        }
        this.DbNXlk = i;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dBW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String KWHzl() {
            return dBW.AEQbTJ;
        }

        public final void KWHzl(Function0<Unit> function0) {
            dBW.copydefault = function0;
        }

        public final java.lang.String AEQbTJ() {
            return dBW.EZpvd;
        }

        public final java.lang.String EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("mlnconfig");
            if (jsonObjectAEQbTJ == null) {
                return str2;
            }
            JsonElement jsonElement = jsonObjectAEQbTJ.get(str);
            if (android.text.TextUtils.isEmpty(jsonElement != null ? jsonElement.getAsString() : null)) {
                return str2;
            }
            java.lang.String asString = jsonObjectAEQbTJ.get(str).getAsString();
            Intrinsics.copydefault((java.lang.Object) asString);
            return asString;
        }

        public final dBW EZpvd(@NotNull PlatformItem platformItem, java.util.List<DappChains> list, java.lang.String str, java.lang.Long l, Function0<Unit> function0, boolean z, boolean z2, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4) {
            Intrinsics.checkNotNullParameter(platformItem, "");
            Intrinsics.checkNotNullParameter(str2, "");
            KWHzl(function0);
            dBW dbw = new dBW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("item", platformItem);
            if (l != null) {
                l.longValue();
                bundle.putLong("chainid_default", l.longValue());
            }
            Intrinsics.copydefault(list, "");
            bundle.putSerializable("chains", (java.io.Serializable) list);
            bundle.putString("wallet_id", str);
            bundle.putBoolean("IS_FROM_OUT", z);
            bundle.putBoolean("SHOW_TIP", z2);
            bundle.putString("subdomainstrategy", str2);
            bundle.putString("source", str3);
            bundle.putBoolean("showBottomNavigationView", bool != null ? bool.booleanValue() : false);
            bundle.putString("rootPage", str4);
            dbw.setArguments(bundle);
            return dbw;
        }

        public static /* synthetic */ dBW newInstanceFromFastEntrance$default(ActionBar actionBar, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            return actionBar.AEQbTJ(str, bool, str2);
        }

        public final dBW AEQbTJ(java.lang.String str, java.lang.Boolean bool, java.lang.String str2) {
            RxBus.AEQbTJ(new dIO(str == null ? "" : str));
            dBW dbw = new dBW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("IS_FROM_FAST_ENTRANCE", true);
            bundle.putBoolean("IS_FROM_OUT", true);
            bundle.putString("rootPage", str);
            bundle.putBoolean("showBottomNavigationView", bool != null ? bool.booleanValue() : false);
            bundle.putString("source", str2);
            dbw.setArguments(bundle);
            return dbw;
        }
    }

    static {
        ActionBar actionBar = new ActionBar(null);
        Companion = actionBar;
        OLrzqt = 8;
        AEQbTJ = actionBar.EZpvd("eth_rpc_dapp", "/nodeone/eth/mainnet/v1/rpc/637f042f38a0a64dd59c954b8e6bd63de26d3e2e");
        EZpvd = "sui:mainnet";
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AubY = (AbstractC13464dMh) DataBindingUtil.bind(view);
        this.aKErDB = view.findViewById(dLX.Application.fdOvFl);
        this.QVAiDq = (android.widget.FrameLayout) view.findViewById(dLX.Application.aUsmxb);
        this.RJOkX = (LottieAnimationView) view.findViewById(dLX.Application.fERRXa);
        this.QbewEr = (android.widget.ImageView) view.findViewById(dLX.Application.dUDNAs);
        this.QfsBiF = (android.widget.TextView) view.findViewById(dLX.Application.htlTjW);
        this.dvKsVJ = (C55113xdn) view.findViewById(dLX.Application.igXuih);
        try {
            Result.Application application = Result.Companion;
            if (java.lang.Boolean.parseBoolean(ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_dapp_webviewinput_enabled", AmplitudeName.WEB3))) {
                dER.Companion.OLrzqt(this);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        AubY();
        C15157dyy.EZpvd.gEmmrt();
        UeEOUB();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        setRetainInstance(false);
        if (bundle != null) {
            DbNXlk();
        }
    }

    public final void OLrzqt(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DappNewWebFragment$toastWhenVisible$1(this, str, null), 3, null);
    }

    public final void valueOf(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DappNewWebFragment$toastWithSuccessWhenVisible$1(this, str, null), 3, null);
    }

    public final void AubY() {
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        Function0<Unit> function0 = new Function0() { // from class: o.dCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBW.getFieldNames(this.AEQbTJ);
            }
        };
        this.sSMYrx = function0;
        C15112dyF.AEQbTJ.EZpvd(function0);
        QfsBiF();
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh == null || (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) == null) {
            return;
        }
        dappBrowserMultiModeToolbar.setOnActionClickListener(new Function1() { // from class: o.dCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.OLrzqt(this.copydefault, (AbstractC13137dAe) obj);
            }
        });
    }

    public static final Unit getFieldNames(final dBW dbw) {
        C13241dEa mWebView;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
            mWebView.setOnTouchListener(new View.OnTouchListener() { // from class: o.dDp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return dBW.OLrzqt(this.AEQbTJ, view, motionEvent);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(final dBW dbw, android.view.View view, android.view.MotionEvent motionEvent) {
        view.postDelayed(new java.lang.Runnable() { // from class: o.dCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                dBW.getNewProxyInstance(this.KWHzl);
            }
        }, 500L);
        return false;
    }

    public static final void getNewProxyInstance(dBW dbw) {
        dbw.QUSxYX();
    }

    public static final Unit OLrzqt(final dBW dbw, AbstractC13137dAe abstractC13137dAe) {
        C13241dEa mWebView;
        Intrinsics.checkNotNullParameter(abstractC13137dAe, "");
        if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.Application.copydefault)) {
            dbw.KWHzl(true);
        } else if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.Activity.KWHzl)) {
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
                if (mWebView.canGoBack()) {
                    mWebView.goBack();
                }
                mWebView.postDelayed(new java.lang.Runnable() { // from class: o.dBT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dBW.iwGUEr(this.OLrzqt);
                    }
                }, 500L);
            }
        } else {
            if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.FragmentManager.AEQbTJ)) {
                C14742drG c14742drG = C14742drG.KWHzl;
                DappTabData dappTabDataUzCIH = dbw.uzCIH();
                c14742drG.OLrzqt("edit_website", dappTabDataUzCIH != null ? dappTabDataUzCIH.getMUrl() : null);
                android.content.Context context = dbw.getContext();
                if (context != null) {
                    dbw.startActivityForResult(new android.content.Intent(context, (java.lang.Class<?>) dIP.class), dbw.gEmmrt);
                }
            } else if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.Fragment.AEQbTJ)) {
                DappTabData dappTabDataUzCIH2 = dbw.uzCIH();
                if (dappTabDataUzCIH2 != null && dappTabDataUzCIH2.isConnectedByWalletConnect()) {
                    dbw.OLrzqt(dbw.getString(dLX.Dialog.hUfVAv));
                    return Unit.INSTANCE;
                }
                DappTabData dappTabDataUzCIH3 = dbw.uzCIH();
                if (dappTabDataUzCIH3 != null && dappTabDataUzCIH3.getOkxConnect()) {
                    return Unit.INSTANCE;
                }
                C14742drG c14742drG2 = C14742drG.KWHzl;
                DappTabData dappTabDataUzCIH4 = dbw.uzCIH();
                c14742drG2.OLrzqt("select_network", dappTabDataUzCIH4 != null ? dappTabDataUzCIH4.getMUrl() : null);
                AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> abstractC58260yxtGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
                final Function1 function1 = new Function1() { // from class: o.dBV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return dBW.copydefault(this.copydefault, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<InterfaceC9738bbJ>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dCd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        dBW.getFieldNames(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dCv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return dBW.gEmmrt((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtGEmmrt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dCB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        dBW.zLjUOn(function12, obj);
                    }
                });
            } else if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.Dialog.AEQbTJ)) {
                C14742drG c14742drG3 = C14742drG.KWHzl;
                DappTabData dappTabDataOLrzqt2 = C15112dyF.AEQbTJ.OLrzqt();
                c14742drG3.OLrzqt("tab", dappTabDataOLrzqt2 != null ? dappTabDataOLrzqt2.getMUrl() : null);
                C32866mlf.onEvent$default("app_metax_discover_browser_function_switch_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                dbw.QOLQEE();
            } else if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.StateListAnimator.AEQbTJ)) {
                C14843dtB.Companion.copydefault(new Function1() { // from class: o.dCP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return dBW.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue());
                    }
                }).show(dbw.getChildFragmentManager(), dBW.class.getName());
            } else if (Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.ActionBar.EZpvd)) {
                android.content.Context context2 = dbw.getContext();
                if (context2 != null) {
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("to", "DiscoverSearchHomeVC");
                    linkedHashMap.put("pageSource", "WebView");
                    java.lang.String str = dbw.OcIXYQ;
                    linkedHashMap.put("rootPage", str != null ? str : "");
                    Unit unit = Unit.INSTANCE;
                    c43056riA.copydefault(context2, "okluadiscover", "/discover/route", linkedHashMap);
                }
            } else {
                if (!Intrinsics.EZpvd(abstractC13137dAe, AbstractC13137dAe.TaskDescription.AEQbTJ)) {
                    throw new NoWhenBranchMatchedException();
                }
                android.content.Context context3 = dbw.getContext();
                if (context3 != null) {
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context3);
                    viewOnClickListenerC54939xaY.copydefault(dLX.Dialog.OxVOHk);
                    viewOnClickListenerC54939xaY.EZpvd(dLX.Dialog.QCjLjM, new View.OnClickListener() { // from class: o.dCV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            dBW.KWHzl(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.OLrzqt(dLX.Dialog.AEQbTJ, new View.OnClickListener() { // from class: o.dDh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            dBW.OLrzqt(viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(dBW dbw) {
        dbw.QUSxYX();
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final dBW dbw, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            java.lang.Long l = dbw.QKVWgx;
            Intrinsics.copydefault(l);
            dES.StateListAnimator.selectWallet$default(dbw, l, null, 2, null);
        } else {
            dbw.OLrzqt(new Function0() { // from class: o.dDt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dBW.uzCIH(this.AEQbTJ);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(dBW dbw) {
        java.lang.Long l = dbw.QKVWgx;
        Intrinsics.copydefault(l);
        dES.StateListAnimator.selectWallet$default(dbw, l, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(dBW dbw, int i) {
        C13241dEa mWebView;
        if (i == 1) {
            dbw.uzCIH = "";
            dbw.fARcdN = true;
            C32866mlf.onEvent$default("app_metax_discover_browser_function_refresh_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
                mWebView.reload();
            }
            C14742drG c14742drG = C14742drG.KWHzl;
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            c14742drG.OLrzqt("refresh", dappTabDataOLrzqt2 != null ? dappTabDataOLrzqt2.getMUrl() : null);
        } else if (i == 14) {
            C32866mlf.onEvent$default("Web3WalletDApp_DAppexplorer_Switchnetwork_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            dbw.AxsJAY();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(dBW dbw, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        c15112dyF.KWHzl((DappTabData) null);
        c15112dyF.AEQbTJ();
        dDI ddi = dbw.wlaJM;
        if (ddi != null) {
            ddi.AEQbTJ();
        }
        dbw.QfsBiF();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void removeTabViewOrClosePage$default(dBW dbw, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dbw.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        dDI ddi;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends DappTabData>) ((java.util.List<? extends java.lang.Object>) c15112dyF.djBIcL()), c15112dyF.OLrzqt());
        if (this.AwvSrB != null && (ddi = this.wlaJM) != null && ddi.isAdded() && iCopydefault >= 0 && iCopydefault < c15112dyF.djBIcL().size()) {
            OLrzqt(iCopydefault);
            c15112dyF.KWHzl(iCopydefault);
            dDI ddi2 = this.wlaJM;
            if (ddi2 != null) {
                getChildFragmentManager().beginTransaction().remove(ddi2).commitAllowingStateLoss();
                return;
            }
            return;
        }
        fJNWhG();
        if (z) {
            dDN.copydefault.OLrzqt();
        }
        DbNXlk();
    }

    public final void QfsBiF() {
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar2;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar3;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (dappBrowserMultiModeToolbar3 = abstractC13464dMh.AhwBna) != null) {
            dappBrowserMultiModeToolbar3.OLrzqt();
        }
        AbstractC13464dMh abstractC13464dMh2 = this.AubY;
        if (abstractC13464dMh2 != null && (dappBrowserMultiModeToolbar2 = abstractC13464dMh2.AhwBna) != null) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            dappBrowserMultiModeToolbar2.setAddTabEnable(c15112dyF.djBIcL().size() < c15112dyF.AhwBna());
        }
        AbstractC13464dMh abstractC13464dMh3 = this.AubY;
        if (abstractC13464dMh3 == null || (dappBrowserMultiModeToolbar = abstractC13464dMh3.AhwBna) == null) {
            return;
        }
        dappBrowserMultiModeToolbar.setDeleteAllEnable(true ^ C15112dyF.AEQbTJ.djBIcL().isEmpty());
    }

    public final void QUSxYX() {
        C13241dEa mWebView;
        AbstractC13464dMh abstractC13464dMh;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null || (abstractC13464dMh = this.AubY) == null || (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) == null) {
            return;
        }
        dappBrowserMultiModeToolbar.setGoBackEnable(mWebView.canGoBack());
    }

    private final void UeEOUB() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String url;
        java.lang.String string3;
        ConstraintLayout constraintLayout;
        C32866mlf.onEvent$default("app_metax_discover_browser_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        android.os.Bundle arguments = getArguments();
        this.AuCTel = arguments != null ? arguments.getBoolean("IS_FROM_FAST_ENTRANCE", false) : false;
        android.os.Bundle arguments2 = getArguments();
        this.isConnected = arguments2 != null ? arguments2.getBoolean("IS_FROM_OUT", false) : false;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("subdomainstrategy")) == null) {
            string = SubdomainStrategy.Global.INSTANCE.toString();
        }
        this.dxcTrN = string;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String str = "";
        if (arguments4 == null || (string2 = arguments4.getString("source")) == null) {
            string2 = "";
        }
        AEQbTJ(string2);
        android.os.Bundle arguments5 = getArguments();
        this.DTwDnp = arguments5 != null ? arguments5.getBoolean("showBottomNavigationView", false) : false;
        android.os.Bundle arguments6 = getArguments();
        this.OcIXYQ = arguments6 != null ? arguments6.getString("rootPage", null) : null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DappNewWebFragment$initData$1(this, null), 3, null);
        if (this.AuCTel) {
            QOLQEE();
        } else {
            android.os.Bundle arguments7 = getArguments();
            PlatformItem platformItem = arguments7 != null ? (PlatformItem) arguments7.getParcelable("item") : null;
            this.zsXlph = platformItem;
            this.RcXXUw = platformItem != null ? platformItem.getLogo() : null;
            PlatformItem platformItem2 = this.zsXlph;
            this.fFgQHt = platformItem2 != null ? platformItem2.getPlatform() : null;
            PlatformItem platformItem3 = this.zsXlph;
            if (platformItem3 == null) {
                this.fJNWhG = true;
                android.os.Bundle arguments8 = getArguments();
                if (arguments8 != null && (string3 = arguments8.getString("url")) != null) {
                    str = string3;
                }
                this.AxsJAY = str;
                this.zsXlph = new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, this.AxsJAY, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16127, (DefaultConstructorMarker) null);
            } else {
                this.fJNWhG = false;
                if (platformItem3 != null && (url = platformItem3.getUrl()) != null) {
                    str = url;
                }
                this.AxsJAY = str;
            }
            final int iEZpvd = C15112dyF.AEQbTJ.EZpvd(this.AxsJAY);
            android.view.View view = getView();
            if (view != null) {
                view.post(new java.lang.Runnable() { // from class: o.dCx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dBW.copydefault(iEZpvd, this);
                    }
                });
            }
        }
        pUU.KWHzl("dappwebview", "dapp web fragment oncreate");
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C6818aWZ.class, new java.lang.String[0]);
        final java.lang.Object obj = this.getNewProxyInstance;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<C6818aWZ>(obj) { // from class: com.okinc.business.defi.dapp.webview.DappNewWebFragment$initData$3
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C6818aWZ c6818aWZ) {
                C13241dEa c13241dEa;
                Intrinsics.checkNotNullParameter(c6818aWZ, "");
                if (this.this$0.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                    String strCopydefault = c6818aWZ.copydefault();
                    if (strCopydefault.length() <= 0 || (c13241dEa = this.this$0.AwvSrB) == null) {
                        return;
                    }
                    c13241dEa.loadUrl(strCopydefault);
                }
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(dIO.class, new java.lang.String[0]);
        final java.lang.Object obj2 = this.getNewProxyInstance;
        abstractC58185ywXKWHzl2.subscribe(new RxBus.EventCallback<dIO>(obj2) { // from class: com.okinc.business.defi.dapp.webview.DappNewWebFragment$initData$4
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(dIO dio) {
                Object objM7377constructorimpl;
                Intrinsics.checkNotNullParameter(dio, "");
                if (C33129mqd.OLrzqt((CharSequence) this.this$0.OcIXYQ)) {
                    if (Intrinsics.EZpvd((Object) this.this$0.OcIXYQ, (Object) dio.EZpvd()) || this.this$0.getParentFragment() == null) {
                        FragmentManager fragmentManagerZsXlph = this.this$0.zsXlph();
                        if (fragmentManagerZsXlph != null) {
                            FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, fragmentManagerZsXlph, null, 2, null).OLrzqt(this.this$0, new FragmentNavigator.Application(0, 0, 0, 0, false, false, null, null, false, false, PsExtractor.VIDEO_STREAM_MASK, null));
                            return;
                        }
                        return;
                    }
                    dBW dbw = this.this$0;
                    try {
                        Result.Application application = Result.Companion;
                        xWQ xwq = (xWQ) C43251rlk.copydefault(xWQ.class);
                        Fragment parentFragment = dbw.getParentFragment();
                        Intrinsics.copydefault(parentFragment);
                        xWQ.Activity activityAEQbTJ = xwq.AEQbTJ(parentFragment);
                        if (activityAEQbTJ != null) {
                            activityAEQbTJ.OLrzqt(false);
                        }
                        C15148dyp.copydefault.EZpvd(dbw, dbw.OcIXYQ);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        });
        C14923duc.EZpvd.EZpvd(new Function0() { // from class: o.dCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBW.hDKMBd(this.copydefault);
            }
        });
        java.lang.String str2 = this.OcIXYQ;
        if (str2 != null) {
            C15148dyp c15148dyp = C15148dyp.copydefault;
            Intrinsics.copydefault((java.lang.Object) str2);
            java.lang.String strOLrzqt = c15148dyp.OLrzqt(str2);
            if (strOLrzqt == null) {
                strOLrzqt = "default";
            }
            this.ORxRYg = strOLrzqt;
        }
        int iGEmmrt = Intrinsics.EZpvd((java.lang.Object) this.ORxRYg, (java.lang.Object) "default") ? C33570myu.gEmmrt(getContext()) : 0;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh == null || (constraintLayout = abstractC13464dMh.EZpvd) == null) {
            return;
        }
        constraintLayout.setPadding(0, iGEmmrt, 0, 0);
    }

    public static final void copydefault(int i, dBW dbw) {
        if (i >= 0) {
            dbw.OLrzqt(i, dbw.RcXXUw, dbw.fFgQHt);
            C15112dyF.AEQbTJ.KWHzl(i);
        } else {
            dbw.fetchVPNInfo();
        }
    }

    public static final Unit hDKMBd(dBW dbw) {
        ConstraintLayout constraintLayout;
        dDI ddi = dbw.wlaJM;
        if (ddi != null && ddi.isAdded()) {
            dbw.getChildFragmentManager().beginTransaction().remove(ddi).commitAllowingStateLoss();
            setHost$default(dbw, dbw.AxsJAY, false, 2, null);
        }
        AbstractC13464dMh abstractC13464dMh = dbw.AubY;
        if (abstractC13464dMh != null && (constraintLayout = abstractC13464dMh.OLrzqt) != null) {
            constraintLayout.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    public final androidx.fragment.app.FragmentManager zsXlph() {
        try {
            return getParentFragmentManager();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void fetchVPNInfo() {
        java.util.List<DappChains> arrayList;
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("chainid_default")) {
            android.os.Bundle arguments2 = getArguments();
            java.lang.Long lValueOf = arguments2 != null ? java.lang.Long.valueOf(arguments2.getLong("chainid_default", 1L)) : null;
            this.QKVWgx = lValueOf;
            C14923duc.EZpvd.EZpvd(this.AxsJAY, lValueOf != null ? lValueOf.longValue() : 1L);
        }
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str = "";
        if ((arguments3 != null ? arguments3.getSerializable("chains") : null) == null) {
            arrayList = new java.util.ArrayList<>();
        } else {
            android.os.Bundle arguments4 = getArguments();
            java.io.Serializable serializable = arguments4 != null ? arguments4.getSerializable("chains") : null;
            Intrinsics.copydefault(serializable, "");
            arrayList = (java.util.List) serializable;
        }
        this.AhwBna = arrayList;
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString("wallet_id")) != null) {
            str = string;
        }
        this.ejfBZ = str;
        AuCTel();
    }

    @Override // o.AbstractC14835dsu
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        java.util.List<androidx.fragment.app.Fragment> fragments = fragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.lang.Object objWlaJM = CollectionsKt___CollectionsKt.wlaJM(fragments);
        C15083dxd c15083dxd = objWlaJM instanceof C15083dxd ? (C15083dxd) objWlaJM : null;
        if (c15083dxd == null || !c15083dxd.isAdded()) {
            return;
        }
        fragmentManager.beginTransaction().hide(c15083dxd).commitAllowingStateLoss();
    }

    public final void AuCTel() {
        java.lang.String category;
        java.util.List<DappChains> list = this.AhwBna;
        if (list == null || list.isEmpty()) {
            PlatformItem platformItem = this.zsXlph;
            if ((platformItem != null ? java.lang.Long.valueOf(platformItem.getId()) : null) != null) {
                PlatformItem platformItem2 = this.zsXlph;
                if (platformItem2 == null || platformItem2.getId() != 0) {
                    QKVWgx();
                    C15059dxF c15059dxFHDKMBd = hDKMBd();
                    PlatformItem platformItem3 = this.zsXlph;
                    long id = platformItem3 != null ? platformItem3.getId() : 0L;
                    PlatformItem platformItem4 = this.zsXlph;
                    if (platformItem4 == null || (category = platformItem4.getCategory()) == null) {
                        category = "";
                    }
                    AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(c15059dxFHDKMBd.AEQbTJ(id, category), this), (Function1) null, 1, (java.lang.Object) null);
                    final Function1 function1 = new Function1() { // from class: o.dDg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return dBW.AEQbTJ(this.OLrzqt, (java.util.List) obj);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dDj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            dBW.getNewProxyInstance(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.dDi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return dBW.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dDk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            dBW.uzCIH(function12, obj);
                        }
                    });
                    return;
                }
            }
            this.AhwBna = C14923duc.EZpvd.isConnected();
        }
        if (this.QKVWgx == null) {
            this.QKVWgx = java.lang.Long.valueOf(C14923duc.EZpvd.EZpvd(this.AxsJAY, this.AhwBna, this.ejfBZ));
        }
        createWebView$default(this, false, 1, null);
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(dBW dbw, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            dbw.AhwBna = list;
        }
        if (dbw.QKVWgx == null) {
            dbw.QKVWgx = java.lang.Long.valueOf(C14923duc.EZpvd.EZpvd(dbw.AxsJAY, (java.util.List<DappChains>) list, dbw.ejfBZ));
        }
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dbw.valueOf.add(java.lang.Long.valueOf(((DappChains) it.next()).getChainId()));
        }
        createWebView$default(dbw, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(dBW dbw, java.lang.Throwable th) {
        C14923duc c14923duc = C14923duc.EZpvd;
        java.util.List<DappChains> listIsConnected = c14923duc.isConnected();
        dbw.AhwBna = listIsConnected;
        if (dbw.QKVWgx == null) {
            dbw.QKVWgx = java.lang.Long.valueOf(c14923duc.EZpvd(dbw.AxsJAY, listIsConnected, dbw.ejfBZ));
        }
        createWebView$default(dbw, false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // o.dES
    public C13241dEa EZpvd(boolean z) {
        this.fJNWhG = true;
        this.AxsJAY = "";
        this.zsXlph = new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, this.AxsJAY, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16127, (DefaultConstructorMarker) null);
        return copydefault(z);
    }

    public static /* synthetic */ C13241dEa createWebView$default(dBW dbw, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dbw.copydefault(z);
    }

    public final C13241dEa copydefault(boolean z) {
        C13241dEa c13241dEaFARcdN = fARcdN();
        OLrzqt(this.QKVWgx, z);
        KWHzl(this.QKVWgx, "", ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(this.ejfBZ));
        return c13241dEaFARcdN;
    }

    public static /* synthetic */ void addWebView$default(dBW dbw, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        dbw.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        ConstraintLayout constraintLayout;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        C13241dEa c13241dEa = this.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.setLayoutParams(layoutParams);
        }
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (constraintLayout = abstractC13464dMh.OLrzqt) != null) {
            if (z) {
                constraintLayout.removeAllViews();
                C13241dEa c13241dEa2 = this.AwvSrB;
                if ((c13241dEa2 != null ? c13241dEa2.getParent() : null) instanceof android.view.ViewGroup) {
                    C13241dEa c13241dEa3 = this.AwvSrB;
                    android.view.ViewParent parent = c13241dEa3 != null ? c13241dEa3.getParent() : null;
                    Intrinsics.copydefault(parent, "");
                    ((android.view.ViewGroup) parent).removeAllViews();
                }
            }
            C13241dEa c13241dEa4 = this.AwvSrB;
            if (c13241dEa4 != null) {
                constraintLayout.addView(c13241dEa4);
            }
            C13241dEa c13241dEa5 = this.AwvSrB;
            if (c13241dEa5 != null) {
                c13241dEa5.resumeTimers();
            }
            C13241dEa c13241dEa6 = this.AwvSrB;
            if (c13241dEa6 != null) {
                c13241dEa6.onResume();
            }
        }
        C15112dyF.AEQbTJ.KWHzl(uzCIH());
    }

    public static /* synthetic */ void setHost$default(dBW dbw, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dbw.EZpvd(str, z);
    }

    public final void EZpvd(java.lang.String str, boolean z) {
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        if (str == null || str.length() == 0) {
            return;
        }
        dDI ddi = this.wlaJM;
        if (ddi == null || !ddi.isAdded() || z) {
            java.lang.String strKWHzl = C14923duc.EZpvd.KWHzl(str);
            if (C59449zhJ.startsWith$default(strKWHzl, "www.", false, 2, null)) {
                strKWHzl = strKWHzl.substring(4);
                Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
            }
            OcIXYQ();
            AbstractC13464dMh abstractC13464dMh = this.AubY;
            if (abstractC13464dMh == null || (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) == null) {
                return;
            }
            dappBrowserMultiModeToolbar.setUrl(strKWHzl);
        }
    }

    public final C13241dEa fARcdN() {
        KWHzl(new DappTabData());
        dDN ddn = dDN.copydefault;
        ddn.KWHzl(uzCIH());
        DappTabData dappTabDataUzCIH = uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setMUrl(this.AxsJAY);
        }
        try {
            DappTabData dappTabDataUzCIH2 = uzCIH();
            if (dappTabDataUzCIH2 != null) {
                DappTabData dappTabDataUzCIH3 = uzCIH();
                java.lang.String str = this.dxcTrN;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.copydefault(fragmentActivityRequireActivity, "");
                dappTabDataUzCIH2.setMWebView(ddn.copydefault(dappTabDataUzCIH3, str, new WeakReference<>(fragmentActivityRequireActivity), this));
            }
        } catch (java.lang.Exception unused) {
            fIwbmz();
        }
        DappTabData dappTabDataUzCIH4 = uzCIH();
        if (dappTabDataUzCIH4 != null) {
            dappTabDataUzCIH4.setWebViewUiMode(C14923duc.EZpvd.AYXKKw(this.AxsJAY) != null ? 1 : 2);
        }
        DappTabData dappTabDataUzCIH5 = uzCIH();
        if (dappTabDataUzCIH5 != null) {
            dappTabDataUzCIH5.setMItem(this.zsXlph);
        }
        DappTabData dappTabDataUzCIH6 = uzCIH();
        if (dappTabDataUzCIH6 != null) {
            java.lang.String logo = this.RcXXUw;
            if (logo == null) {
                PlatformItem platformItem = this.zsXlph;
                logo = platformItem != null ? platformItem.getLogo() : null;
            }
            dappTabDataUzCIH6.setSplashLogo(logo);
        }
        DappTabData dappTabDataUzCIH7 = uzCIH();
        if (dappTabDataUzCIH7 != null) {
            java.lang.String platform = this.fFgQHt;
            if (platform == null) {
                PlatformItem platformItem2 = this.zsXlph;
                platform = platformItem2 != null ? platformItem2.getPlatform() : null;
            }
            dappTabDataUzCIH7.setSplashTitle(platform);
        }
        DappTabData dappTabDataUzCIH8 = uzCIH();
        if (dappTabDataUzCIH8 != null) {
            dappTabDataUzCIH8.setMChainList(this.AhwBna);
        }
        if (this.valueOf.isEmpty()) {
            KWHzl(this.AxsJAY);
        } else {
            DappTabData dappTabDataUzCIH9 = uzCIH();
            if (dappTabDataUzCIH9 != null) {
                dappTabDataUzCIH9.setChainIdList(this.valueOf);
            }
        }
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataUzCIH10 = uzCIH();
        Intrinsics.copydefault(dappTabDataUzCIH10);
        c15112dyF.AEQbTJ(dappTabDataUzCIH10);
        SPUtils.put("LAST_TAB", 0);
        QfsBiF();
        DappTabData dappTabDataUzCIH11 = uzCIH();
        this.AwvSrB = dappTabDataUzCIH11 != null ? dappTabDataUzCIH11.getMWebView() : null;
        DappTabData dappTabDataUzCIH12 = uzCIH();
        if (dappTabDataUzCIH12 != null) {
            return dappTabDataUzCIH12.getMWebView();
        }
        return null;
    }

    public final void KWHzl(java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(hDKMBd().OLrzqt(str), this), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.dBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.KWHzl(this.AEQbTJ, (DappInfoByUrl) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dBW.iwGUEr(function1, obj);
            }
        });
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(dBW dbw, DappInfoByUrl dappInfoByUrl) {
        C13241dEa c13241dEa;
        C13273dFf c13273dFfQUSxYX;
        C13241dEa c13241dEa2;
        dGQ dgqGEmmrt;
        java.util.ArrayList<java.lang.Long> chainIdList = dappInfoByUrl.getChainIdList();
        if (chainIdList == null) {
            chainIdList = new java.util.ArrayList<>();
        }
        dbw.valueOf = chainIdList;
        DappTabData dappTabDataUzCIH = dbw.uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setChainIdList(dappInfoByUrl.getChainIdList());
        }
        if (dbw.QKVWgx == null && (!dbw.valueOf.isEmpty())) {
            InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
            java.lang.Long l = dbw.valueOf.get(0);
            Intrinsics.checkNotNullExpressionValue(l, "");
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault, l.longValue(), false, 2, null);
            if (chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.fIwbmz() && (c13241dEa2 = dbw.AwvSrB) != null && (dgqGEmmrt = c13241dEa2.gEmmrt()) != null) {
                dgqGEmmrt.EZpvd(dbw.valueOf.get(0));
            }
        }
        if (dbw.QKVWgx == null && (!dbw.valueOf.isEmpty())) {
            InterfaceC9737bbI interfaceC9737bbICopydefault2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
            java.lang.Long l2 = dbw.valueOf.get(0);
            Intrinsics.checkNotNullExpressionValue(l2, "");
            InterfaceC9731bbC chainMetaWithRealChainId$default2 = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault2, l2.longValue(), false, 2, null);
            if (chainMetaWithRealChainId$default2 != null && chainMetaWithRealChainId$default2.fARcdN() && (c13241dEa = dbw.AwvSrB) != null && (c13273dFfQUSxYX = c13241dEa.QUSxYX()) != null) {
                c13273dFfQUSxYX.copydefault(dbw.valueOf.get(0).longValue());
            }
        }
        return Unit.INSTANCE;
    }

    public final C55173xeu values() {
        if (getContext() == null) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55173xeu c55173xeu = new C55173xeu(contextRequireContext, null, 0, 6, null);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = c55173xeu.copydefault().getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.topMargin = C55298xhM.dpInt$default(84, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        c55173xeu.setLayoutParams(layoutParams);
        c55173xeu.setImage(dLX.ActionBar.AEQbTJ);
        if (C43396roW.EZpvd().AYXKKw().booleanValue()) {
            PlatformItem platformItem = this.zsXlph;
            if (platformItem != null && platformItem.getId() == 0) {
                java.lang.String string = getString(dLX.Dialog.Dmq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setTitle(string);
                java.lang.String string2 = getString(dLX.Dialog.igXuih);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            } else {
                java.lang.String string3 = getString(dLX.Dialog.Dmq);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c55173xeu.setTitle(string3);
                java.lang.String string4 = getString(dLX.Dialog.fERRXa);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                c55173xeu.setSubTitle((java.lang.CharSequence) string4);
            }
        } else {
            java.lang.String string5 = getString(dLX.Dialog.zblBkD);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            c55173xeu.setTitle(string5);
            java.lang.String string6 = getString(dLX.Dialog.fdOvFl);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string6);
        }
        java.lang.String string7 = getString(dLX.Dialog.fjfviF);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        c55173xeu.setRetry(string7);
        c55173xeu.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.registerUser));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.dCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dBW.KWHzl(this.copydefault, view);
            }
        });
        return c55173xeu;
    }

    public static final void KWHzl(dBW dbw, android.view.View view) {
        C13241dEa c13241dEa = dbw.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.reload();
        }
    }

    public final void QKVWgx() {
        android.view.View view;
        DappTabData dappTabDataUzCIH = uzCIH();
        if ((dappTabDataUzCIH == null || !(dappTabDataUzCIH.getHasShownSplashScreen() || dappTabDataUzCIH.isLoaded())) && (view = this.aKErDB) != null) {
            if (view.getVisibility() == 0) {
                if (dappTabDataUzCIH == null || this.djSkpj != null) {
                    return;
                }
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.dCb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dBW.wlaJM(this.copydefault);
                    }
                };
                this.djSkpj = runnable;
                android.view.View view2 = this.aKErDB;
                if (view2 != null) {
                    view2.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
                    return;
                }
                return;
            }
            view.setVisibility(0);
            this.dNCPSb = java.lang.System.currentTimeMillis();
            this.UeEOUB = 0;
            PlatformItem platformItem = this.zsXlph;
            if ((platformItem != null ? platformItem.getId() : 0L) != 0) {
                android.widget.FrameLayout frameLayout = this.QVAiDq;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                android.widget.TextView textView = this.QfsBiF;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                C55113xdn c55113xdn = this.dvKsVJ;
                if (c55113xdn != null) {
                    c55113xdn.setVisibility(8);
                }
                java.lang.String splashLogo = this.RcXXUw;
                if (splashLogo == null) {
                    DappTabData dappTabDataUzCIH2 = uzCIH();
                    splashLogo = dappTabDataUzCIH2 != null ? dappTabDataUzCIH2.getSplashLogo() : null;
                    if (splashLogo == null) {
                        PlatformItem platformItem2 = this.zsXlph;
                        splashLogo = platformItem2 != null ? platformItem2.getLogo() : null;
                    }
                }
                android.widget.ImageView imageView = this.QbewEr;
                if (imageView != null) {
                    Glide.KWHzl(imageView).EZpvd(splashLogo).AEQbTJ(new C5405Ql(), new C5417Qx(C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null))).EZpvd(imageView);
                }
                LottieAnimationView lottieAnimationView = this.RJOkX;
                if (lottieAnimationView != null) {
                    try {
                        lottieAnimationView.setFailureListener(new LottieListener() { // from class: o.dBX
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.airbnb.lottie.LottieListener
                            public final void onResult(java.lang.Object obj) {
                                dBW.fetchVPNInfo((java.lang.Throwable) obj);
                            }
                        });
                        lottieAnimationView.setAnimationFromUrl(C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/lottie/web3_discover/dapp_splash_screen_loading.lottie");
                        lottieAnimationView.setRepeatCount(-1);
                        lottieAnimationView.playAnimation();
                    } catch (java.lang.Exception e) {
                        pUU.copydefault("DappSplashScreen", "Lottie error: " + e.getMessage());
                    }
                }
                android.widget.TextView textView2 = this.QfsBiF;
                if (textView2 != null) {
                    java.lang.String splashTitle = this.fFgQHt;
                    if (splashTitle == null) {
                        DappTabData dappTabDataUzCIH3 = uzCIH();
                        splashTitle = dappTabDataUzCIH3 != null ? dappTabDataUzCIH3.getSplashTitle() : null;
                        if (splashTitle == null) {
                            PlatformItem platformItem3 = this.zsXlph;
                            java.lang.String platform = platformItem3 != null ? platformItem3.getPlatform() : null;
                            splashTitle = platform != null ? platform : "";
                        }
                    }
                    textView2.setText(splashTitle);
                }
            } else {
                android.widget.FrameLayout frameLayout2 = this.QVAiDq;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                android.widget.TextView textView3 = this.QfsBiF;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                C55113xdn c55113xdn2 = this.dvKsVJ;
                if (c55113xdn2 != null) {
                    c55113xdn2.setVisibility(0);
                }
                C55113xdn c55113xdn3 = this.dvKsVJ;
                if (c55113xdn3 != null) {
                    c55113xdn3.KWHzl(0L);
                }
            }
            if (dappTabDataUzCIH != null) {
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.dCa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dBW.AxsJAY(this.OLrzqt);
                    }
                };
                this.djSkpj = runnable2;
                android.view.View view3 = this.aKErDB;
                if (view3 != null) {
                    view3.postDelayed(runnable2, WorkRequest.MIN_BACKOFF_MILLIS);
                }
            }
        }
    }

    public static final void wlaJM(dBW dbw) {
        dbw.copydefault("timeout");
    }

    public static final void fetchVPNInfo(java.lang.Throwable th) {
        pUU.AEQbTJ("DappSplashScreen", "Lottie load failed: " + (th != null ? th.getMessage() : null), th);
    }

    public static final void AxsJAY(dBW dbw) {
        dbw.copydefault("timeout");
    }

    public static /* synthetic */ void dismissSplashScreen$default(dBW dbw, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "unknown";
        }
        dbw.copydefault(str);
    }

    public final void copydefault(java.lang.String str) {
        android.view.View view;
        if (this.dNCPSb > 0) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.dNCPSb;
            int i = this.UeEOUB;
            DappTabData dappTabDataUzCIH = uzCIH();
            pUU.KWHzl("DappSplashScreen", "dismissed | source=" + str + " | duration=" + (jCurrentTimeMillis - j) + "ms | maxProgress=" + i + " | url=" + (dappTabDataUzCIH != null ? dappTabDataUzCIH.getMUrl() : null));
            this.dNCPSb = 0L;
        }
        DappTabData dappTabDataUzCIH2 = uzCIH();
        if (dappTabDataUzCIH2 != null) {
            dappTabDataUzCIH2.setHasShownSplashScreen(true);
        }
        android.view.View view2 = this.aKErDB;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView = this.RJOkX;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        C55113xdn c55113xdn = this.dvKsVJ;
        if (c55113xdn != null) {
            c55113xdn.copydefault();
        }
        java.lang.Runnable runnable = this.djSkpj;
        if (runnable != null && (view = this.aKErDB) != null) {
            view.removeCallbacks(runnable);
        }
        this.djSkpj = null;
    }

    public final void RJOkX() {
        java.lang.String url;
        DappTabData dappTabDataUzCIH = uzCIH();
        if ((dappTabDataUzCIH != null ? dappTabDataUzCIH.getAaPromptFlag() : null) == null) {
            C15059dxF c15059dxFHDKMBd = hDKMBd();
            C13241dEa c13241dEa = this.AwvSrB;
            if (c13241dEa == null || (url = c13241dEa.getUrl()) == null) {
                url = "";
            }
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(c15059dxFHDKMBd.OLrzqt(url), this), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.dCA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.OLrzqt(this.AEQbTJ, (DappInfoByUrl) obj);
                }
            };
            abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dCz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.OcIXYQ(function1, obj);
                }
            });
            return;
        }
        DappTabData dappTabDataUzCIH2 = uzCIH();
        if (dappTabDataUzCIH2 == null || !Intrinsics.EZpvd(dappTabDataUzCIH2.getAaPromptFlag(), java.lang.Boolean.TRUE)) {
            return;
        }
        djBIcL();
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(dBW dbw, DappInfoByUrl dappInfoByUrl) {
        if (dappInfoByUrl.getAaPromptFlag()) {
            dbw.djBIcL();
        }
        DappTabData dappTabDataUzCIH = dbw.uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setAaPromptFlag(java.lang.Boolean.valueOf(dappInfoByUrl.getAaPromptFlag()));
        }
        return Unit.INSTANCE;
    }

    public final void QbewEr() {
        C13241dEa mWebView;
        if (this.zuBGHE || !isAdded() || C48787ucK.AEQbTJ.AEQbTJ("dappTranslate.showTranslateTips", 1) == 1) {
            return;
        }
        this.zuBGHE = true;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt != null && dappTabDataOLrzqt.getHasShowTranslateReminder()) {
            C14923duc c14923duc = C14923duc.EZpvd;
            if (c14923duc.fJNWhG() && c14923duc.fIwbmz()) {
                return;
            }
        }
        DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null) {
            return;
        }
        mWebView.OLrzqt(new Function1() { // from class: o.dDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.AhwBna(this.KWHzl, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AhwBna(final dBW dbw, java.lang.String str) {
        java.lang.String url;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null), (java.lang.Object) MnemonicKt.MnemonicLanguageEnglish)) {
            pSC psc = pSC.AEQbTJ;
            if (Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.CHINESE) || Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.SIMPLIFIED_CHINESE)) {
                C15112dyF c15112dyF = C15112dyF.AEQbTJ;
                DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
                if ((dappTabDataOLrzqt != null && dappTabDataOLrzqt.getHasShowTranslateReminder()) || C14923duc.EZpvd.fJNWhG()) {
                    return Unit.INSTANCE;
                }
                DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt2 != null) {
                    dappTabDataOLrzqt2.setHasShowTranslateReminder(true);
                }
                C14742drG c14742drG = C14742drG.KWHzl;
                C13241dEa c13241dEa = dbw.AwvSrB;
                if (c13241dEa == null || (url = c13241dEa.getUrl()) == null) {
                    url = "";
                }
                c14742drG.EZpvd("show", url);
                if (dbw.getContext() == null) {
                    return Unit.INSTANCE;
                }
                android.content.Context contextRequireContext = dbw.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                final OKAlertBanner oKAlertBanner = new OKAlertBanner(contextRequireContext, null, 0, 6, null);
                oKAlertBanner.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                oKAlertBanner.setTitle(C33070mpX.AYXKKw(dLX.Dialog.fJNWhG));
                oKAlertBanner.setType(4);
                oKAlertBanner.setStyle(0);
                oKAlertBanner.setMessage(C33070mpX.AYXKKw(dLX.Dialog.AuCTel));
                oKAlertBanner.OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.dDc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        dBW.OLrzqt(oKAlertBanner, view);
                    }
                });
                oKAlertBanner.setPrimaryAction(C33070mpX.AYXKKw(dLX.Dialog.fetchVPNInfo), new Function0() { // from class: o.dDe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dBW.EZpvd(this.KWHzl, oKAlertBanner);
                    }
                });
                oKAlertBanner.setSecondaryAction(C33070mpX.AYXKKw(dLX.Dialog.DbNXlk), new Function0() { // from class: o.dDb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dBW.copydefault(oKAlertBanner);
                    }
                });
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.dDf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dBW.copydefault(this.AEQbTJ, oKAlertBanner);
                    }
                }, WorkRequest.MIN_BACKOFF_MILLIS);
                AbstractC13464dMh abstractC13464dMh = dbw.AubY;
                if (abstractC13464dMh != null && (constraintLayout = abstractC13464dMh.OLrzqt) != null) {
                    constraintLayout.addView(oKAlertBanner);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(OKAlertBanner oKAlertBanner, android.view.View view) {
        if (oKAlertBanner.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = oKAlertBanner.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(oKAlertBanner);
        }
        C14742drG.KWHzl.OLrzqt(EopTrackEvent.CLOSE);
    }

    public static final Unit EZpvd(dBW dbw, OKAlertBanner oKAlertBanner) {
        C13241dEa c13241dEa = dbw.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.QKudOq();
        }
        if (oKAlertBanner.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = oKAlertBanner.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(oKAlertBanner);
        }
        C14742drG.KWHzl.OLrzqt("translate_now");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(OKAlertBanner oKAlertBanner) {
        if (oKAlertBanner.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = oKAlertBanner.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(oKAlertBanner);
        }
        C14742drG.KWHzl.OLrzqt("dont_show_again");
        C14923duc.EZpvd.sSMYrx();
        return Unit.INSTANCE;
    }

    public static final void copydefault(dBW dbw, OKAlertBanner oKAlertBanner) {
        if (dbw.isAdded() && (oKAlertBanner.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = oKAlertBanner.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(oKAlertBanner);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void djBIcL() {
        ConstraintLayout constraintLayout;
        if (getContext() == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final OKReminder oKReminder = new OKReminder(contextRequireContext, null, 0, 6, null);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.setMarginStart(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams.setMarginEnd(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams.topToTop = 0;
        oKReminder.setLayoutParams(layoutParams);
        oKReminder.setStyle(2);
        oKReminder.setMessage(getString(dLX.Dialog.EZpvd));
        oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.dDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBW.copydefault(oKReminder);
            }
        });
        oKReminder.setReminderBackground(new ColorDrawable(ContextCompat.getColor(requireContext(), C52761wXj.Activity.registerUser)));
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (constraintLayout = abstractC13464dMh.OLrzqt) != null) {
            constraintLayout.addView(oKReminder);
        }
        DappTabData dappTabDataUzCIH = uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setHasShowAATips(true);
        }
        this.QOLQEE = oKReminder;
    }

    public static final Unit copydefault(OKReminder oKReminder) {
        if (oKReminder.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = oKReminder.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(oKReminder);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setWebViewListener$default(dBW dbw, java.lang.Long l, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        dbw.OLrzqt(l, z);
    }

    public final void OLrzqt(java.lang.Long l, boolean z) {
        java.lang.String url;
        java.lang.Object next;
        C13241dEa c13241dEa;
        dGQ dgqGEmmrt;
        C13241dEa c13241dEa2;
        C13273dFf c13273dFfQUSxYX;
        C13241dEa c13241dEa3;
        java.lang.String mUrl;
        C13241dEa c13241dEa4;
        C13273dFf c13273dFfQUSxYX2;
        C13241dEa c13241dEa5;
        dGQ dgqGEmmrt2;
        C13241dEa c13241dEa6;
        dGQ dgqRcXXUw;
        if (SPUtils.getBoolean("BUGLY_DEV_DEVICE", false)) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(true);
        }
        if (l == null) {
            DappTabData dappTabDataUzCIH = uzCIH();
            if (dappTabDataUzCIH != null) {
                java.lang.Long l2 = this.QKVWgx;
                DappTabData.setCurrentChain$default(dappTabDataUzCIH, l2 != null ? l2.longValue() : 1L, null, 2, null);
            }
        } else {
            DappTabData dappTabDataUzCIH2 = uzCIH();
            if (dappTabDataUzCIH2 != null) {
                DappTabData.setCurrentChain$default(dappTabDataUzCIH2, l.longValue(), null, 2, null);
            }
        }
        C13241dEa c13241dEa7 = this.AwvSrB;
        if (c13241dEa7 != null) {
            c13241dEa7.setOnReceiveIcon(new Function1() { // from class: o.dCf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.AEQbTJ(this.copydefault, (android.graphics.Bitmap) obj);
                }
            });
        }
        C13241dEa c13241dEa8 = this.AwvSrB;
        if (c13241dEa8 != null) {
            c13241dEa8.setOnReceiveTitle(new Function1() { // from class: o.dCg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.copydefault(this.copydefault, (java.lang.String) obj);
                }
            });
        }
        C13241dEa c13241dEa9 = this.AwvSrB;
        if (c13241dEa9 != null) {
            c13241dEa9.setShouldOverrideUrl(new Function1() { // from class: o.dCe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.valueOf(this.EZpvd, (java.lang.String) obj);
                }
            });
        }
        C13241dEa c13241dEa10 = this.AwvSrB;
        if (c13241dEa10 != null) {
            c13241dEa10.setOnProgressChangedListener(new Function1() { // from class: o.dCc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        C13241dEa c13241dEa11 = this.AwvSrB;
        if (c13241dEa11 != null) {
            c13241dEa11.setOnRequestAccountListener(new Function0() { // from class: o.dCh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dBW.gEmmrt();
                }
            });
        }
        C13241dEa c13241dEa12 = this.AwvSrB;
        if (c13241dEa12 != null) {
            c13241dEa12.setOnConnectedWalletByJumpUrl(new Function2() { // from class: o.dCj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return dBW.AEQbTJ(this.KWHzl, (java.lang.String) obj, (java.lang.Long) obj2);
                }
            });
        }
        C13241dEa c13241dEa13 = this.AwvSrB;
        if (c13241dEa13 != null) {
            c13241dEa13.setOnShowFileChooserListener(new Function2() { // from class: o.dCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return dBW.KWHzl(this.AEQbTJ, (android.webkit.ValueCallback) obj, (android.content.Intent) obj2);
                }
            });
        }
        C13241dEa c13241dEa14 = this.AwvSrB;
        if (c13241dEa14 != null) {
            c13241dEa14.setShowOrHideError(new Function1() { // from class: o.dCi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        C13241dEa c13241dEa15 = this.AwvSrB;
        if (c13241dEa15 != null) {
            c13241dEa15.setWebViewLoadListener(new Application());
        }
        if (!this.fJNWhG) {
            copydefault(this.zsXlph);
        }
        PlatformItem platformItem = this.zsXlph;
        java.lang.String str = "";
        if (platformItem == null || (url = platformItem.getUrl()) == null) {
            url = "";
        }
        setHost$default(this, url, false, 2, null);
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long jFetchVPNInfo = ((InterfaceC9731bbC) next).fetchVPNInfo();
            if (l != null && jFetchVPNInfo == l.longValue()) {
                break;
            }
        }
        if (next != null && (c13241dEa6 = this.AwvSrB) != null && (dgqRcXXUw = c13241dEa6.RcXXUw()) != null) {
            dgqRcXXUw.AEQbTJ(this.QKVWgx);
        }
        if (this.QKVWgx == null) {
            if (!this.valueOf.isEmpty()) {
                InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
                java.lang.Long l3 = this.valueOf.get(0);
                Intrinsics.checkNotNullExpressionValue(l3, "");
                InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault, l3.longValue(), false, 2, null);
                if (chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.fIwbmz() && (c13241dEa5 = this.AwvSrB) != null && (dgqGEmmrt2 = c13241dEa5.gEmmrt()) != null) {
                    dgqGEmmrt2.EZpvd(this.valueOf.get(0));
                }
            }
        } else {
            InterfaceC9737bbI interfaceC9737bbICopydefault2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
            java.lang.Long l4 = this.QKVWgx;
            InterfaceC9731bbC chainMetaWithRealChainId$default2 = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault2, l4 != null ? l4.longValue() : 1L, false, 2, null);
            if (chainMetaWithRealChainId$default2 != null && chainMetaWithRealChainId$default2.fIwbmz() && (c13241dEa = this.AwvSrB) != null && (dgqGEmmrt = c13241dEa.gEmmrt()) != null) {
                long j = this.QKVWgx;
                if (j == null) {
                    j = 637L;
                }
                dgqGEmmrt.EZpvd(j);
            }
        }
        if (this.QKVWgx == null) {
            if (!this.valueOf.isEmpty()) {
                InterfaceC9737bbI interfaceC9737bbICopydefault3 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
                java.lang.Long l5 = this.valueOf.get(0);
                Intrinsics.checkNotNullExpressionValue(l5, "");
                InterfaceC9731bbC chainMetaWithRealChainId$default3 = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault3, l5.longValue(), false, 2, null);
                if (chainMetaWithRealChainId$default3 != null && chainMetaWithRealChainId$default3.fARcdN() && (c13241dEa4 = this.AwvSrB) != null && (c13273dFfQUSxYX2 = c13241dEa4.QUSxYX()) != null) {
                    c13273dFfQUSxYX2.copydefault(this.valueOf.get(0).longValue());
                }
            }
        } else {
            InterfaceC9737bbI interfaceC9737bbICopydefault4 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
            java.lang.Long l6 = this.QKVWgx;
            InterfaceC9731bbC chainMetaWithRealChainId$default4 = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault4, l6 != null ? l6.longValue() : 1L, false, 2, null);
            if (chainMetaWithRealChainId$default4 != null && chainMetaWithRealChainId$default4.fARcdN() && (c13241dEa2 = this.AwvSrB) != null && (c13273dFfQUSxYX = c13241dEa2.QUSxYX()) != null) {
                java.lang.Long l7 = this.QKVWgx;
                c13273dFfQUSxYX.copydefault(l7 != null ? l7.longValue() : 501L);
            }
        }
        OLrzqt(z);
        DappTabData dappTabDataUzCIH3 = uzCIH();
        if (dappTabDataUzCIH3 != null) {
            dappTabDataUzCIH3.setMUrl(this.AxsJAY);
        }
        DappTabData dappTabDataUzCIH4 = uzCIH();
        if (dappTabDataUzCIH4 != null && !dappTabDataUzCIH4.isLoaded()) {
            QKVWgx();
            DappTabData dappTabDataUzCIH5 = uzCIH();
            if (!android.text.TextUtils.isEmpty(dappTabDataUzCIH5 != null ? dappTabDataUzCIH5.getMUrl() : null) && (c13241dEa3 = this.AwvSrB) != null) {
                DappTabData dappTabDataUzCIH6 = uzCIH();
                if (dappTabDataUzCIH6 != null && (mUrl = dappTabDataUzCIH6.getMUrl()) != null) {
                    str = mUrl;
                }
                c13241dEa3.loadUrl(str);
            }
            DappTabData dappTabDataUzCIH7 = uzCIH();
            if (dappTabDataUzCIH7 != null) {
                dappTabDataUzCIH7.setLoaded(true);
                return;
            }
            return;
        }
        QKVWgx();
        android.view.View view = this.aKErDB;
        if (view != null) {
            view.postDelayed(new java.lang.Runnable() { // from class: o.dCk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dBW.zsXlph(this.OLrzqt);
                }
            }, 500L);
        }
    }

    public static final Unit AEQbTJ(dBW dbw, android.graphics.Bitmap bitmap) {
        DappTabData dappTabDataUzCIH = dbw.uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.getMIcon();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(dBW dbw, java.lang.String str) {
        PlatformItem mItem;
        java.lang.String url;
        java.lang.String url2;
        java.lang.String url3;
        C13241dEa c13241dEa = dbw.AwvSrB;
        java.lang.String strWlaJM = c13241dEa != null ? c13241dEa.wlaJM() : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strWlaJM)) {
            strWlaJM = null;
        }
        if (strWlaJM == null) {
            strWlaJM = str;
        }
        DappTabData dappTabDataUzCIH = dbw.uzCIH();
        if (dappTabDataUzCIH != null && (mItem = dappTabDataUzCIH.getMItem()) != null) {
            java.lang.String str2 = "";
            if (mItem.getId() == 0) {
                DappTabData dappTabDataUzCIH2 = dbw.uzCIH();
                if ((dappTabDataUzCIH2 != null ? dappTabDataUzCIH2.getMTitle() : null) == null) {
                    C14923duc c14923duc = C14923duc.EZpvd;
                    mItem.setLogo(c14923duc.AEQbTJ(mItem.getUrl()));
                    mItem.setPlatform(strWlaJM == null ? "" : strWlaJM);
                    DappTabData dappTabDataUzCIH3 = dbw.uzCIH();
                    if (dappTabDataUzCIH3 == null || (url2 = dappTabDataUzCIH3.getOriginUrl()) == null) {
                        url2 = mItem.getUrl();
                    }
                    mItem.setUrl(url2);
                    java.lang.String url4 = mItem.getUrl();
                    if (url4 == null || url4.length() == 0) {
                        C13241dEa c13241dEa2 = dbw.AwvSrB;
                        if (c13241dEa2 == null || (url3 = c13241dEa2.getUrl()) == null) {
                            url3 = "";
                        }
                        mItem.setUrl(url3);
                    }
                    c14923duc.AEQbTJ(c14923duc.OLrzqt(mItem));
                }
            }
            FragmentActivity activity = dbw.getActivity();
            if (activity != null) {
                C14923duc c14923duc2 = C14923duc.EZpvd;
                C13241dEa c13241dEa3 = dbw.AwvSrB;
                if (c13241dEa3 != null && (url = c13241dEa3.getUrl()) != null) {
                    str2 = url;
                }
                C14923duc.checkUrl$default(c14923duc2, activity, str2, strWlaJM, "2", null, java.lang.Boolean.FALSE, null, null, null, null, new yHO() { // from class: o.dDs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return dBW.AEQbTJ(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                    }
                }, 960, null);
            }
        }
        DappTabData dappTabDataUzCIH4 = dbw.uzCIH();
        if (dappTabDataUzCIH4 != null) {
            dappTabDataUzCIH4.setMTitle(strWlaJM);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(dBW dbw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(str, "blob:", false, 2, null)) {
            setHost$default(dbw, str, false, 2, null);
            DappTabData dappTabDataUzCIH = dbw.uzCIH();
            if (dappTabDataUzCIH != null) {
                dappTabDataUzCIH.setMUrl(str);
            }
            dbw.KWHzl(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final dBW dbw, int i) {
        android.widget.ProgressBar progressBar;
        AbstractC13464dMh abstractC13464dMh;
        DappTabData dappTabDataUzCIH;
        C13241dEa c13241dEa;
        android.widget.ProgressBar progressBar2;
        android.widget.ProgressBar progressBar3;
        dDI ddi;
        AbstractC13464dMh abstractC13464dMh2;
        android.widget.ProgressBar progressBar4;
        dbw.UeEOUB = java.lang.Math.max(dbw.UeEOUB, i);
        if (i < 100) {
            android.view.View view = dbw.aKErDB;
            if ((view == null || view.getVisibility() != 0) && (((ddi = dbw.wlaJM) == null || !ddi.isAdded()) && (abstractC13464dMh2 = dbw.AubY) != null && (progressBar4 = abstractC13464dMh2.copydefault) != null)) {
                progressBar4.setVisibility(0);
            }
        } else {
            dbw.copydefault("progress_100");
            if (C14923duc.EZpvd.wlaJM() && (((abstractC13464dMh = dbw.AubY) == null || (progressBar2 = abstractC13464dMh.copydefault) == null || progressBar2.getProgress() != i) && i == 100)) {
                C13241dEa c13241dEa2 = dbw.AwvSrB;
                if (c13241dEa2 != null) {
                    c13241dEa2.postDelayed(new java.lang.Runnable() { // from class: o.dDv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            dBW.AubY(this.KWHzl);
                        }
                    }, 2000L);
                }
                if (dbw.fARcdN && (dappTabDataUzCIH = dbw.uzCIH()) != null && dappTabDataUzCIH.isTranslated() && (c13241dEa = dbw.AwvSrB) != null) {
                    c13241dEa.postDelayed(new java.lang.Runnable() { // from class: o.dDy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            dBW.zLjUOn(this.EZpvd);
                        }
                    }, 1000L);
                }
            }
            AbstractC13464dMh abstractC13464dMh3 = dbw.AubY;
            if (abstractC13464dMh3 != null && (progressBar = abstractC13464dMh3.copydefault) != null) {
                progressBar.setVisibility(4);
            }
        }
        AbstractC13464dMh abstractC13464dMh4 = dbw.AubY;
        if (abstractC13464dMh4 != null && (progressBar3 = abstractC13464dMh4.copydefault) != null) {
            progressBar3.setProgress(i);
        }
        DappTabData dappTabDataUzCIH2 = dbw.uzCIH();
        if (dappTabDataUzCIH2 != null) {
            dappTabDataUzCIH2.setProgress(i);
        }
        return Unit.INSTANCE;
    }

    public static final void AubY(dBW dbw) {
        dbw.QbewEr();
    }

    public static final void zLjUOn(final dBW dbw) {
        C13241dEa c13241dEa;
        if (dbw.isAdded() && (c13241dEa = dbw.AwvSrB) != null) {
            c13241dEa.OLrzqt(new Function1() { // from class: o.dBU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.AYXKKw(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit AYXKKw(dBW dbw, java.lang.String str) {
        C13241dEa c13241dEa;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null), (java.lang.Object) MnemonicKt.MnemonicLanguageEnglish)) {
            pSC psc = pSC.AEQbTJ;
            if ((Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.CHINESE) || Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.SIMPLIFIED_CHINESE)) && (c13241dEa = dbw.AwvSrB) != null) {
                c13241dEa.QKudOq();
            }
        }
        dbw.fARcdN = false;
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(dBW dbw, java.lang.String str, java.lang.Long l) {
        if (str != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(str);
            if (l != null && interfaceC9738bbJOLrzqt != null) {
                DappTabData dappTabDataUzCIH = dbw.uzCIH();
                if (dappTabDataUzCIH != null) {
                    dappTabDataUzCIH.setConnectedByWalletConnect(true);
                }
                refreshWebview$default(dbw, l, interfaceC9738bbJOLrzqt.EZpvd(l.longValue()), interfaceC9738bbJOLrzqt, false, false, 16, null);
                C13241dEa c13241dEa = dbw.AwvSrB;
                java.lang.String title = null;
                java.lang.String url = c13241dEa != null ? c13241dEa.getUrl() : null;
                if (url == null || url.length() == 0) {
                    DappTabData dappTabDataUzCIH2 = dbw.uzCIH();
                    url = dappTabDataUzCIH2 != null ? dappTabDataUzCIH2.getMUrl() : null;
                }
                C13241dEa c13241dEa2 = dbw.AwvSrB;
                java.lang.String strZLjUOn = c13241dEa2 != null ? c13241dEa2.zLjUOn() : null;
                if (strZLjUOn == null || strZLjUOn.length() == 0) {
                    DappTabData dappTabDataUzCIH3 = dbw.uzCIH();
                    if (dappTabDataUzCIH3 != null) {
                        title = dappTabDataUzCIH3.getTitle();
                    }
                } else {
                    title = strZLjUOn;
                }
                C14742drG.KWHzl.copydefault(interfaceC9738bbJOLrzqt.EZpvd(l.longValue()), l.longValue(), url == null ? "" : url, "walletconnect", title == null ? "" : title, dbw.zLjUOn());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(dBW dbw, android.webkit.ValueCallback valueCallback, android.content.Intent intent) {
        Unit unit;
        dbw.zLjUOn = valueCallback;
        try {
            Result.Application application = Result.Companion;
            if (intent != null) {
                dbw.startActivityForResult(intent, dbw.djBIcL);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dBW dbw, boolean z) {
        ConstraintLayout constraintLayout;
        AbstractC13464dMh abstractC13464dMh;
        ConstraintLayout constraintLayout2;
        AbstractC13464dMh abstractC13464dMh2;
        ConstraintLayout constraintLayout3;
        C55173xeu errorView;
        android.view.ViewParent parent;
        android.widget.ProgressBar progressBar;
        if (dbw.getContext() != null) {
            if (z) {
                dbw.copydefault(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                DappTabData dappTabDataUzCIH = dbw.uzCIH();
                if ((dappTabDataUzCIH != null ? dappTabDataUzCIH.getErrorView() : null) == null) {
                    DappTabData dappTabDataUzCIH2 = dbw.uzCIH();
                    if (dappTabDataUzCIH2 != null) {
                        dappTabDataUzCIH2.setErrorView(dbw.values());
                    }
                    DappTabData dappTabDataUzCIH3 = dbw.uzCIH();
                    if (dappTabDataUzCIH3 != null) {
                        dappTabDataUzCIH3.setHasError(true);
                    }
                    AbstractC13464dMh abstractC13464dMh3 = dbw.AubY;
                    if (abstractC13464dMh3 != null && (progressBar = abstractC13464dMh3.copydefault) != null) {
                        progressBar.setVisibility(4);
                    }
                    DappTabData dappTabDataUzCIH4 = dbw.uzCIH();
                    if (dappTabDataUzCIH4 != null && (errorView = dappTabDataUzCIH4.getErrorView()) != null && (parent = errorView.getParent()) != null) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                        DappTabData dappTabDataUzCIH5 = dbw.uzCIH();
                        viewGroup.removeView(dappTabDataUzCIH5 != null ? dappTabDataUzCIH5.getErrorView() : null);
                    }
                    DappTabData dappTabDataUzCIH6 = dbw.uzCIH();
                    if (dappTabDataUzCIH6 != null && dappTabDataUzCIH6.getErrorView() != null && (abstractC13464dMh2 = dbw.AubY) != null && (constraintLayout3 = abstractC13464dMh2.OLrzqt) != null) {
                        DappTabData dappTabDataUzCIH7 = dbw.uzCIH();
                        constraintLayout3.addView(dappTabDataUzCIH7 != null ? dappTabDataUzCIH7.getErrorView() : null);
                    }
                }
            } else {
                AbstractC13464dMh abstractC13464dMh4 = dbw.AubY;
                if (abstractC13464dMh4 != null && (constraintLayout = abstractC13464dMh4.OLrzqt) != null && constraintLayout.getChildCount() > 1 && (abstractC13464dMh = dbw.AubY) != null && (constraintLayout2 = abstractC13464dMh.OLrzqt) != null) {
                    DappTabData dappTabDataUzCIH8 = dbw.uzCIH();
                    constraintLayout2.removeView(dappTabDataUzCIH8 != null ? dappTabDataUzCIH8.getErrorView() : null);
                }
                DappTabData dappTabDataUzCIH9 = dbw.uzCIH();
                if (dappTabDataUzCIH9 != null) {
                    dappTabDataUzCIH9.setErrorView(null);
                }
                DappTabData dappTabDataUzCIH10 = dbw.uzCIH();
                if (dappTabDataUzCIH10 != null) {
                    dappTabDataUzCIH10.setHasError(false);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application extends dIQ {
        public Application() {
        }

        @Override // o.dIQ
        public void EZpvd(android.webkit.WebView webView, java.lang.String str) {
            super.EZpvd(webView, str);
            dBW.setHost$default(dBW.this, str, false, 2, null);
            dBW.this.QUSxYX();
            if (C14923duc.EZpvd.wlaJM()) {
                C13241dEa c13241dEa = dBW.this.AwvSrB;
                if (c13241dEa != null) {
                    final dBW dbw = dBW.this;
                    c13241dEa.postDelayed(new java.lang.Runnable() { // from class: o.dDD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            dBW.Application.AEQbTJ(dbw);
                        }
                    }, 2000L);
                }
                DappTabData dappTabDataUzCIH = dBW.this.uzCIH();
                if (dappTabDataUzCIH == null || !dappTabDataUzCIH.isTranslated() || Intrinsics.EZpvd((java.lang.Object) dBW.this.iwGUEr(), (java.lang.Object) str) || dBW.this.wlaJM()) {
                    return;
                }
                C13241dEa c13241dEa2 = dBW.this.AwvSrB;
                if (c13241dEa2 != null) {
                    final dBW dbw2 = dBW.this;
                    c13241dEa2.postDelayed(new java.lang.Runnable() { // from class: o.dDz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            dBW.Application.EZpvd(dbw2);
                        }
                    }, TooltipKt.TooltipDuration);
                }
                dBW.this.EZpvd(str);
            }
        }

        public static final void AEQbTJ(dBW dbw) {
            dbw.QbewEr();
        }

        public static final void EZpvd(final dBW dbw) {
            DappTabData dappTabDataOLrzqt;
            C13241dEa mWebView;
            if (!dbw.isAdded() || (dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt()) == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
                return;
            }
            mWebView.OLrzqt(new Function1() { // from class: o.dDB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.Application.AEQbTJ(dbw, (java.lang.String) obj);
                }
            });
        }

        public static final Unit AEQbTJ(dBW dbw, java.lang.String str) {
            C13241dEa c13241dEa;
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null), (java.lang.Object) MnemonicKt.MnemonicLanguageEnglish)) {
                pSC psc = pSC.AEQbTJ;
                if ((Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.CHINESE) || Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.SIMPLIFIED_CHINESE)) && (c13241dEa = dbw.AwvSrB) != null) {
                    c13241dEa.QKudOq();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // o.dIQ
        public void KWHzl(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.KWHzl(webView, str, bitmap);
            dBW.this.QUSxYX();
            dBW.setHost$default(dBW.this, str, false, 2, null);
        }
    }

    public static final void zsXlph(dBW dbw) {
        dbw.copydefault("tab_already_loaded");
    }

    public final void copydefault(PlatformItem platformItem) {
        C13273dFf c13273dFfQUSxYX;
        dFE dfeQbewEr;
        dEZ dezAubY;
        C13181dBv c13181dBvDjBIcL;
        dGQ dgqAhwBna;
        dGQ dgqQVAiDq;
        dFP dfpDjSkpj;
        C13284dFq c13284dFqQfsBiF;
        dGQ dgqGEmmrt;
        dGQ dgqRcXXUw;
        if (platformItem == null || platformItem.getId() == 0) {
            platformItem = null;
        }
        C13241dEa c13241dEa = this.AwvSrB;
        if (c13241dEa != null && (dgqRcXXUw = c13241dEa.RcXXUw()) != null) {
            dgqRcXXUw.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa2 = this.AwvSrB;
        if (c13241dEa2 != null && (dgqGEmmrt = c13241dEa2.gEmmrt()) != null) {
            dgqGEmmrt.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa3 = this.AwvSrB;
        if (c13241dEa3 != null && (c13284dFqQfsBiF = c13241dEa3.QfsBiF()) != null) {
            c13284dFqQfsBiF.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa4 = this.AwvSrB;
        if (c13241dEa4 != null && (dfpDjSkpj = c13241dEa4.djSkpj()) != null) {
            dfpDjSkpj.OLrzqt(platformItem);
        }
        C13241dEa c13241dEa5 = this.AwvSrB;
        if (c13241dEa5 != null && (dgqQVAiDq = c13241dEa5.QVAiDq()) != null) {
            dgqQVAiDq.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa6 = this.AwvSrB;
        if (c13241dEa6 != null && (dgqAhwBna = c13241dEa6.AhwBna()) != null) {
            dgqAhwBna.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa7 = this.AwvSrB;
        if (c13241dEa7 != null && (c13181dBvDjBIcL = c13241dEa7.djBIcL()) != null) {
            c13181dBvDjBIcL.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa8 = this.AwvSrB;
        if (c13241dEa8 != null && (dezAubY = c13241dEa8.AubY()) != null) {
            dezAubY.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa9 = this.AwvSrB;
        if (c13241dEa9 != null && (dfeQbewEr = c13241dEa9.QbewEr()) != null) {
            dfeQbewEr.AEQbTJ(platformItem);
        }
        C13241dEa c13241dEa10 = this.AwvSrB;
        if (c13241dEa10 == null || (c13273dFfQUSxYX = c13241dEa10.QUSxYX()) == null) {
            return;
        }
        c13273dFfQUSxYX.AEQbTJ(platformItem);
    }

    public final void isConnected() {
        ConstraintLayout constraintLayout;
        C13241dEa c13241dEa = this.AwvSrB;
        if (c13241dEa != null) {
            android.content.Context context = c13241dEa.getContext();
            if (context != null) {
                android.webkit.CookieSyncManager.createInstance(context);
            }
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "");
            cookieManager.removeSessionCookies(null);
            cookieManager.removeAllCookie();
            cookieManager.flush();
            android.webkit.WebStorage.getInstance().deleteAllData();
            AbstractC13464dMh abstractC13464dMh = this.AubY;
            if (abstractC13464dMh != null && (constraintLayout = abstractC13464dMh.OLrzqt) != null) {
                constraintLayout.removeView(this.AwvSrB);
            }
            c13241dEa.destroy();
            this.AwvSrB = null;
        }
    }

    @Override // o.dES
    public void AEQbTJ(java.lang.Long l, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        DappTabData dappTabDataUzCIH;
        DappTabData dappTabDataUzCIH2;
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames() && (dappTabDataUzCIH2 = uzCIH()) != null && !dappTabDataUzCIH2.getHasShowAATips()) {
            RJOkX();
        }
        this.fetchVPNInfo = interfaceC9738bbJ;
        this.AYXKKw = str;
        if (!Intrinsics.EZpvd(l, this.QKVWgx) && (dappTabDataUzCIH = uzCIH()) != null) {
            Intrinsics.copydefault(l);
            DappTabData.setCurrentChain$default(dappTabDataUzCIH, l.longValue(), null, 2, null);
        }
        this.QKVWgx = l == null ? this.QKVWgx : l;
        refreshWebview$default(this, l, str, interfaceC9738bbJ, z, false, 16, null);
    }

    @Override // o.AbstractC14835dsu, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        pUU.valueOf(getTAG(), "onResume");
        Function0<Unit> function0 = this.gHZMYf;
        if (function0 != null) {
            function0.invoke();
            this.gHZMYf = null;
        }
        C13241dEa c13241dEa = this.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.onResume();
        }
        QfsBiF();
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.dCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(dBW.AEQbTJ(this.EZpvd, (InterfaceC9738bbJ) obj));
            }
        };
        AbstractC58245yxe<InterfaceC9738bbJ> abstractC58245yxeOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58239yxY() { // from class: o.dCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return dBW.zsXlph(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.copydefault(this.EZpvd, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dBW.wlaJM(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.AhwBna((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCEZpvd = abstractC58245yxeOLrzqt.EZpvd(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dBW.gHZMYf(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCEZpvd, "");
        yBK.EZpvd(interfaceC58217yxCEZpvd, this.values);
        if (this.DTwDnp) {
            ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(this.DTwDnp);
        }
    }

    public static final boolean zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean AEQbTJ(dBW dbw, InterfaceC9738bbJ interfaceC9738bbJ) {
        DappTabData dappTabDataUzCIH;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (dbw.fetchVPNInfo != null) {
            java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            InterfaceC9738bbJ interfaceC9738bbJ2 = dbw.fetchVPNInfo;
            if (!Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) (interfaceC9738bbJ2 != null ? interfaceC9738bbJ2.DbNXlk() : null)) && ((dappTabDataUzCIH = dbw.uzCIH()) == null || !dappTabDataUzCIH.isConnectedByWalletConnect())) {
                return true;
            }
        }
        return false;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final dBW dbw, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (C15196dzk.KWHzl.KWHzl(interfaceC9738bbJ.DbNXlk(), dbw.QKVWgx)) {
            checkBeforWalletSelected$default(dbw, dbw.QKVWgx, interfaceC9738bbJ, null, 4, null);
            dbw.fetchVPNInfo = interfaceC9738bbJ;
        } else if (dbw.fetchVPNInfo != null) {
            InterfaceC9741bbM interfaceC9741bbMGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt();
            InterfaceC9738bbJ interfaceC9738bbJ2 = dbw.fetchVPNInfo;
            Intrinsics.copydefault(interfaceC9738bbJ2);
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = interfaceC9741bbMGEmmrt.copydefault(interfaceC9738bbJ2.DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dDn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.copydefault(this.copydefault, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dDo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.AuCTelauCTel(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dDl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.valueOf((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dDm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.AubY(function12, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            dbw.addDisposable(interfaceC58217yxCAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(dBW dbw, java.lang.Integer num) {
        int i = dLX.Dialog.iZzfmt;
        InterfaceC9738bbJ interfaceC9738bbJ = dbw.fetchVPNInfo;
        Intrinsics.copydefault(interfaceC9738bbJ);
        dbw.valueOf(C33069mpW.copydefault(dbw, i, C56424yEw.AYXKKw(C56390yDp.OLrzqt("wallet_name", interfaceC9738bbJ.AYXKKw()))));
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC14835dsu, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        try {
            super.onPause();
            C13241dEa c13241dEa = this.AwvSrB;
            if (c13241dEa != null) {
                c13241dEa.onPause();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void fJNWhG() {
        PlatformItem platformItem;
        DappTabData dappTabDataUzCIH;
        C13241dEa c13241dEa = this.AwvSrB;
        if ((c13241dEa == null || !c13241dEa.fZBcTu()) && (platformItem = this.zsXlph) != null && platformItem.getId() == 0) {
            dDI ddi = this.wlaJM;
            if ((ddi == null || !(ddi == null || ddi.isAdded())) && (dappTabDataUzCIH = uzCIH()) != null) {
                dDN ddn = dDN.copydefault;
                C13241dEa c13241dEa2 = this.AwvSrB;
                DappTabData dappTabDataUzCIH2 = uzCIH();
                dappTabDataUzCIH.setMThumbImageFileName(ddn.KWHzl(c13241dEa2, dappTabDataUzCIH2 != null ? dappTabDataUzCIH2.getMThumbImageFileName() : null));
            }
        }
    }

    @Override // o.AbstractC14835dsu, androidx.fragment.app.Fragment
    public void onDestroyView() {
        copydefault("destroy");
        this.aKErDB = null;
        this.QVAiDq = null;
        this.RJOkX = null;
        this.QbewEr = null;
        this.QfsBiF = null;
        this.dvKsVJ = null;
        C15141dyi.copydefault.AEQbTJ(getContext());
        super.onDestroyView();
        C14923duc.EZpvd.EZpvd((Function0<Unit>) null);
        fJNWhG();
        DappTabData dappTabDataUzCIH = uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setMThumbImage(null);
        }
        DappTabData dappTabDataUzCIH2 = uzCIH();
        if (dappTabDataUzCIH2 != null) {
            dappTabDataUzCIH2.setMThumbImageByte(null);
        }
        Function0<Unit> function0 = copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        c15112dyF.gEmmrt();
        dDI ddi = this.wlaJM;
        if (ddi != null) {
            getChildFragmentManager().beginTransaction().remove(ddi).commitAllowingStateLoss();
        }
        this.wlaJM = null;
        for (DappTabData dappTabData : c15112dyF.djBIcL()) {
            AEQbTJ(dappTabData.getMWebView());
            dappTabData.setErrorView(null);
        }
        C15112dyF c15112dyF2 = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF2.OLrzqt();
        AEQbTJ(dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMWebView() : null);
        c15112dyF2.copydefault();
        Function0<Unit> function02 = this.sSMYrx;
        if (function02 != null && Intrinsics.EZpvd(function02, c15112dyF2.AYXKKw())) {
            c15112dyF2.EZpvd((Function0<Unit>) null);
        }
        C13241dEa c13241dEa = this.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.setOnTouchListener(null);
        }
        SubHelper.AEQbTJ(this.getNewProxyInstance);
        C14923duc.EZpvd.AxsJAY();
        C15118dyL.EZpvd();
        this.values.dispose();
    }

    public final void AEQbTJ(C13241dEa c13241dEa) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (constraintLayout2 = abstractC13464dMh.OLrzqt) != null) {
            constraintLayout2.removeView(c13241dEa);
        }
        AbstractC13464dMh abstractC13464dMh2 = this.AubY;
        if (abstractC13464dMh2 != null && (constraintLayout = abstractC13464dMh2.OLrzqt) != null) {
            constraintLayout.removeAllViews();
        }
        if (c13241dEa != null) {
            c13241dEa.copydefault();
        }
    }

    @Override // o.InterfaceC15111dyE
    public boolean az_() {
        C13241dEa c13241dEa;
        dDI ddi = this.wlaJM;
        if ((ddi != null && (ddi == null || ddi.isAdded())) || (c13241dEa = this.AwvSrB) == null || !c13241dEa.canGoBack()) {
            KWHzl(true);
            return true;
        }
        C13241dEa c13241dEa2 = this.AwvSrB;
        if (c13241dEa2 != null) {
            c13241dEa2.goBack();
        }
        return true;
    }

    @Override // o.dES
    public void AuCTelauCTel() {
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh == null || (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) == null) {
            return;
        }
        dappBrowserMultiModeToolbar.setWalletWrapperVisible(true);
    }

    @Override // o.dES
    public void zuBGHE() {
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh == null || (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) == null) {
            return;
        }
        dappBrowserMultiModeToolbar.setWalletWrapperVisible(false);
    }

    public final void OcIXYQ() {
        android.view.View view;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) != null) {
            dappBrowserMultiModeToolbar.setMode(DappBrowserMultiModeToolbar.Mode.BROWSER);
        }
        AbstractC13464dMh abstractC13464dMh2 = this.AubY;
        if (abstractC13464dMh2 == null || (view = abstractC13464dMh2.AEQbTJ) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void DTwDnp() {
        android.view.View view;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) != null) {
            dappBrowserMultiModeToolbar.setMode(DappBrowserMultiModeToolbar.Mode.HISTORY);
        }
        AbstractC13464dMh abstractC13464dMh2 = this.AubY;
        if (abstractC13464dMh2 == null || (view = abstractC13464dMh2.AEQbTJ) == null) {
            return;
        }
        view.setVisibility(4);
    }

    public final void QOLQEE() {
        android.widget.ProgressBar progressBar;
        copydefault("tab_list");
        OKReminder oKReminder = this.QOLQEE;
        if ((oKReminder != null ? oKReminder.getParent() : null) instanceof android.view.ViewGroup) {
            OKReminder oKReminder2 = this.QOLQEE;
            android.view.ViewParent parent = oKReminder2 != null ? oKReminder2.getParent() : null;
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(this.QOLQEE);
        }
        DTwDnp();
        QfsBiF();
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (progressBar = abstractC13464dMh.copydefault) != null) {
            progressBar.setVisibility(4);
        }
        DappTabData dappTabDataUzCIH = uzCIH();
        if (dappTabDataUzCIH != null) {
            dDN ddn = dDN.copydefault;
            C13241dEa c13241dEa = this.AwvSrB;
            DappTabData dappTabDataUzCIH2 = uzCIH();
            dappTabDataUzCIH.setMThumbImageFileName(ddn.KWHzl(c13241dEa, dappTabDataUzCIH2 != null ? dappTabDataUzCIH2.getMThumbImageFileName() : null));
        }
        DappTabData dappTabDataUzCIH3 = uzCIH();
        if (dappTabDataUzCIH3 != null) {
            dappTabDataUzCIH3.setMThumbImage(null);
        }
        DappTabData dappTabDataUzCIH4 = uzCIH();
        if (dappTabDataUzCIH4 != null) {
            dappTabDataUzCIH4.setMThumbImageByte(null);
        }
        if (this.wlaJM == null) {
            this.wlaJM = new dDI();
        }
        dDI ddi = this.wlaJM;
        if (ddi != null && !ddi.isAdded()) {
            dDI ddi2 = this.wlaJM;
            if (ddi2 != null) {
                ddi2.copydefault(this);
            }
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            int i = dLX.Application.gHZMYf;
            dDI ddi3 = this.wlaJM;
            Intrinsics.copydefault(ddi3);
            fragmentTransactionBeginTransaction.replace(i, ddi3).commitAllowingStateLoss();
        }
        C13241dEa c13241dEa2 = this.AwvSrB;
        if (c13241dEa2 != null) {
            c13241dEa2.iRxXKY();
        }
    }

    public final void AxsJAY() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        java.lang.Long l = this.QKVWgx;
        ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).KWHzl(activity, C15196dzk.KWHzl.EZpvd(l != null ? l.longValue() : 1L), new Function1() { // from class: o.dDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.OLrzqt(this.EZpvd, (SwitchNetworkResult) obj);
            }
        }, new Function0() { // from class: o.dDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBW.AYXKKw();
            }
        });
    }

    public static final Unit OLrzqt(dBW dbw, SwitchNetworkResult switchNetworkResult) {
        Intrinsics.checkNotNullParameter(switchNetworkResult, "");
        dbw.copydefault(switchNetworkResult.getGeneralChainId());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        java.lang.Object objM7377constructorimpl;
        if (isAdded()) {
            Unit unit = null;
            if (this.DTwDnp) {
                try {
                    androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, parentFragmentManager, null, 2, null).OLrzqt(this, (2 & 2) != 0 ? new FragmentNavigator.Application(C52761wXj.Application.DbNXlk, C52761wXj.Application.AuCTel, 0, 0, false, false, null, null, false, false, 1008, null) : null);
                    return;
                } catch (java.lang.Exception e) {
                    pUU.copydefault(getTAG(), "closePageByAnimate " + e.getMessage());
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
            }
            try {
                Result.Application application = Result.Companion;
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    unit = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dBW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWalletSelected$default(dBW dbw, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function2 = null;
        }
        dbw.KWHzl(l, interfaceC9738bbJ, str, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(final java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final java.lang.String str, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit> function2) {
        java.lang.Object next;
        C13273dFf c13273dFfQUSxYX;
        dGQ dgqGEmmrt;
        C13284dFq c13284dFqQfsBiF;
        C13241dEa c13241dEa;
        C13241dEa c13241dEa2;
        C13241dEa c13241dEa3;
        dGQ dgqQVAiDq;
        dGQ dgqRcXXUw;
        DappTabData dappTabDataUzCIH;
        C13241dEa c13241dEa4;
        DappTabData dappTabDataUzCIH2;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(this.QKVWgx, l) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.AYXKKw)) {
            return;
        }
        if (interfaceC9738bbJ == null || !interfaceC9738bbJ.getFieldNames() || (dappTabDataUzCIH2 = uzCIH()) == null || dappTabDataUzCIH2.getHasShowAATips()) {
            OKReminder oKReminder = this.QOLQEE;
            if ((oKReminder != null ? oKReminder.getParent() : null) instanceof android.view.ViewGroup) {
                OKReminder oKReminder2 = this.QOLQEE;
                android.view.ViewParent parent = oKReminder2 != null ? oKReminder2.getParent() : null;
                Intrinsics.copydefault(parent, "");
                ((android.view.ViewGroup) parent).removeView(this.QOLQEE);
            }
        } else {
            RJOkX();
        }
        java.lang.Long l2 = this.QKVWgx;
        if (l2 != null && l2.longValue() == 607 && function2 == null && (c13241dEa4 = this.AwvSrB) != null) {
            c13241dEa4.gkJEwt();
        }
        C13241dEa c13241dEa5 = this.AwvSrB;
        if (c13241dEa5 != null) {
            c13241dEa5.setCurrentWallet(interfaceC9738bbJ);
        }
        boolean zEZpvd = Intrinsics.EZpvd(this.QKVWgx, l);
        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) str);
        if (l != null && l.longValue() == 784) {
            AEQbTJ(4);
        } else if (l != null && l.longValue() == 195) {
            AEQbTJ(2);
        } else if (l != null && l.longValue() == 9004) {
            AEQbTJ(6);
        } else if ((l != null && l.longValue() == 0) || (l != null && l.longValue() == 70000061)) {
            AEQbTJ(7);
        } else if (l != null && l.longValue() == 1237) {
            AEQbTJ(8);
        } else if (l != null && l.longValue() == 607) {
            AEQbTJ(9);
        } else {
            if (l != null && ((xWE) C43251rlk.copydefault(xWE.class)).KWHzl(l.longValue(), true)) {
                AEQbTJ(0);
            } else {
                java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    long jFetchVPNInfo = ((InterfaceC9731bbC) next).fetchVPNInfo();
                    if (l != null && jFetchVPNInfo == l.longValue()) {
                        break;
                    }
                }
                AEQbTJ(next == null ? 5 : 0);
            }
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(l != null ? l.longValue() : 637L, true);
            if (interfaceC9731bbCEZpvd != null && interfaceC9731bbCEZpvd.fIwbmz()) {
                AEQbTJ(3);
                C13241dEa c13241dEa6 = this.AwvSrB;
                if (c13241dEa6 != null && (dgqGEmmrt = c13241dEa6.gEmmrt()) != null) {
                    dgqGEmmrt.EZpvd(l == null ? 637L : l);
                }
            }
            if (interfaceC9731bbCEZpvd != null && interfaceC9731bbCEZpvd.fARcdN()) {
                AEQbTJ(1);
                C13241dEa c13241dEa7 = this.AwvSrB;
                if (c13241dEa7 != null && (c13273dFfQUSxYX = c13241dEa7.QUSxYX()) != null) {
                    c13273dFfQUSxYX.copydefault(l != null ? l.longValue() : 501L);
                }
            }
        }
        if ((!zEZpvd) && l != null && (dappTabDataUzCIH = uzCIH()) != null) {
            dappTabDataUzCIH.setCurrentChain(l.longValue(), new Function2() { // from class: o.dCp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return dBW.AEQbTJ(this.KWHzl, str, l, (java.lang.String) obj, ((java.lang.Long) obj2).longValue());
                }
            });
        }
        if (interfaceC9738bbJ != null) {
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.fetchVPNInfo;
            if (interfaceC9738bbJ2 != null) {
                Intrinsics.copydefault(interfaceC9738bbJ2);
                if (!Intrinsics.EZpvd((java.lang.Object) interfaceC9738bbJ2.DbNXlk(), (java.lang.Object) interfaceC9738bbJ.DbNXlk())) {
                    C13241dEa c13241dEa8 = this.AwvSrB;
                    if (c13241dEa8 != null && (dgqRcXXUw = c13241dEa8.RcXXUw()) != null) {
                        dgqRcXXUw.copydefault(interfaceC9738bbJ);
                    }
                    C13241dEa c13241dEa9 = this.AwvSrB;
                    if (c13241dEa9 != null && (dgqQVAiDq = c13241dEa9.QVAiDq()) != null) {
                        dgqQVAiDq.copydefault(interfaceC9738bbJ);
                    }
                    valueOf(C33069mpW.copydefault(this, dLX.Dialog.iZzfmt, C56424yEw.AYXKKw(C56390yDp.OLrzqt("wallet_name", interfaceC9738bbJ.AYXKKw()))));
                    AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(interfaceC9738bbJ.DbNXlk());
                    final Function1 function1 = new Function1() { // from class: o.dCu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return dBW.copydefault((java.lang.Integer) obj);
                        }
                    };
                    InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dCt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            dBW.ORxRYg(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.dCs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return dBW.isConnected((java.lang.Throwable) obj);
                        }
                    };
                    InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dCr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            dBW.DTwDnp(function12, obj);
                        }
                    });
                    Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
                    addDisposable(interfaceC58217yxCAEQbTJ);
                }
            }
        }
        this.QKVWgx = l;
        if (l != null) {
            long jLongValue = l.longValue();
            if (function2 != null) {
                function2.invoke(interfaceC9738bbJ, java.lang.Long.valueOf(jLongValue));
            }
        }
        if ((!zEZpvd2) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            int newProxyInstance = getNewProxyInstance();
            if (newProxyInstance != 0) {
                switch (newProxyInstance) {
                    case 3:
                        C13241dEa c13241dEa10 = this.AwvSrB;
                        if (c13241dEa10 != null) {
                            c13241dEa10.copydefault(str);
                        }
                        C13241dEa c13241dEa11 = this.AwvSrB;
                        if (c13241dEa11 != null) {
                            c13241dEa11.reload();
                        }
                        break;
                    case 4:
                        C13241dEa c13241dEa12 = this.AwvSrB;
                        if (c13241dEa12 != null) {
                            c13241dEa12.AEQbTJ((c13241dEa12 == null || (c13284dFqQfsBiF = c13241dEa12.QfsBiF()) == null) ? null : c13284dFqQfsBiF.AhwBna(), str, interfaceC9738bbJ != null ? interfaceC9738bbJ.OLrzqt(784L) : null);
                        }
                        C13241dEa c13241dEa13 = this.AwvSrB;
                        if (c13241dEa13 != null) {
                            c13241dEa13.reload();
                        }
                        break;
                    case 5:
                        C13241dEa c13241dEa14 = this.AwvSrB;
                        if (c13241dEa14 != null) {
                            c13241dEa14.AYXKKw(str);
                        }
                        break;
                    case 6:
                        C13241dEa c13241dEa15 = this.AwvSrB;
                        if (c13241dEa15 != null) {
                            c13241dEa15.valueOf(str);
                        }
                        break;
                    case 7:
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw) && (c13241dEa = this.AwvSrB) != null) {
                            c13241dEa.AhwBna(str);
                        }
                        break;
                    case 8:
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw) && (c13241dEa2 = this.AwvSrB) != null) {
                            c13241dEa2.reload();
                        }
                        break;
                    case 9:
                        if (function2 == null && (c13241dEa3 = this.AwvSrB) != null) {
                            c13241dEa3.reload();
                        }
                        break;
                    default:
                        C13241dEa c13241dEa16 = this.AwvSrB;
                        if (c13241dEa16 != null) {
                            c13241dEa16.reload();
                        }
                        break;
                }
            } else {
                C13241dEa c13241dEa17 = this.AwvSrB;
                if (c13241dEa17 != null) {
                    c13241dEa17.KWHzl(str);
                }
            }
        }
        refreshWebview$default(this, l, str, interfaceC9738bbJ, false, false, 16, null);
    }

    public static final Unit AEQbTJ(dBW dbw, java.lang.String str, java.lang.Long l, java.lang.String str2, long j) {
        C13241dEa c13241dEa;
        Intrinsics.checkNotNullParameter(str2, "");
        if (dbw.getNewProxyInstance() == 0 && (c13241dEa = dbw.AwvSrB) != null) {
            c13241dEa.gEmmrt(str);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(dbw), null, null, new DappNewWebFragment$onWalletSelected$2$1(dbw, l, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Integer num) {
        pUU.KWHzl("dappwebview", "switch main wallet");
        return Unit.INSTANCE;
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dBW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkBeforWalletSelected$default(dBW dbw, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function2 = null;
        }
        dbw.AEQbTJ(l, interfaceC9738bbJ, (Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit>) function2);
    }

    public final void AEQbTJ(final java.lang.Long l, final InterfaceC9738bbJ interfaceC9738bbJ, final Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit> function2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.AuCTelauCTel = false;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null && dappTabDataOLrzqt.getOkxConnect()) {
            if (function2 != null) {
                function2.invoke(interfaceC9738bbJ, l);
                return;
            }
            return;
        }
        if (l == null || interfaceC9738bbJ == null) {
            if (function2 != null) {
                function2.invoke(null, null);
                return;
            }
            return;
        }
        boolean z4 = function2 != null;
        java.util.List<InterfaceC9731bbC> listKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true);
        boolean z5 = listKWHzl instanceof java.util.Collection;
        if (z5 && listKWHzl.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (((InterfaceC9731bbC) it.next()).fetchVPNInfo() == l.longValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z5 && listKWHzl.isEmpty()) {
            z2 = false;
        } else {
            java.util.Iterator<T> it2 = listKWHzl.iterator();
            while (it2.hasNext()) {
                long jFetchVPNInfo = ((InterfaceC9731bbC) it2.next()).fetchVPNInfo();
                java.lang.Long l2 = this.QKVWgx;
                if (l2 != null && jFetchVPNInfo == l2.longValue()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (Intrinsics.EZpvd(l, this.QKVWgx) || (z2 && z)) {
            z3 = true;
        }
        final java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(l.longValue());
        C15196dzk c15196dzk = C15196dzk.KWHzl;
        boolean zKWHzl = c15196dzk.KWHzl(interfaceC9738bbJ.DbNXlk(), l);
        if ((!z4 || z3) && zKWHzl) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c15196dzk.KWHzl(childFragmentManager, l, interfaceC9738bbJ, new Function0() { // from class: o.dCm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dBW.EZpvd(this.copydefault, l, interfaceC9738bbJ, strEZpvd, function2);
                }
            }, new Function0() { // from class: o.dCo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dBW.EZpvd(function2, l);
                }
            });
        } else if (function2 != null) {
            function2.invoke(null, l);
        }
    }

    public static final Unit EZpvd(dBW dbw, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, Function2 function2) {
        dbw.KWHzl(l, interfaceC9738bbJ, str, function2);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function2 function2, java.lang.Long l) {
        if (function2 != null) {
            function2.invoke(null, l);
        }
        return Unit.INSTANCE;
    }

    @Override // o.dES
    public void AEQbTJ(java.lang.Long l, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit> function2) {
        try {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DappNewWebFragment$selectWallet$1$1(this, l, function2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void ORxRYg() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (this.zsXlph == null) {
                this.fJNWhG = true;
                this.zsXlph = new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, this.AxsJAY, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16127, (DefaultConstructorMarker) null);
            }
            C14923duc c14923duc = C14923duc.EZpvd;
            PlatformItem platformItem = this.zsXlph;
            Intrinsics.copydefault(platformItem);
            c14923duc.AEQbTJ(activity, platformItem, (20992 & 4) != 0 ? null : this.ejfBZ, (20992 & 8) != 0 ? null : this.QKVWgx, (Function0<Unit>) ((20992 & 16) != 0 ? null : null), (20992 & 32) != 0 ? false : this.isConnected, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : this.AhwBna), (20992 & 128) != 0, (20992 & 256) != 0 ? false : true, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : this.dxcTrN, (20992 & 2048) != 0 ? "" : zLjUOn(), (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.FALSE, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : new int[]{dLX.Activity.AEQbTJ, C52761wXj.Application.AuCTel});
        }
    }

    public final void OLrzqt(final Function0<Unit> function0) {
        C14923duc c14923duc = C14923duc.EZpvd;
        kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc.AuCTel();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C14923duc.showConnectWalletDialog$default(c14923duc, pairAuCTel, childFragmentManager, new Function0() { // from class: o.dDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dBW.AEQbTJ(this.OLrzqt, function0);
            }
        }, null, 8, null);
    }

    public static final Unit AEQbTJ(dBW dbw, Function0 function0) {
        if (dbw.isAdded()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onSelectedTab$default(dBW dbw, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        dbw.OLrzqt(i, str, str2);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, o.bbJ] */
    public final void OLrzqt(int i, java.lang.String str, java.lang.String str2) {
        java.lang.String mUrl;
        java.lang.String splashLogo;
        java.lang.String splashTitle;
        java.lang.String mUrl2;
        AbstractC13464dMh abstractC13464dMh;
        ConstraintLayout constraintLayout;
        C55173xeu errorView;
        ConstraintLayout constraintLayout2;
        C13241dEa c13241dEa;
        java.lang.String currentAddress;
        C13241dEa mWebView;
        DappTabData dappTabDataUzCIH;
        DappTabData dappTabDataUzCIH2;
        FragmentActivity activity;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        if (uzCIH() != null) {
            copydefault("tab_switch");
        }
        this.zuBGHE = false;
        java.lang.String str3 = "";
        this.fIwbmz = "";
        this.getFieldNames = null;
        this.iwGUEr = "";
        AbstractC13464dMh abstractC13464dMh2 = this.AubY;
        if (abstractC13464dMh2 != null && (constraintLayout4 = abstractC13464dMh2.OLrzqt) != null) {
            constraintLayout4.removeView(this.AwvSrB);
        }
        AbstractC13464dMh abstractC13464dMh3 = this.AubY;
        if (abstractC13464dMh3 != null && (constraintLayout3 = abstractC13464dMh3.OLrzqt) != null) {
            constraintLayout3.removeAllViews();
        }
        KWHzl(C15112dyF.AEQbTJ.djBIcL().get(i));
        dDN ddn = dDN.copydefault;
        ddn.KWHzl(uzCIH());
        DappTabData dappTabDataUzCIH3 = uzCIH();
        this.zsXlph = dappTabDataUzCIH3 != null ? dappTabDataUzCIH3.getMItem() : null;
        DappTabData dappTabDataUzCIH4 = uzCIH();
        if (dappTabDataUzCIH4 == null || (mUrl = dappTabDataUzCIH4.getMUrl()) == null) {
            mUrl = "";
        }
        this.AxsJAY = mUrl;
        C15142dyj c15142dyj = C15142dyj.EZpvd;
        java.lang.String strDjBIcL = c15142dyj.djBIcL(mUrl);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strDjBIcL) && (activity = getActivity()) != null) {
            c15142dyj.OLrzqt(activity, strDjBIcL);
        }
        DappTabData dappTabDataUzCIH5 = uzCIH();
        this.AhwBna = dappTabDataUzCIH5 != null ? dappTabDataUzCIH5.getMChainList() : null;
        PlatformItem platformItem = this.zsXlph;
        this.fJNWhG = platformItem != null && platformItem.getId() == 0;
        if (str == null) {
            DappTabData dappTabDataUzCIH6 = uzCIH();
            splashLogo = dappTabDataUzCIH6 != null ? dappTabDataUzCIH6.getSplashLogo() : null;
        } else {
            splashLogo = str;
        }
        this.RcXXUw = splashLogo;
        if (str != null && (dappTabDataUzCIH2 = uzCIH()) != null) {
            dappTabDataUzCIH2.setSplashLogo(str);
        }
        if (str2 == null) {
            DappTabData dappTabDataUzCIH7 = uzCIH();
            splashTitle = dappTabDataUzCIH7 != null ? dappTabDataUzCIH7.getSplashTitle() : null;
        } else {
            splashTitle = str2;
        }
        this.fFgQHt = splashTitle;
        if (str2 != null && (dappTabDataUzCIH = uzCIH()) != null) {
            dappTabDataUzCIH.setSplashTitle(str2);
        }
        if (getActivity() != null && getActivity() != null) {
            DappTabData dappTabDataUzCIH8 = uzCIH();
            if ((dappTabDataUzCIH8 != null ? dappTabDataUzCIH8.getMWebView() : null) == null) {
                DappTabData dappTabDataUzCIH9 = uzCIH();
                if (dappTabDataUzCIH9 != null) {
                    dappTabDataUzCIH9.setHasShownSplashScreen(false);
                }
                try {
                    DappTabData dappTabDataUzCIH10 = uzCIH();
                    if (dappTabDataUzCIH10 != null) {
                        DappTabData dappTabDataUzCIH11 = uzCIH();
                        java.lang.String str4 = this.dxcTrN;
                        FragmentActivity activity2 = getActivity();
                        Intrinsics.copydefault(activity2, "");
                        dappTabDataUzCIH10.setMWebView(ddn.copydefault(dappTabDataUzCIH11, str4, new WeakReference<>(activity2), this));
                    }
                } catch (java.lang.Exception unused) {
                    fIwbmz();
                }
            } else {
                DappTabData dappTabDataUzCIH12 = uzCIH();
                if (dappTabDataUzCIH12 != null) {
                    dappTabDataUzCIH12.setHasShownSplashScreen(false);
                }
                DappTabData dappTabDataUzCIH13 = uzCIH();
                if (dappTabDataUzCIH13 != null && (mWebView = dappTabDataUzCIH13.getMWebView()) != null) {
                    FragmentActivity activity3 = getActivity();
                    Intrinsics.copydefault(activity3, "");
                    mWebView.setActivity((AbstractActivityC33041mov) activity3, this);
                }
            }
        }
        DappTabData dappTabDataUzCIH14 = uzCIH();
        C13241dEa mWebView2 = dappTabDataUzCIH14 != null ? dappTabDataUzCIH14.getMWebView() : null;
        this.AwvSrB = mWebView2;
        AEQbTJ(mWebView2 != null ? mWebView2.AkhnZx() : 0);
        DappTabData dappTabDataUzCIH15 = uzCIH();
        if (dappTabDataUzCIH15 != null && dappTabDataUzCIH15.isLoaded()) {
            DappTabData dappTabDataUzCIH16 = uzCIH();
            if (dappTabDataUzCIH16 == null || (currentAddress = dappTabDataUzCIH16.getCurrentAddress()) == null) {
                currentAddress = "";
            }
            this.AYXKKw = currentAddress;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.fetchVPNInfo;
        DappTabData dappTabDataUzCIH17 = uzCIH();
        this.fetchVPNInfo = dappTabDataUzCIH17 != null ? dappTabDataUzCIH17.getCurrentWallet() : null;
        DappTabData dappTabDataUzCIH18 = uzCIH();
        java.lang.Long currentChainId = dappTabDataUzCIH18 != null ? dappTabDataUzCIH18.getCurrentChainId() : null;
        this.QKVWgx = currentChainId;
        setWebViewListener$default(this, currentChainId, false, 2, null);
        DappTabData dappTabDataUzCIH19 = uzCIH();
        if (dappTabDataUzCIH19 != null && dappTabDataUzCIH19.isTranslated()) {
            pSC psc = pSC.AEQbTJ;
            if (!Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.CHINESE) && !Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.SIMPLIFIED_CHINESE) && (c13241dEa = this.AwvSrB) != null) {
                c13241dEa.post(new java.lang.Runnable() { // from class: o.dCE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dBW.AuCTelauCTel(this.OLrzqt);
                    }
                });
            }
        }
        DappTabData dappTabDataUzCIH20 = uzCIH();
        if (dappTabDataUzCIH20 != null && dappTabDataUzCIH20.getHasError()) {
            DappTabData dappTabDataUzCIH21 = uzCIH();
            if (dappTabDataUzCIH21 != null && (errorView = dappTabDataUzCIH21.getErrorView()) != null) {
                android.view.ViewParent parent = errorView.getParent();
                if (parent != null) {
                    Intrinsics.copydefault(parent, "");
                    ((android.view.ViewGroup) parent).removeView(errorView);
                }
                AbstractC13464dMh abstractC13464dMh4 = this.AubY;
                if (abstractC13464dMh4 != null && (constraintLayout2 = abstractC13464dMh4.OLrzqt) != null) {
                    constraintLayout2.addView(errorView);
                }
            } else {
                DappTabData dappTabDataUzCIH22 = uzCIH();
                if (dappTabDataUzCIH22 != null) {
                    dappTabDataUzCIH22.setErrorView(values());
                }
                DappTabData dappTabDataUzCIH23 = uzCIH();
                if (dappTabDataUzCIH23 != null && dappTabDataUzCIH23.getErrorView() != null && (abstractC13464dMh = this.AubY) != null && (constraintLayout = abstractC13464dMh.OLrzqt) != null) {
                    DappTabData dappTabDataUzCIH24 = uzCIH();
                    constraintLayout.addView(dappTabDataUzCIH24 != null ? dappTabDataUzCIH24.getErrorView() : null);
                }
            }
        }
        DappTabData dappTabDataUzCIH25 = uzCIH();
        if (dappTabDataUzCIH25 != null && (mUrl2 = dappTabDataUzCIH25.getMUrl()) != null) {
            str3 = mUrl2;
        }
        EZpvd(str3, true);
        if (this.fetchVPNInfo != null) {
            InterfaceC9741bbM interfaceC9741bbMGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt();
            InterfaceC9738bbJ interfaceC9738bbJ = this.fetchVPNInfo;
            Intrinsics.copydefault(interfaceC9738bbJ);
            AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(interfaceC9741bbMGEmmrt.EZpvd(interfaceC9738bbJ.DbNXlk()), this);
            final Function1 function1 = new Function1() { // from class: o.dCH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.AEQbTJ(this.KWHzl, objectRef, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dCI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.AxsJAY(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dCK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dCG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.AwvSrB(function12, obj);
                }
            });
            return;
        }
        if (this.AYXKKw.length() == 0) {
            return;
        }
        AbstractC58260yxt abstractC58260yxtKWHzl2 = C58156yvv.KWHzl(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().AEQbTJ(this.AYXKKw), this);
        final Function1 function13 = new Function1() { // from class: o.dCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.KWHzl(this.KWHzl, objectRef, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dBW.sSMYrx(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dBW.AhwBna(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dBW.zuBGHE(function14, obj);
            }
        });
    }

    public static final void AuCTelauCTel(dBW dbw) {
        C13241dEa c13241dEa = dbw.AwvSrB;
        if (c13241dEa != null) {
            c13241dEa.RlQdEF();
        }
        DappTabData dappTabDataUzCIH = dbw.uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setTranslated(false);
        }
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(dBW dbw, Ref.ObjectRef objectRef, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        dbw.EZpvd(interfaceC9738bbJ, (InterfaceC9738bbJ) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(dBW dbw, java.lang.Throwable th) {
        dbw.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(dBW dbw, Ref.ObjectRef objectRef, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        dbw.EZpvd(interfaceC9738bbJ, (InterfaceC9738bbJ) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(dBW dbw, java.lang.Throwable th) {
        dbw.ejfBZ();
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        DbNXlk();
    }

    public final void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, InterfaceC9738bbJ interfaceC9738bbJ2) {
        InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault();
        java.lang.Long l = this.QKVWgx;
        if (interfaceC9737bbICopydefault.EZpvd(l != null ? l.longValue() : 0L, true) == null) {
            ejfBZ();
        } else if (((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(interfaceC9738bbJ, 6) && ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(interfaceC9738bbJ) != MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal) {
            ejfBZ();
        } else {
            KWHzl(this.QKVWgx, this.AYXKKw, this.fetchVPNInfo);
            copydefault(interfaceC9738bbJ2);
        }
    }

    public final void ejfBZ() {
        this.AYXKKw = "";
        this.fetchVPNInfo = null;
        DappTabData dappTabDataUzCIH = uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setCurrentWallet(null);
        }
        DappTabData dappTabDataUzCIH2 = uzCIH();
        if (dappTabDataUzCIH2 != null) {
            dappTabDataUzCIH2.setCurrentAddress("");
        }
        int newProxyInstance = getNewProxyInstance();
        if (newProxyInstance == 0) {
            C13241dEa c13241dEa = this.AwvSrB;
            if (c13241dEa != null) {
                c13241dEa.OLrzqt();
            }
        } else if (newProxyInstance != 1) {
            C13241dEa c13241dEa2 = this.AwvSrB;
            if (c13241dEa2 != null) {
                c13241dEa2.reload();
            }
        } else {
            C13241dEa c13241dEa3 = this.AwvSrB;
            if (c13241dEa3 != null) {
                c13241dEa3.EZpvd();
            }
        }
        KWHzl(this.QKVWgx, this.AYXKKw, this.fetchVPNInfo);
    }

    public final void sSMYrx() {
        AbstractC13464dMh abstractC13464dMh;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        OcIXYQ();
        if (this.fetchVPNInfo != null && (abstractC13464dMh = this.AubY) != null && (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) != null) {
            dappBrowserMultiModeToolbar.setWalletWrapperVisible(true);
        }
        C13241dEa c13241dEa = this.AwvSrB;
        EZpvd(c13241dEa != null ? c13241dEa.getUrl() : null, true);
    }

    public static /* synthetic */ void refreshWebview$default(dBW dbw, java.lang.Long l, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = true;
        }
        dbw.AEQbTJ(l, str, interfaceC9738bbJ, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(java.lang.Long l, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z, boolean z2) {
        C13241dEa c13241dEa;
        dGQ dgqGEmmrt;
        C13241dEa c13241dEa2;
        dGQ dgqRcXXUw;
        C13241dEa c13241dEa3;
        java.lang.String url;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        this.QKVWgx = l;
        KWHzl(l, str, interfaceC9738bbJ);
        java.lang.Object obj = null;
        if (z2 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && l != null && interfaceC9738bbJ != null) {
            if (Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) str) && Intrinsics.EZpvd(this.getFieldNames, l)) {
                java.lang.String str3 = this.iwGUEr;
                C13241dEa c13241dEa4 = this.AwvSrB;
                if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) (c13241dEa4 != null ? c13241dEa4.getUrl() : null))) {
                }
                this.fIwbmz = str;
                this.getFieldNames = l;
                c13241dEa3 = this.AwvSrB;
                if (c13241dEa3 != null) {
                    str2 = url;
                }
                this.iwGUEr = str2;
            } else {
                C13241dEa c13241dEa5 = this.AwvSrB;
                java.lang.String url2 = c13241dEa5 != null ? c13241dEa5.getUrl() : null;
                if (url2 == null || url2.length() == 0) {
                    DappTabData dappTabDataUzCIH = uzCIH();
                    url2 = dappTabDataUzCIH != null ? dappTabDataUzCIH.getMUrl() : null;
                }
                C13241dEa c13241dEa6 = this.AwvSrB;
                java.lang.String strZLjUOn = c13241dEa6 != null ? c13241dEa6.zLjUOn() : null;
                if (strZLjUOn == null || strZLjUOn.length() == 0) {
                    DappTabData dappTabDataUzCIH2 = uzCIH();
                    strZLjUOn = dappTabDataUzCIH2 != null ? dappTabDataUzCIH2.getTitle() : null;
                }
                C14742drG.KWHzl.copydefault(str, l.longValue(), url2 == null ? "" : url2, DevicePublicKeyStringDef.DIRECT, strZLjUOn == null ? "" : strZLjUOn, zLjUOn());
                this.fIwbmz = str;
                this.getFieldNames = l;
                c13241dEa3 = this.AwvSrB;
                if (c13241dEa3 != null && (url = c13241dEa3.getUrl()) != null) {
                    str2 = url;
                }
                this.iwGUEr = str2;
            }
        }
        if (z) {
            isConnected();
            setWebViewListener$default(this, l, false, 2, null);
            java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                long jFetchVPNInfo = ((InterfaceC9731bbC) next).fetchVPNInfo();
                if (l != null && jFetchVPNInfo == l.longValue()) {
                    obj = next;
                    break;
                }
            }
            if (obj != null && (c13241dEa2 = this.AwvSrB) != null && (dgqRcXXUw = c13241dEa2.RcXXUw()) != null) {
                dgqRcXXUw.EZpvd(l);
            }
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), l != null ? l.longValue() : 637L, false, 2, null);
            if (chainMetaWithRealChainId$default == null || !chainMetaWithRealChainId$default.fIwbmz() || (c13241dEa = this.AwvSrB) == null || (dgqGEmmrt = c13241dEa.gEmmrt()) == null) {
                return;
            }
            dgqGEmmrt.EZpvd(l);
        }
    }

    @Override // o.dES
    public void QVAiDq() {
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        AbstractC13464dMh abstractC13464dMh = this.AubY;
        if (abstractC13464dMh != null && (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) != null) {
            dappBrowserMultiModeToolbar.setWalletWrapperVisible(false);
        }
        DappTabData dappTabDataUzCIH = uzCIH();
        if (dappTabDataUzCIH != null) {
            dappTabDataUzCIH.setConnectedByWalletConnect(false);
        }
    }

    public final void KWHzl(java.lang.Long l, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        C13181dBv c13181dBvDjBIcL;
        dGQ dgqAhwBna;
        dGQ dgqAhwBna2;
        C13284dFq c13284dFqQfsBiF;
        dGQ dgqGEmmrt;
        dGQ dgqGEmmrt2;
        C13241dEa c13241dEa;
        C13273dFf c13273dFfQUSxYX;
        C13241dEa c13241dEa2;
        dGQ dgqGEmmrt3;
        C13241dEa c13241dEa3;
        dGQ dgqRcXXUw;
        dGQ dgqRcXXUw2;
        dGQ dgqRcXXUw3;
        dFP dfpDjSkpj;
        dFP dfpDjSkpj2;
        C13273dFf c13273dFfQUSxYX2;
        C13273dFf c13273dFfQUSxYX3;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar;
        AbstractC13481dMy abstractC13481dMyKWHzl;
        android.widget.ImageView imageView;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar2;
        DappBrowserMultiModeToolbar dappBrowserMultiModeToolbar3;
        AbstractC13481dMy abstractC13481dMyKWHzl2;
        android.widget.ImageView imageView2;
        if (isAdded()) {
            java.lang.Object obj = null;
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && l != null && interfaceC9738bbJ != null) {
                DappTabData dappTabDataUzCIH = uzCIH();
                if (dappTabDataUzCIH == null || !dappTabDataUzCIH.isConnectedByWalletConnect()) {
                    AbstractC13464dMh abstractC13464dMh = this.AubY;
                    if (abstractC13464dMh != null && (dappBrowserMultiModeToolbar = abstractC13464dMh.AhwBna) != null && (abstractC13481dMyKWHzl = dappBrowserMultiModeToolbar.KWHzl()) != null && (imageView = abstractC13481dMyKWHzl.fARcdN) != null) {
                        Glide.EZpvd(this).OLrzqt(java.lang.Integer.valueOf(dLX.ActionBar.gEmmrt)).EZpvd(imageView);
                    }
                } else {
                    AbstractC13464dMh abstractC13464dMh2 = this.AubY;
                    if (abstractC13464dMh2 != null && (dappBrowserMultiModeToolbar3 = abstractC13464dMh2.AhwBna) != null && (abstractC13481dMyKWHzl2 = dappBrowserMultiModeToolbar3.KWHzl()) != null && (imageView2 = abstractC13481dMyKWHzl2.fARcdN) != null) {
                        Glide.EZpvd(this).OLrzqt(java.lang.Integer.valueOf(dLX.ActionBar.valueOf)).EZpvd(imageView2);
                    }
                }
                AbstractC13464dMh abstractC13464dMh3 = this.AubY;
                if (abstractC13464dMh3 != null && (dappBrowserMultiModeToolbar2 = abstractC13464dMh3.AhwBna) != null) {
                    dappBrowserMultiModeToolbar2.setWalletWrapperVisible(true);
                }
                C13241dEa c13241dEa4 = this.AwvSrB;
                setHost$default(this, c13241dEa4 != null ? c13241dEa4.getUrl() : null, false, 2, null);
            } else {
                QVAiDq();
            }
            C13241dEa c13241dEa5 = this.AwvSrB;
            if (c13241dEa5 != null && (c13273dFfQUSxYX3 = c13241dEa5.QUSxYX()) != null) {
                c13273dFfQUSxYX3.OLrzqt(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa6 = this.AwvSrB;
            if (c13241dEa6 != null && (c13273dFfQUSxYX2 = c13241dEa6.QUSxYX()) != null) {
                c13273dFfQUSxYX2.EZpvd(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa7 = this.AwvSrB;
            if (c13241dEa7 != null && (dfpDjSkpj2 = c13241dEa7.djSkpj()) != null) {
                dfpDjSkpj2.copydefault(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa8 = this.AwvSrB;
            if (c13241dEa8 != null && (dfpDjSkpj = c13241dEa8.djSkpj()) != null) {
                dfpDjSkpj.EZpvd(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa9 = this.AwvSrB;
            if (c13241dEa9 != null && (dgqRcXXUw3 = c13241dEa9.RcXXUw()) != null) {
                dgqRcXXUw3.OLrzqt(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa10 = this.AwvSrB;
            if (c13241dEa10 != null && (dgqRcXXUw2 = c13241dEa10.RcXXUw()) != null) {
                dgqRcXXUw2.copydefault(interfaceC9738bbJ);
            }
            java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                long jFetchVPNInfo = ((InterfaceC9731bbC) next).fetchVPNInfo();
                if (l != null && jFetchVPNInfo == l.longValue()) {
                    obj = next;
                    break;
                }
            }
            if (obj != null && (c13241dEa3 = this.AwvSrB) != null && (dgqRcXXUw = c13241dEa3.RcXXUw()) != null) {
                dgqRcXXUw.EZpvd(l);
            }
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), l != null ? l.longValue() : 637L, false, 2, null);
            if (chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.fIwbmz() && (c13241dEa2 = this.AwvSrB) != null && (dgqGEmmrt3 = c13241dEa2.gEmmrt()) != null) {
                dgqGEmmrt3.EZpvd(l);
            }
            InterfaceC9731bbC chainMetaWithRealChainId$default2 = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), l != null ? l.longValue() : 501L, false, 2, null);
            if (chainMetaWithRealChainId$default2 != null && chainMetaWithRealChainId$default2.fARcdN() && (c13241dEa = this.AwvSrB) != null && (c13273dFfQUSxYX = c13241dEa.QUSxYX()) != null) {
                c13273dFfQUSxYX.copydefault(l != null ? l.longValue() : 501L);
            }
            C13241dEa c13241dEa11 = this.AwvSrB;
            if (c13241dEa11 != null && (dgqGEmmrt2 = c13241dEa11.gEmmrt()) != null) {
                dgqGEmmrt2.OLrzqt(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa12 = this.AwvSrB;
            if (c13241dEa12 != null && (dgqGEmmrt = c13241dEa12.gEmmrt()) != null) {
                dgqGEmmrt.copydefault(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa13 = this.AwvSrB;
            if (c13241dEa13 != null && (c13284dFqQfsBiF = c13241dEa13.QfsBiF()) != null) {
                c13284dFqQfsBiF.EZpvd(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa14 = this.AwvSrB;
            if (c13241dEa14 != null && (dgqAhwBna2 = c13241dEa14.AhwBna()) != null) {
                dgqAhwBna2.OLrzqt(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa15 = this.AwvSrB;
            if (c13241dEa15 != null && (dgqAhwBna = c13241dEa15.AhwBna()) != null) {
                dgqAhwBna.copydefault(interfaceC9738bbJ);
            }
            C13241dEa c13241dEa16 = this.AwvSrB;
            if (c13241dEa16 != null && (c13181dBvDjBIcL = c13241dEa16.djBIcL()) != null) {
                c13181dBvDjBIcL.EZpvd(interfaceC9738bbJ);
            }
            this.AYXKKw = str;
            this.fetchVPNInfo = interfaceC9738bbJ;
            DappTabData dappTabDataUzCIH2 = uzCIH();
            if (dappTabDataUzCIH2 != null) {
                dappTabDataUzCIH2.setCurrentAddress(str);
            }
            DappTabData dappTabDataUzCIH3 = uzCIH();
            if (dappTabDataUzCIH3 != null) {
                dappTabDataUzCIH3.setCurrentWallet(interfaceC9738bbJ);
            }
            DappTabData dappTabDataUzCIH4 = uzCIH();
            if (dappTabDataUzCIH4 != null) {
                dappTabDataUzCIH4.setCurrentChainId(l);
            }
        }
    }

    public static final void RJOkX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(final InterfaceC9738bbJ interfaceC9738bbJ) {
        if (this.fetchVPNInfo != null) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
            final Function1 function1 = new Function1() { // from class: o.dCy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.AEQbTJ(this.EZpvd, interfaceC9738bbJ, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dCD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.RJOkX(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dCC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.AkhnZx((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dCF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.QVAiDq(function12, obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(dBW dbw, InterfaceC9738bbJ interfaceC9738bbJ, InterfaceC9738bbJ interfaceC9738bbJ2) {
        java.lang.String strDbNXlk = interfaceC9738bbJ2.DbNXlk();
        InterfaceC9738bbJ interfaceC9738bbJ3 = dbw.fetchVPNInfo;
        Intrinsics.copydefault(interfaceC9738bbJ3);
        if (!Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) interfaceC9738bbJ3.DbNXlk())) {
            InterfaceC9741bbM interfaceC9741bbMGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt();
            InterfaceC9738bbJ interfaceC9738bbJ4 = dbw.fetchVPNInfo;
            Intrinsics.copydefault(interfaceC9738bbJ4);
            AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(interfaceC9741bbMGEmmrt.copydefault(interfaceC9738bbJ4.DbNXlk()), dbw);
            final Function1 function1 = new Function1() { // from class: o.dCS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.EZpvd((java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dCQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.QOLQEE(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dCT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dBW.DbNXlk((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dCR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dBW.QKVWgx(function12, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            dbw.addDisposable(interfaceC58217yxCAEQbTJ);
        }
        if (interfaceC9738bbJ != null) {
            java.lang.String strDbNXlk2 = interfaceC9738bbJ.DbNXlk();
            InterfaceC9738bbJ interfaceC9738bbJ5 = dbw.fetchVPNInfo;
            Intrinsics.copydefault(interfaceC9738bbJ5);
            if (!Intrinsics.EZpvd((java.lang.Object) strDbNXlk2, (java.lang.Object) interfaceC9738bbJ5.DbNXlk())) {
                int i = dLX.Dialog.DarRvM;
                InterfaceC9738bbJ interfaceC9738bbJ6 = dbw.fetchVPNInfo;
                Intrinsics.copydefault(interfaceC9738bbJ6);
                dbw.OLrzqt(C33069mpW.copydefault(dbw, i, C56424yEw.AYXKKw(C56390yDp.OLrzqt("wallet", interfaceC9738bbJ6.AYXKKw()))));
            }
        }
        return Unit.INSTANCE;
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.dES
    public void AkhnZx() {
        int i;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        int iKWHzl = c15112dyF.KWHzl();
        if (c15112dyF.djBIcL().size() > 1) {
            if (iKWHzl == c15112dyF.djBIcL().size() - 1) {
                i = iKWHzl - 1;
                c15112dyF.KWHzl(c15112dyF.djBIcL().get(i));
            } else {
                i = iKWHzl + 1;
                c15112dyF.KWHzl(c15112dyF.djBIcL().get(i));
            }
            c15112dyF.copydefault(iKWHzl);
            SPUtils.put("LAST_TAB", java.lang.Integer.valueOf(i));
        } else {
            c15112dyF.copydefault(iKWHzl);
            fIwbmz();
        }
        OLrzqt(c15112dyF.KWHzl());
        QfsBiF();
    }

    @Override // o.dDI.ActionBar
    public void OLrzqt(int i) {
        if (i >= 0) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            if (i < c15112dyF.djBIcL().size()) {
                if (this.AwvSrB != null) {
                    AEQbTJ("browser_tab");
                }
                C14742drG.KWHzl.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i + 1)));
                onSelectedTab$default(this, i, null, null, 6, null);
                c15112dyF.KWHzl(i);
                OcIXYQ();
                sSMYrx();
                SPUtils.put("LAST_TAB", java.lang.Integer.valueOf(i));
            }
        }
    }

    @Override // o.dDI.ActionBar
    public void gHZMYf() {
        QfsBiF();
    }

    @Override // o.dDI.ActionBar
    public void AwvSrB() {
        QfsBiF();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        C57350ygk c57350ygkDbNXlk;
        super.onActivityResult(i, i2, intent);
        if (i == this.djBIcL) {
            if (this.zLjUOn != null) {
                android.net.Uri data = (intent == null || i2 != -1) ? null : intent.getData();
                if (data != null) {
                    C13241dEa c13241dEa = this.AwvSrB;
                    if (c13241dEa != null && (c57350ygkDbNXlk = c13241dEa.DbNXlk()) != null) {
                        java.lang.String path = data.getPath();
                        if (path == null) {
                            path = "";
                        }
                        c57350ygkDbNXlk.copydefault(path, data);
                    }
                    android.webkit.ValueCallback<android.net.Uri[]> valueCallback = this.zLjUOn;
                    Intrinsics.copydefault(valueCallback);
                    valueCallback.onReceiveValue(new android.net.Uri[]{data});
                } else {
                    android.webkit.ValueCallback<android.net.Uri[]> valueCallback2 = this.zLjUOn;
                    Intrinsics.copydefault(valueCallback2);
                    valueCallback2.onReceiveValue(null);
                }
            }
            this.zLjUOn = null;
            return;
        }
        if (i == this.gEmmrt && i2 == -1) {
            PlatformItem platformItem = intent != null ? (PlatformItem) intent.getParcelableExtra("item") : null;
            if (platformItem != null) {
                this.zsXlph = platformItem;
                java.lang.String url = platformItem.getUrl();
                AEQbTJ("discover_history");
                if (C33129mqd.OLrzqt((java.lang.CharSequence) url)) {
                    setHost$default(this, url, false, 2, null);
                    C13241dEa c13241dEa2 = this.AwvSrB;
                    if (c13241dEa2 != null) {
                        Intrinsics.copydefault((java.lang.Object) url);
                        c13241dEa2.loadUrl(url);
                    }
                }
            }
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt != null) {
                dappTabDataOLrzqt.setMItem(platformItem);
            }
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null) {
                dappTabDataOLrzqt2.setMTitle(platformItem != null ? platformItem.getPlatform() : null);
            }
            C13241dEa c13241dEa3 = this.AwvSrB;
            if (c13241dEa3 != null) {
                c13241dEa3.setMSiteName(null);
            }
            copydefault(platformItem);
        }
    }

    public final void copydefault(long j) {
        AEQbTJ(java.lang.Long.valueOf(j), this.fetchVPNInfo, (Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit>) null);
    }
}
