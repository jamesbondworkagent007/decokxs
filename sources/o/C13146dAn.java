package o;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.net.DappInfoByUrl;
import com.okinc.business.defi.dapp.net.DappListBean;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.web3.security.bridge.MnemonicKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC54829xWw;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13146dAn extends android.widget.FrameLayout {
    public C15059dxF AEQbTJ;
    public Function1<? super java.lang.Integer, Unit> AYXKKw;
    public android.content.Context AhwBna;
    public boolean EZpvd;
    public java.lang.Long KWHzl;
    public DappTabData OLrzqt;
    public dMA copydefault;
    public android.widget.LinearLayout djBIcL;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13146dAn(@NotNull android.content.Context context) {
        this(context, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13146dAn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappTabData(DappTabData dappTabData) {
        this.OLrzqt = dappTabData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickMenuListener(Function1<? super java.lang.Integer, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReminderLayout(android.widget.LinearLayout linearLayout) {
        this.djBIcL = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAddress(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r9v0 android.util.AttributeSet))
  (wrap:com.okinc.business.defi.dapp.webview.DappTabData:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.dapp.webview.DappTabData) : (r10v0 com.okinc.business.defi.dapp.webview.DappTabData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r12v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, android.util.AttributeSet, com.okinc.business.defi.dapp.webview.DappTabData, java.lang.String, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:66) call: o.dAn.<init>(android.content.Context, android.util.AttributeSet, com.okinc.business.defi.dapp.webview.DappTabData, java.lang.String, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C13146dAn(android.content.Context context, android.util.AttributeSet attributeSet, DappTabData dappTabData, java.lang.String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? null : dappTabData, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13146dAn(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, DappTabData dappTabData, java.lang.String str, Function1<? super java.lang.Integer, Unit> function1) {
        PlatformItem mItem;
        C13241dEa mWebView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = dappTabData;
        this.gEmmrt = str;
        this.AYXKKw = function1;
        this.AhwBna = context;
        this.AEQbTJ = new C15059dxF();
        this.KWHzl = 0L;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), dLX.Fragment.fIwbmz, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (dMA) viewDataBindingInflate;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        this.gEmmrt = dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getCurrentAddress() : null;
        this.OLrzqt = c15112dyF.OLrzqt();
        this.copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.dAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.AYXKKw(this.copydefault, view);
            }
        });
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.tIwhY);
        if (drawableKWHzl != null) {
            wYC wyc = this.copydefault.djBIcL;
            drawableKWHzl.setAutoMirrored(true);
            wyc.setImageDrawable(drawableKWHzl);
        }
        this.copydefault.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.dAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.OLrzqt(this.AEQbTJ, context, view);
            }
        });
        this.copydefault.values.setOnClickListener(new View.OnClickListener() { // from class: o.dAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.fIwbmz(this.OLrzqt, view);
            }
        });
        this.copydefault.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.dAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.AYXKKw(this.EZpvd, context, view);
            }
        });
        DappTabData dappTabData2 = this.OLrzqt;
        java.lang.Integer numValueOf = dappTabData2 != null ? java.lang.Integer.valueOf(dappTabData2.getWebViewUiMode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            this.copydefault.DbNXlk.setText(C33070mpX.AYXKKw(dLX.Dialog.isConnected));
            this.copydefault.AhwBna.setImageResource(C52761wXj.TaskDescription.OsDdEf);
        } else {
            this.copydefault.DbNXlk.setText(C33070mpX.AYXKKw(dLX.Dialog.djBIcL));
            this.copydefault.AhwBna.setImageResource(C52761wXj.TaskDescription.fDu);
        }
        this.copydefault.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.dAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.valueOf(this.KWHzl, view);
            }
        });
        this.copydefault.fARcdN.setOnClickListener(new View.OnClickListener() { // from class: o.dAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.fetchVPNInfo(this.EZpvd, view);
            }
        });
        this.copydefault.fARcdN.setVisibility(8);
        this.copydefault.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.dAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.AkhnZx(this.AEQbTJ, view);
            }
        });
        if (C14923duc.EZpvd.wlaJM()) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null && dappTabDataOLrzqt2.isTranslated()) {
                this.copydefault.fJNWhG.setVisibility(0);
                this.copydefault.ejfBZ.setText(C33070mpX.AYXKKw(dLX.Dialog.values));
            } else {
                this.copydefault.ejfBZ.setText(C33070mpX.AYXKKw(dLX.Dialog.AkhnZx));
                DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt3 != null && (mWebView = dappTabDataOLrzqt3.getMWebView()) != null) {
                    mWebView.OLrzqt(new Function1() { // from class: o.dAy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C13146dAn.KWHzl(this.OLrzqt, (java.lang.String) obj);
                        }
                    });
                }
            }
            this.copydefault.fJNWhG.setOnClickListener(new View.OnClickListener() { // from class: o.dAz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C13146dAn.DbNXlk(this.AEQbTJ, view);
                }
            });
        }
        this.copydefault.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.dAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.isConnected(this.EZpvd, view);
            }
        });
        this.copydefault.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.dAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.KWHzl(this.AEQbTJ, context, view);
            }
        });
        this.copydefault.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.dAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13146dAn.values(this.KWHzl, view);
            }
        });
        EZpvd();
        DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt4 == null || (mItem = dappTabDataOLrzqt4.getMItem()) == null || mItem.getId() != 0) {
            this.copydefault.valueOf.setVisibility(0);
        } else {
            this.copydefault.valueOf.setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.gEmmrt)) {
            this.copydefault.AYXKKw.setVisibility(0);
        } else {
            this.copydefault.AYXKKw.setVisibility(8);
        }
    }

    public static final void AYXKKw(final C13146dAn c13146dAn, android.view.View view) {
        C14742drG c14742drG = C14742drG.KWHzl;
        java.lang.String str = c13146dAn.EZpvd ? "unfavorite" : "favorite";
        DappTabData dappTabData = c13146dAn.OLrzqt;
        c14742drG.OLrzqt(str, dappTabData != null ? dappTabData.getMUrl() : null);
        c14742drG.AEQbTJ(!c13146dAn.EZpvd ? 1 : 0);
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(2);
        }
        C14923duc c14923duc = C14923duc.EZpvd;
        if (!c14923duc.zsXlph()) {
            android.content.Context context = c13146dAn.AhwBna;
            if (context instanceof AppCompatActivity) {
                Intrinsics.copydefault(context, "");
                kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc.AuCTel();
                androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C14923duc.showConnectWalletDialog$default(c14923duc, pairAuCTel, supportFragmentManager, new Function0() { // from class: o.dAD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C13146dAn.copydefault(this.EZpvd);
                    }
                }, null, 8, null);
                return;
            }
            return;
        }
        c13146dAn.AEQbTJ();
    }

    public static final Unit copydefault(C13146dAn c13146dAn) {
        c13146dAn.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C13146dAn c13146dAn, android.content.Context context, android.view.View view) {
        C32866mlf.onEvent$default("app_metax_discover_browser_function_copyurl_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabData = c13146dAn.OLrzqt;
        c14742drG.OLrzqt("copy_url", dappTabData != null ? dappTabData.getMUrl() : null);
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(4);
        }
        java.lang.Object systemService = context.getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
        DappTabData dappTabData2 = c13146dAn.OLrzqt;
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, dappTabData2 != null ? dappTabData2.getMUrl() : null));
        C55326xho.toastWithSuccessfulIcon$default(dLX.Dialog.DAIeex, 0, 1, (java.lang.Object) null);
    }

    public static final void fIwbmz(C13146dAn c13146dAn, android.view.View view) {
        java.lang.String mUrl;
        C32866mlf.onEvent$default("app_metax_discover_browser_function_share_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(5);
        }
        DappTabData dappTabData = c13146dAn.OLrzqt;
        if (dappTabData == null || (mUrl = dappTabData.getMUrl()) == null) {
            mUrl = "";
        }
        c13146dAn.OLrzqt(mUrl);
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabData2 = c13146dAn.OLrzqt;
        c14742drG.OLrzqt("share", dappTabData2 != null ? dappTabData2.getMUrl() : null);
    }

    public static final void AYXKKw(C13146dAn c13146dAn, final android.content.Context context, android.view.View view) {
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabData = c13146dAn.OLrzqt;
        c14742drG.OLrzqt("history", dappTabData != null ? dappTabData.getMUrl() : null);
        C32866mlf.onEvent$default("app_metax_discover_browser_function_history_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(6);
        }
        if (context instanceof AbstractActivityC33041mov) {
            InterfaceC9741bbM interfaceC9741bbMGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt();
            java.lang.String str = c13146dAn.gEmmrt;
            if (str == null) {
                str = "";
            }
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtAEQbTJ = interfaceC9741bbMGEmmrt.AEQbTJ(str);
            final Function1 function12 = new Function1() { // from class: o.dAw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13146dAn.EZpvd(context, (InterfaceC9738bbJ) obj);
                }
            };
            abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58227yxM() { // from class: o.dAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13146dAn.DbNXlk(function12, obj);
                }
            });
        }
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(android.content.Context context, InterfaceC9738bbJ interfaceC9738bbJ) {
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        android.app.Activity activity = (android.app.Activity) context;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("wallet_id", interfaceC9738bbJ.DbNXlk());
        Unit unit = Unit.INSTANCE;
        InterfaceC54829xWw.ActionBar.enterWalletHistory$default(interfaceC54829xWw, activity, bundle, false, false, false, 20, null);
        return unit;
    }

    public static final void valueOf(C13146dAn c13146dAn, android.view.View view) {
        C13241dEa mWebView;
        DappTabData dappTabData = c13146dAn.OLrzqt;
        if (dappTabData != null && dappTabData.getWebViewUiMode() == 1) {
            DappTabData dappTabData2 = c13146dAn.OLrzqt;
            if (dappTabData2 != null) {
                dappTabData2.setWebViewUiMode(2);
            }
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(dLX.Dialog.fIwbmz), 0, 1, (java.lang.Object) null);
            C14742drG c14742drG = C14742drG.KWHzl;
            DappTabData dappTabData3 = c13146dAn.OLrzqt;
            c14742drG.OLrzqt("request_mobile", dappTabData3 != null ? dappTabData3.getMUrl() : null);
        } else {
            C14742drG c14742drG2 = C14742drG.KWHzl;
            DappTabData dappTabData4 = c13146dAn.OLrzqt;
            c14742drG2.OLrzqt("request_pc", dappTabData4 != null ? dappTabData4.getMUrl() : null);
            DappTabData dappTabData5 = c13146dAn.OLrzqt;
            if (dappTabData5 != null) {
                dappTabData5.setWebViewUiMode(1);
            }
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(dLX.Dialog.fARcdN), 0, 1, (java.lang.Object) null);
        }
        DappTabData dappTabData6 = c13146dAn.OLrzqt;
        if (dappTabData6 != null && (mWebView = dappTabData6.getMWebView()) != null) {
            java.lang.String url = mWebView.getUrl();
            if (url == null) {
                url = "";
            }
            mWebView.djBIcL(url);
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            mWebView.evaluateJavascript("window.okxwallet.setPCMode(" + (dappTabDataOLrzqt != null && 1 == dappTabDataOLrzqt.getWebViewUiMode()) + ")", null);
            java.lang.String strIwGUEr = mWebView.iwGUEr();
            if (strIwGUEr != null) {
                pUU.copydefault("dappWebView PcMode  lastContentUrl", strIwGUEr);
                mWebView.loadUrl(strIwGUEr);
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(11);
        }
    }

    public static final void fetchVPNInfo(C13146dAn c13146dAn, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(14);
        }
    }

    public static final void AkhnZx(C13146dAn c13146dAn, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(-1);
        }
    }

    public static final Unit KWHzl(C13146dAn c13146dAn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) C59449zhJ.replace$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null), (java.lang.Object) MnemonicKt.MnemonicLanguageEnglish)) {
            pSC psc = pSC.AEQbTJ;
            if (Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.CHINESE) || Intrinsics.EZpvd(psc.AEQbTJ(), java.util.Locale.SIMPLIFIED_CHINESE)) {
                c13146dAn.copydefault.fJNWhG.setVisibility(0);
            } else {
                c13146dAn.copydefault.fJNWhG.setVisibility(8);
            }
        } else {
            c13146dAn.copydefault.fJNWhG.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(C13146dAn c13146dAn, android.view.View view) {
        C13241dEa mWebView;
        C13241dEa mWebView2;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt != null && dappTabDataOLrzqt.isTranslated()) {
            C14742drG c14742drG = C14742drG.KWHzl;
            DappTabData dappTabData = c13146dAn.OLrzqt;
            c14742drG.OLrzqt("show_original", dappTabData != null ? dappTabData.getMUrl() : null);
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null && (mWebView2 = dappTabDataOLrzqt2.getMWebView()) != null) {
                mWebView2.RlQdEF();
            }
            DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt3 != null) {
                dappTabDataOLrzqt3.setTranslated(false);
            }
        } else {
            C14742drG c14742drG2 = C14742drG.KWHzl;
            DappTabData dappTabData2 = c13146dAn.OLrzqt;
            c14742drG2.OLrzqt("translate", dappTabData2 != null ? dappTabData2.getMUrl() : null);
            DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt4 != null && (mWebView = dappTabDataOLrzqt4.getMWebView()) != null) {
                mWebView.QKudOq();
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(12);
        }
    }

    public static final void isConnected(C13146dAn c13146dAn, android.view.View view) {
        C13241dEa mWebView;
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(1);
        }
        C32866mlf.onEvent$default("app_metax_discover_browser_function_refresh_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
            mWebView.reload();
        }
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
        c14742drG.OLrzqt("refresh", dappTabDataOLrzqt2 != null ? dappTabDataOLrzqt2.getMUrl() : null);
    }

    public static final void KWHzl(C13146dAn c13146dAn, android.content.Context context, android.view.View view) {
        java.io.File[] fileArrListFiles;
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabData = c13146dAn.OLrzqt;
        c14742drG.OLrzqt("clear_cache", dappTabData != null ? dappTabData.getMUrl() : null);
        try {
            java.util.Iterator<T> it = C15112dyF.AEQbTJ.djBIcL().iterator();
            while (it.hasNext()) {
                C13241dEa mWebView = ((DappTabData) it.next()).getMWebView();
                if (mWebView != null) {
                    mWebView.clearCache(true);
                    mWebView.clearHistory();
                    mWebView.clearFormData();
                }
            }
            java.lang.String absolutePath = C54819xWm.KWHzl().AEQbTJ().getDataDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            java.io.File file = new java.io.File(absolutePath);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (java.io.File file2 : fileArrListFiles) {
                    java.lang.String absolutePath2 = file2.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath2, "");
                    java.util.Locale locale = java.util.Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String lowerCase = absolutePath2.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "webview", false, 2, (java.lang.Object) null)) {
                        Intrinsics.copydefault(file2);
                        c13146dAn.KWHzl(file2);
                    }
                }
            }
            java.io.File file3 = new java.io.File(C54819xWm.KWHzl().AEQbTJ().getCacheDir().getAbsolutePath() + "/WebView");
            if (file3.exists()) {
                c13146dAn.KWHzl(file3);
            }
        } catch (java.lang.Exception unused) {
        }
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(9);
        }
        java.lang.String string = context.getString(dLX.Dialog.QOLQEE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public static final void values(C13146dAn c13146dAn, android.view.View view) {
        PlatformItem mItem;
        PlatformItem mItem2;
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabData = c13146dAn.OLrzqt;
        PlatformItem platformItemCopy = null;
        c14742drG.OLrzqt("dapp_detail", dappTabData != null ? dappTabData.getMUrl() : null);
        if (C54819xWm.KWHzl().AEQbTJ() instanceof ComponentActivity) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            long id = (dappTabDataOLrzqt == null || (mItem2 = dappTabDataOLrzqt.getMItem()) == null) ? 0L : mItem2.getId();
            if (id == 0) {
                java.lang.Long l = c13146dAn.KWHzl;
                id = l != null ? l.longValue() : 0L;
            }
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null && (mItem = dappTabDataOLrzqt2.getMItem()) != null) {
                platformItemCopy = mItem.copy((16383 & 1) != 0 ? mItem.id : 0L, (16383 & 2) != 0 ? mItem.platform : null, (16383 & 4) != 0 ? mItem.logo : null, (16383 & 8) != 0 ? mItem.network : null, (16383 & 16) != 0 ? mItem.tvl : null, (16383 & 32) != 0 ? mItem.intro : null, (16383 & 64) != 0 ? mItem.tag : null, (16383 & 128) != 0 ? mItem.type : null, (16383 & 256) != 0 ? mItem.url : null, (16383 & 512) != 0 ? mItem.dau : null, (16383 & 1024) != 0 ? mItem.timeStamp : 0L, (16383 & 2048) != 0 ? mItem.drawableRes : 0, (16383 & 4096) != 0 ? mItem.category : null, (16383 & 8192) != 0 ? mItem.contract : null);
            }
            PlatformItem platformItem = platformItemCopy;
            if (platformItem != null) {
                platformItem.setId(id);
            }
            if (platformItem != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.copydefault(activityAEQbTJ, "");
                C14923duc.showDappWaringDialog$default(c14923duc, (ComponentActivity) activityAEQbTJ, platformItem, false, null, 8, null);
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = c13146dAn.AYXKKw;
        if (function1 != null) {
            function1.invoke(10);
        }
    }

    public final void KWHzl(java.io.File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    java.io.File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (java.io.File file2 : fileArrListFiles) {
                            Intrinsics.copydefault(file2);
                            KWHzl(file2);
                        }
                    }
                    file.delete();
                    return;
                }
                file.delete();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void AEQbTJ() {
        java.lang.String category;
        PlatformItem mItem;
        java.lang.String mUrl;
        java.lang.String mUrl2;
        java.lang.Long l = this.KWHzl;
        if (l != null && l.longValue() == 0 && !this.EZpvd) {
            if (this.AhwBna instanceof AppCompatActivity) {
                C14802dsN c14802dsNOLrzqt = C14802dsN.Companion.OLrzqt();
                android.content.Context context = this.AhwBna;
                Intrinsics.copydefault(context, "");
                androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c14802dsNOLrzqt.show(supportFragmentManager, C13146dAn.class.getName());
                return;
            }
            return;
        }
        C15059dxF c15059dxF = this.AEQbTJ;
        java.lang.Long l2 = this.KWHzl;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        java.lang.Long l3 = this.KWHzl;
        int i = (l3 != null ? l3.longValue() : 0L) == 0 ? 1 : 0;
        DappTabData dappTabData = this.OLrzqt;
        java.lang.String str = (dappTabData == null || (mUrl2 = dappTabData.getMUrl()) == null) ? "" : mUrl2;
        java.lang.String strCopydefault = copydefault();
        C14923duc c14923duc = C14923duc.EZpvd;
        DappTabData dappTabData2 = this.OLrzqt;
        java.lang.String strAEQbTJ = c14923duc.AEQbTJ(dappTabData2 != null ? dappTabData2.getMUrl() : null);
        DappTabData dappTabData3 = this.OLrzqt;
        java.lang.String str2 = (dappTabData3 == null || (mUrl = dappTabData3.getMUrl()) == null) ? "" : mUrl;
        DappTabData dappTabData4 = this.OLrzqt;
        if (dappTabData4 == null || (mItem = dappTabData4.getMItem()) == null || (category = mItem.getCategory()) == null) {
            category = "5";
        }
        AbstractC58185ywX<ResponseData<java.lang.Boolean>> abstractC58185ywXCopydefault = c15059dxF.copydefault(jLongValue, i, str, strCopydefault, strAEQbTJ, str2, StringsKt__StringNumberConversionsKt.toIntOrNull(category), this.EZpvd ? 2 : 1);
        final Function1 function1 = new Function1() { // from class: o.dAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13146dAn.AEQbTJ(this.AEQbTJ, (ResponseData) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13146dAn.AkhnZx(function1, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C13146dAn c13146dAn, ResponseData responseData) {
        java.lang.String mUrl;
        c13146dAn.EZpvd = !c13146dAn.EZpvd;
        DappListBean dappListBean = new DappListBean(0L, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        dappListBean.setFav(c13146dAn.EZpvd);
        java.lang.Long l = c13146dAn.KWHzl;
        dappListBean.setId(l != null ? l.longValue() : 0L);
        dappListBean.setName(c13146dAn.copydefault());
        DappTabData dappTabData = c13146dAn.OLrzqt;
        if (dappTabData == null || (mUrl = dappTabData.getMUrl()) == null) {
            mUrl = "";
        }
        dappListBean.setUrl(mUrl);
        RxBus.AEQbTJ(dappListBean);
        if (c13146dAn.EZpvd) {
            C55326xho.toastWithSuccessfulIcon$default(dLX.Dialog.DXXBbs, 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithSuccessfulIcon$default(dLX.Dialog.OqFWZa, 0, 1, (java.lang.Object) null);
        }
        C14742drG.KWHzl.copydefault("browser", c13146dAn.EZpvd ? "add" : "remove");
        c13146dAn.setCollectIcon();
        C7323ahf.KWHzl().AEQbTJ("refreshFavourite", null, null);
        return Unit.INSTANCE;
    }

    private final java.lang.String copydefault() {
        PlatformItem mItem;
        java.lang.String platform;
        PlatformItem mItem2;
        java.lang.String platform2;
        java.lang.String title;
        DappTabData dappTabData = this.OLrzqt;
        if (dappTabData == null || (mItem2 = dappTabData.getMItem()) == null || (platform2 = mItem2.getPlatform()) == null || platform2.length() != 0) {
            DappTabData dappTabData2 = this.OLrzqt;
            return (dappTabData2 == null || (mItem = dappTabData2.getMItem()) == null || (platform = mItem.getPlatform()) == null) ? "" : platform;
        }
        DappTabData dappTabData3 = this.OLrzqt;
        return (dappTabData3 == null || (title = dappTabData3.getTitle()) == null) ? "" : title;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.String str) {
        DappTabData dappTabData;
        DappTabData dappTabData2;
        java.lang.String str2;
        java.lang.String title;
        java.lang.String title2;
        java.lang.String title3;
        ImageSource imageSourceOLrzqt;
        PlatformItem mItem;
        PlatformItem mItem2;
        C13241dEa mWebView;
        DappTabData dappTabData3 = this.OLrzqt;
        if ((dappTabData3 == null || (mWebView = dappTabData3.getMWebView()) == null || !mWebView.ORxRYg()) && (((dappTabData = this.OLrzqt) == null || (title3 = dappTabData.getTitle()) == null || title3.length() != 0) && ((dappTabData2 = this.OLrzqt) == null || (title2 = dappTabData2.getTitle()) == null || !title2.equals("Unknown")))) {
            DappTabData dappTabData4 = this.OLrzqt;
            if (dappTabData4 == null || (title = dappTabData4.getTitle()) == null) {
                str2 = "";
            }
            Intrinsics.copydefault((java.lang.Object) str2);
            if (getContext() instanceof AbstractActivityC33041mov) {
                return;
            }
            ImageSource.StateListAnimator stateListAnimator = ImageSource.Companion;
            ImageSource imageSourceAEQbTJ = stateListAnimator.AEQbTJ(dLX.ActionBar.AYXKKw);
            DappTabData dappTabData5 = this.OLrzqt;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((dappTabData5 == null || (mItem2 = dappTabData5.getMItem()) == null) ? null : mItem2.getLogo()))) {
                DappTabData dappTabData6 = this.OLrzqt;
                java.lang.String logo = (dappTabData6 == null || (mItem = dappTabData6.getMItem()) == null) ? null : mItem.getLogo();
                Intrinsics.copydefault((java.lang.Object) logo);
                imageSourceOLrzqt = stateListAnimator.OLrzqt(logo);
            } else {
                imageSourceOLrzqt = imageSourceAEQbTJ;
            }
            ShareConfig.ActionBar actionBar = ShareConfig.Companion;
            LinkShareParams linkShareParamsCreate$default = LinkShareParams.Activity.create$default(LinkShareParams.Companion, str, null, 2, null);
            linkShareParamsCreate$default.setShareFrom("OKWalletDiscover");
            ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(actionBar, linkShareParamsCreate$default, null, 2, null);
            shareConfigCreate$default.setPreviewConfig(LinkDefaultPreviewConfig.Activity.create$default(LinkDefaultPreviewConfig.Companion, str2, str, imageSourceOLrzqt, null, null, null, 56, null));
            InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
            android.content.Context context = getContext();
            Intrinsics.copydefault(context, "");
            interfaceC48893ueK.copydefault((AbstractActivityC33041mov) context, shareConfigCreate$default);
            return;
        }
        title = getContext().getString(dLX.Dialog.getNewProxyInstance);
        str2 = title;
        Intrinsics.copydefault((java.lang.Object) str2);
        if (getContext() instanceof AbstractActivityC33041mov) {
        }
    }

    public final void setCollectIcon() {
        if (this.EZpvd) {
            this.copydefault.copydefault.setImageResource(C52761wXj.TaskDescription.QezThh);
            this.copydefault.copydefault.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this.AhwBna, C52761wXj.Activity.DQzvGNdrmXxu)));
            this.copydefault.fIwbmz.setText(getContext().getString(dLX.Dialog.AhwBna));
        } else {
            this.copydefault.copydefault.setImageResource(C52761wXj.TaskDescription.UkCIYP);
            this.copydefault.copydefault.setImageTintList(android.content.res.ColorStateList.valueOf(getContext().getResources().getColor(C52761wXj.Activity.fdOvFl)));
            this.copydefault.fIwbmz.setText(getContext().getString(dLX.Dialog.AYXKKw));
        }
    }

    public final void KWHzl() {
        java.lang.String category;
        PlatformItem mItem;
        java.lang.String mUrl;
        if (this.AhwBna instanceof AppCompatActivity) {
            C15059dxF c15059dxF = this.AEQbTJ;
            java.lang.Long l = this.KWHzl;
            int i = (l != null ? l.longValue() : 0L) == 0 ? 1 : 0;
            java.lang.Long l2 = this.KWHzl;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            DappTabData dappTabData = this.OLrzqt;
            java.lang.String str = (dappTabData == null || (mUrl = dappTabData.getMUrl()) == null) ? "" : mUrl;
            DappTabData dappTabData2 = this.OLrzqt;
            if (dappTabData2 == null || (mItem = dappTabData2.getMItem()) == null || (category = mItem.getCategory()) == null) {
                category = "5";
            }
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c15059dxF.copydefault(java.lang.Integer.valueOf(i), jLongValue, str, category), (Function1) null, 1, (java.lang.Object) null);
            android.content.Context context = this.AhwBna;
            Intrinsics.copydefault(context, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXUnwrapResponseData$default, (AppCompatActivity) context);
            final Function1 function1 = new Function1() { // from class: o.dAr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13146dAn.copydefault(this.KWHzl, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dAq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13146dAn.gEmmrt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dAC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13146dAn.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dAH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13146dAn.valueOf(function12, obj);
                }
            });
        }
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C13146dAn c13146dAn, java.lang.Boolean bool) {
        c13146dAn.EZpvd = bool.booleanValue();
        c13146dAn.setCollectIcon();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd() {
        java.lang.String mUrl;
        if (this.AhwBna instanceof AppCompatActivity) {
            C15059dxF c15059dxF = this.AEQbTJ;
            DappTabData dappTabData = this.OLrzqt;
            if (dappTabData == null || (mUrl = dappTabData.getMUrl()) == null) {
                mUrl = "";
            }
            AbstractC58185ywX<ResponseData<DappInfoByUrl>> abstractC58185ywXOLrzqt = c15059dxF.OLrzqt(mUrl);
            android.content.Context context = this.AhwBna;
            Intrinsics.copydefault(context, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXOLrzqt, (AppCompatActivity) context);
            final Function1 function1 = new Function1() { // from class: o.dAA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13146dAn.EZpvd(this.EZpvd, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dAG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13146dAn.djBIcL(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dAF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13146dAn.EZpvd(this.OLrzqt, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dAJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13146dAn.AhwBna(function12, obj);
                }
            });
        }
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C13146dAn c13146dAn, ResponseData responseData) {
        java.lang.String id;
        java.lang.Long lValueOf = null;
        if ((responseData != null ? (DappInfoByUrl) responseData.getData() : null) != null && responseData.getCode() == 0) {
            DappInfoByUrl dappInfoByUrl = (DappInfoByUrl) responseData.getData();
            if (dappInfoByUrl != null && (id = dappInfoByUrl.getId()) != null) {
                lValueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(id));
            }
            c13146dAn.KWHzl = lValueOf;
            c13146dAn.copydefault.valueOf.setVisibility(0);
        } else {
            c13146dAn.KWHzl = 0L;
        }
        c13146dAn.KWHzl();
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C13146dAn c13146dAn, java.lang.Throwable th) {
        c13146dAn.KWHzl();
        return Unit.INSTANCE;
    }
}
