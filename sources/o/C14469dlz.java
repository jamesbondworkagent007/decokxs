package o;

import androidx.autofill.HintConstants;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC13826dZs;
import o.C11010bzJ;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14469dlz implements InterfaceC14518dmv {
    public final InterfaceC14457dln AEQbTJ;
    public final Function1<java.lang.String, Unit> AYXKKw;
    public final Function1<android.content.Intent, Unit> AhwBna;
    public final android.content.Context EZpvd;
    public final androidx.fragment.app.FragmentManager KWHzl;
    public final Function0<Unit> OLrzqt;
    public final java.lang.String copydefault;
    public final Function0<Unit> djBIcL;
    public final android.os.Bundle gEmmrt;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14469dlz(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, android.os.Bundle bundle, InterfaceC14457dln interfaceC14457dln, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super android.content.Intent, Unit> function12) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = fragmentManager;
        this.EZpvd = context;
        this.gEmmrt = bundle;
        this.AEQbTJ = interfaceC14457dln;
        this.AYXKKw = function1;
        this.OLrzqt = function0;
        this.djBIcL = function02;
        this.AhwBna = function12;
        this.copydefault = "CreateOrImportPasswordCheckStrategy";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r13v0 androidx.fragment.app.FragmentManager)
  (r14v0 android.content.Context)
  (r15v0 android.os.Bundle)
  (wrap:o.dln:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.dln) : (r16v0 o.dln))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r17v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r18v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001b: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r19v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0023: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r20v0 kotlin.jvm.functions.Function1))
 A[MD:(androidx.fragment.app.FragmentManager, android.content.Context, android.os.Bundle, o.dln, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit>):void (m)] (LINE:27) call: o.dlz.<init>(androidx.fragment.app.FragmentManager, android.content.Context, android.os.Bundle, o.dln, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C14469dlz(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, android.os.Bundle bundle, InterfaceC14457dln interfaceC14457dln, Function1 function1, Function0 function0, Function0 function02, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, context, bundle, (i & 8) != 0 ? null : interfaceC14457dln, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : function02, (i & 128) != 0 ? null : function12);
    }

    @Override // o.InterfaceC14518dmv
    public void EZpvd() {
        C10856bwO.copydefault(this.copydefault, 0, "checkPassword");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).EZpvd();
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(false);
        final Function2 function2 = new Function2() { // from class: o.dlK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14469dlz.copydefault((java.lang.Boolean) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtEZpvd, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.dly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14469dlz.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.dlD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.KWHzl(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dlC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14469dlz.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dlE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dlB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14469dlz.valueOf(function12, obj);
            }
        });
    }

    public static final java.lang.Boolean copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Boolean) function2.invoke(obj, obj2);
    }

    public static final java.lang.Boolean copydefault(java.lang.Boolean bool, java.lang.Boolean bool2) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        return java.lang.Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final C14469dlz c14469dlz, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            new C14513dmq(c14469dlz.KWHzl, "CreateOrImportPasswordCheckStrategy", c14469dlz.AYXKKw, c14469dlz.OLrzqt).EZpvd();
        } else if (C14471dmA.EZpvd.OLrzqt(C9678baC.Companion.AEQbTJ())) {
            android.content.Context context = c14469dlz.EZpvd;
            if (context != null) {
                C15689eRq.KWHzl.AEQbTJ(context, new Function1() { // from class: o.dlA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14469dlz.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue());
                    }
                });
            }
        } else {
            c14469dlz.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final C14469dlz c14469dlz, int i) {
        if (i == 0) {
            c14469dlz.EZpvd(HintConstants.AUTOFILL_HINT_PASSWORD);
            c14469dlz.AEQbTJ("no");
            c14469dlz.AEQbTJ();
        } else if (i == 1) {
            c14469dlz.EZpvd("biometrics");
            c14469dlz.AEQbTJ("yes");
            new C14430dlM(c14469dlz.KWHzl, "finger-create", true, null, null, new Function0() { // from class: o.dlO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14469dlz.AEQbTJ(this.OLrzqt);
                }
            }, false, 88, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C14469dlz c14469dlz) {
        C11010bzJ.ActionBar actionBar = C11010bzJ.Companion;
        AbstractC58260yxt<Unit> abstractC58260yxtAEQbTJ = C11010bzJ.ActionBar.getInstance$default(actionBar, null, 1, null).AEQbTJ(C11010bzJ.ActionBar.getInstance$default(actionBar, null, 1, null).OLrzqt(), false, "finger-create");
        final Function1 function1 = new Function1() { // from class: o.dlv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.KWHzl((Unit) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.dlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14469dlz.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dlF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dlH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14469dlz.AYXKKw(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dlJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dlG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14469dlz.djBIcL(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AYXKKw("finger-create");
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C14469dlz c14469dlz, java.lang.String str) {
        C14471dmA.EZpvd.OLrzqt();
        C13912dbY.copydefault.copydefault(false);
        C8342bAs c8342bAsEZpvd = C8342bAs.Companion.EZpvd();
        Intrinsics.copydefault((java.lang.Object) str);
        c8342bAsEZpvd.OLrzqt(str);
        Function1<java.lang.String, Unit> function1 = c14469dlz.AYXKKw;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C14469dlz c14469dlz, java.lang.Throwable th) {
        C10856bwO.copydefault(c14469dlz.copydefault, 0, "fail message=" + th);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3Onboarding_Pop_CreateWalletPassword_View", (TrackChannel[]) null, new Function1() { // from class: o.dlL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.AEQbTJ(str, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, C14469dlz c14469dlz, EventParamsList eventParamsList) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("password_type", str, true));
        eventParamsList.add(new EventParam("phone_model", "android", true));
        android.os.Bundle bundle = c14469dlz.gEmmrt;
        if (bundle != null && (string = bundle.getString("from")) != null) {
            C14494dmX.KWHzl.AEQbTJ(eventParamsList, string);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3HomePage_Pop_CreateWalletPassword_Click", (TrackChannel[]) null, new Function1() { // from class: o.dlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14469dlz.AEQbTJ(this.KWHzl, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C14469dlz c14469dlz, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("phone_model", "android", true));
        android.os.Bundle bundle = c14469dlz.gEmmrt;
        if (bundle != null && (string = bundle.getString("from")) != null) {
            C14494dmX.KWHzl.AEQbTJ(eventParamsList, string);
        }
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        Function0<Unit> function0 = this.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
        android.os.Bundle bundle = this.gEmmrt;
        if (bundle != null) {
            java.lang.String string = bundle.getString("from");
            java.lang.String str = string == null ? "" : string;
            java.lang.String string2 = this.gEmmrt.getString("mnemonic");
            java.lang.String str2 = string2 == null ? "" : string2;
            java.lang.String string3 = this.gEmmrt.getString(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY);
            java.lang.String str3 = string3 == null ? "" : string3;
            java.lang.Long lValueOf = this.gEmmrt.containsKey("chain_id") ? java.lang.Long.valueOf(this.gEmmrt.getLong("chain_id")) : null;
            java.lang.String string4 = this.gEmmrt.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            java.lang.String str4 = string4 == null ? "" : string4;
            int i = this.gEmmrt.getInt(OtcExtraKeys.MODE, 1);
            boolean z = this.gEmmrt.getBoolean("isNotNeedMPCCreateGuidePage", true);
            java.lang.String string5 = this.gEmmrt.getString(MTAnalysisConstants.Account.KEY_ACCOUNT);
            java.lang.String str5 = string5 == null ? "" : string5;
            boolean z2 = this.gEmmrt.getBoolean("isSmartContract", false);
            boolean z3 = this.gEmmrt.getBoolean("is_near_short_address", false);
            ActivityC13826dZs.Activity activity = ActivityC13826dZs.Companion;
            android.content.Context context = this.EZpvd;
            if (context == null) {
                return;
            }
            C9694baS.Companion.KWHzl(this.KWHzl, activity.EZpvd(context, str, null, str2, str3, lValueOf, str4, i, str5, z2, z3, z, this.AEQbTJ), new Function2() { // from class: o.dlN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C14469dlz.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        }
    }

    public static final Unit EZpvd(C14469dlz c14469dlz, int i, android.content.Intent intent) {
        Function1<android.content.Intent, Unit> function1;
        if (i == -1 && (function1 = c14469dlz.AhwBna) != null) {
            function1.invoke(intent);
        }
        return Unit.INSTANCE;
    }
}
