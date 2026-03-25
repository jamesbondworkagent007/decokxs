package o;

import androidx.databinding.DataBindingUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.immomo.mls.InitData;
import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.dapp.bridge.DappDeepLinkBridge;
import com.okinc.mln_ui.ui.okkit.UDGlobalValue;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.net.URLDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43294rma;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15085dxf extends AbstractC43061riF {
    public static boolean EZpvd;
    public static java.lang.String OLrzqt;
    public AbstractC13468dMl AEQbTJ;
    public final int KWHzl = dLX.Fragment.valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "DAppHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13468dMl abstractC13468dMl = this.AEQbTJ;
        Intrinsics.copydefault(abstractC13468dMl);
        android.widget.FrameLayout frameLayout = abstractC13468dMl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    /* JADX INFO: renamed from: o.dxf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dxf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C15085dxf AEQbTJ() {
            return new C15085dxf();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC13468dMl abstractC13468dMl = (AbstractC13468dMl) DataBindingUtil.bind(view);
        this.AEQbTJ = abstractC13468dMl;
        if (abstractC13468dMl != null && (frameLayout = abstractC13468dMl.KWHzl) != null) {
            frameLayout.setContentDescription("web3_discover_luahome_page");
        }
        C15152dyt.EZpvd.KWHzl();
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onInvisible() {
        EZpvd = false;
        super.onInvisible();
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        java.lang.String string;
        java.lang.String strDecode;
        C15142dyj c15142dyj = C15142dyj.EZpvd;
        if (c15142dyj.KWHzl().isEmpty()) {
            C15142dyj.getRegexJson$default(c15142dyj, null, 1, null);
        }
        EZpvd = true;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt)) {
            java.lang.String str = OLrzqt;
            Intrinsics.copydefault((java.lang.Object) str);
            Intrinsics.copydefault((java.lang.Object) str);
            if (C59449zhJ.startsWith$default(str, "metaX/dapp/details", false, 2, null) || C59449zhJ.startsWith$default(str, "wallet/dapp/details", false, 2, null)) {
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) ContainerUtils.FIELD_DELIMITER, false, 2, (java.lang.Object) null)) {
                    java.lang.String strSubstring = str.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, "dappUrl=", 0, false, 6, (java.lang.Object) null) + 8, StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, ContainerUtils.FIELD_DELIMITER, 0, false, 6, (java.lang.Object) null));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strSubstring).toString();
                } else {
                    java.lang.String strSubstring2 = str.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, "dappUrl=", 0, false, 6, (java.lang.Object) null) + 8);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strSubstring2).toString();
                }
                java.lang.String str2 = OLrzqt;
                OLrzqt = null;
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
                    try {
                        strDecode = URLDecoder.decode(string, "utf-8");
                    } catch (java.lang.Exception unused) {
                        strDecode = string;
                    }
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String lowerCase = strDecode.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (!C59449zhJ.startsWith$default(lowerCase, "http", false, 2, null)) {
                        strDecode = DefaultWebClient.HTTPS_SCHEME + string;
                    }
                    C15142dyj c15142dyj2 = C15142dyj.EZpvd;
                    java.lang.String strDjBIcL = c15142dyj2.djBIcL(strDecode);
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strDjBIcL)) {
                        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                        android.content.Context contextRequireContext = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, contextRequireContext, strDjBIcL, null, new Function1() { // from class: o.dxi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C15085dxf.copydefault((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                        return;
                    }
                    Intrinsics.copydefault((java.lang.Object) str2);
                    DappDeepLinkBridge.KWHzl(str2, c15142dyj2.OLrzqt(str2));
                }
            } else {
                java.lang.String str3 = OLrzqt;
                Intrinsics.copydefault((java.lang.Object) str3);
                DappDeepLinkBridge.KWHzl(str3, c15142dyj.OLrzqt(str3));
            }
        }
        super.onVisible();
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/home", null, 4, null);
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UDGlobalValue.AEQbTJ();
        dDN.copydefault.OLrzqt();
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("appearance", "alternativeweb3"));
    }
}
