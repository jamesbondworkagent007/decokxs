package o;

import androidx.collection.ArrayMapKt;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC54855xXv;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24339ibv {
    public final java.lang.Object AEQbTJ;
    public SwapState EZpvd;
    public boolean KWHzl;
    public final boolean OLrzqt;
    public final TokenBase copydefault;
    public java.lang.String gEmmrt;
    public final AbstractC28336kXq valueOf;

    /* JADX INFO: renamed from: o.ibv$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.BLACK_ADDRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.SWITCH_WALLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapState.NO_LIQUIDITY_AT_THE_MOMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwapState.MPC_WALLET_LEGAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH_WARNING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SwapState.STAND_BY_LEVERAGE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SwapState.SAFEMOON_COIN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SwapState.SWAP_UNSUPPORTED_FOR_DAPP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[SwapState.NO_QUOTE_FETCHED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[SwapState.FETCHING_ERROR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[SwapState.NO_WALLET.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[SwapState.SA_EXPIRING_SOON.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return true;
    }

    public C24339ibv(@NotNull java.lang.String str, boolean z, @NotNull TokenBase tokenBase, @NotNull AbstractC28336kXq abstractC28336kXq, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(abstractC28336kXq, "");
        this.gEmmrt = str;
        this.OLrzqt = z;
        this.copydefault = tokenBase;
        this.valueOf = abstractC28336kXq;
        this.KWHzl = z2;
        this.AEQbTJ = new java.lang.Object();
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.ibv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateErrorState$default(C24339ibv c24339ibv, SwapState swapState, androidx.fragment.app.FragmentManager fragmentManager, MemeErrorNoticeView memeErrorNoticeView, Function2 function2, Function1 function1, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        c24339ibv.AEQbTJ(swapState, fragmentManager, memeErrorNoticeView, function2, function1, (i & 32) != 0 ? null : str, (i & 64) != 0 ? new Function0() { // from class: o.ibB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24339ibv.EZpvd();
            }
        } : function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull SwapState swapState, @NotNull androidx.fragment.app.FragmentManager fragmentManager, MemeErrorNoticeView memeErrorNoticeView, Function2<? super java.lang.Boolean, ? super SwapState, Unit> function2, Function1<? super java.lang.Boolean, Unit> function1, java.lang.String str, @NotNull Function0<Unit> function0) {
        java.lang.CharSequence charSequenceAYXKKw;
        int i;
        androidx.collection.ArrayMap arrayMap;
        Function0<Unit> function0BuildCallback$default;
        Function0<Unit> function02;
        java.lang.CharSequence charSequenceKWHzl;
        MemeErrorNoticeView.Level level;
        java.lang.String string;
        java.lang.CharSequence charSequence;
        boolean z;
        java.lang.String strAYXKKw;
        java.lang.String strKWHzl;
        MemeErrorNoticeView.Level level2;
        MemeErrorNoticeView.Level level3;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = swapState;
        Function0<Unit> function03 = new Function0() { // from class: o.ibD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24339ibv.gEmmrt();
            }
        };
        MemeErrorNoticeView.Level level4 = MemeErrorNoticeView.Level.Warning;
        boolean z2 = true;
        boolean zEZpvd = false;
        if (this.KWHzl) {
            charSequenceAYXKKw = C22334hdR.OLrzqt(true, this.OLrzqt || (swapState != SwapState.SWAP_UNSUPPORTED_FOR_DAPP));
        } else {
            switch (TaskDescription.EZpvd[swapState.ordinal()]) {
                case 1:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKtBackHandler3);
                    level4 = MemeErrorNoticeView.Level.Error;
                    z2 = true;
                    charSequence3 = "";
                    charSequenceKWHzl = charSequenceAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    zEZpvd = false;
                    charSequence2 = charSequence3;
                    charSequence = charSequence2;
                    string = charSequence2;
                    break;
                case 2:
                    java.lang.String strAYXKKw2 = C22372heC.AEQbTJ(this.gEmmrt) ? C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi181) : "";
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.gtdfxv);
                    androidx.collection.ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chain", this.copydefault.getChainName()));
                    long jValueOf = C33129mqd.valueOf(this.copydefault.getChainId());
                    InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.gEmmrt).fARcdN().valueOf();
                    int i2 = C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
                    if (interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.gHZMYf()) {
                        function0BuildCallback$default = KWHzl(fragmentManager, function1, jValueOf, new Function1() { // from class: o.ibE
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(C24339ibv.OLrzqt((InterfaceC9738bbJ) obj));
                            }
                        });
                    } else if (interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.ORxRYg()) {
                        function0BuildCallback$default = KWHzl(fragmentManager, function1, jValueOf, new Function1() { // from class: o.ibC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(C24339ibv.AhwBna((InterfaceC9738bbJ) obj));
                            }
                        });
                    } else {
                        i = i2;
                        arrayMap = arrayMapArrayMapOf;
                        function0BuildCallback$default = buildCallback$default(this, fragmentManager, function1, jValueOf, null, 8, null);
                        function02 = function0BuildCallback$default;
                        charSequenceKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), i, arrayMap);
                        level = level4;
                        string = strAYXKKw2;
                        charSequence = strAYXKKw3;
                        z = true;
                        z2 = false;
                        zEZpvd = false;
                    }
                    i = i2;
                    arrayMap = arrayMapArrayMapOf;
                    function02 = function0BuildCallback$default;
                    charSequenceKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), i, arrayMap);
                    level = level4;
                    string = strAYXKKw2;
                    charSequence = strAYXKKw3;
                    z = true;
                    z2 = false;
                    zEZpvd = false;
                    break;
                case 3:
                    C24694iif c24694iifAEQbTJ = C24695iig.AEQbTJ(this.gEmmrt, true);
                    androidx.collection.ArrayMap arrayMapArrayMapOf2 = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Integer.valueOf(c24694iifAEQbTJ.AEQbTJ())), 0, null, 3, null)));
                    int i3 = C23274hvD.FragmentManager.EZpvd;
                    C32979mnm c32979mnm = C32979mnm.EZpvd;
                    charSequenceKWHzl = pTD.EZpvd(c32979mnm.OLrzqt(), i3, c24694iifAEQbTJ.AEQbTJ(), arrayMapArrayMapOf2);
                    function02 = function0;
                    string = c32979mnm.OLrzqt().getString(C23274hvD.Fragment.uzCIH);
                    level = level4;
                    z = true;
                    charSequence = "";
                    break;
                case 4:
                    strAYXKKw = "";
                    zEZpvd = EZpvd(memeErrorNoticeView, C22380heK.OLrzqt.copydefault(this.gEmmrt).fARcdN().valueOf(), this.valueOf.fIwbmz());
                    strKWHzl = strAYXKKw;
                    string = "";
                    charSequenceKWHzl = strAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    charSequence = strKWHzl;
                    break;
                case 5:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestBuilderFlag);
                    level4 = MemeErrorNoticeView.Level.Error;
                    break;
                case 6:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setFillInIntent);
                    level2 = MemeErrorNoticeView.Level.Error;
                    level4 = level2;
                    z2 = false;
                    charSequence3 = "";
                    charSequenceKWHzl = charSequenceAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    zEZpvd = false;
                    charSequence2 = charSequence3;
                    charSequence = charSequence2;
                    string = charSequence2;
                    break;
                case 7:
                    strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onItemLoaded, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", this.copydefault.getTokenSymbol())));
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestBuilderFlag);
                    string = "";
                    charSequenceKWHzl = strAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    charSequence = strKWHzl;
                    break;
                case 8:
                    if (this.copydefault.isSafeMoonCoinToken() && this.OLrzqt) {
                        strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QgUVrU, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", this.copydefault.getTokenSymbol())));
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.onServiceDisconnected);
                        level3 = MemeErrorNoticeView.Level.Error;
                        level4 = level3;
                        string = "";
                        charSequenceKWHzl = strAYXKKw;
                        function02 = function03;
                        level = level4;
                        z = true;
                        charSequence = strKWHzl;
                    } else {
                        charSequenceKWHzl = "";
                        charSequence3 = charSequenceKWHzl;
                        function02 = function03;
                        level = level4;
                        z = false;
                        z2 = false;
                        zEZpvd = false;
                        charSequence2 = charSequence3;
                        charSequence = charSequence2;
                        string = charSequence2;
                    }
                    break;
                case 9:
                    strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.onSearchResult);
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItem1);
                    string = "";
                    charSequenceKWHzl = strAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    charSequence = strKWHzl;
                    break;
                case 10:
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.valueOf.copydefault(this.copydefault.getChainId(), this.copydefault.getTokenContractAddress());
                    java.lang.String tokenSymbol = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenSymbol() : null;
                    if (tokenSymbol == null) {
                        tokenSymbol = "";
                    }
                    strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.setContent);
                    strAYXKKw = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.setOwners, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("ccy", tokenSymbol), C56390yDp.OLrzqt("ccy", tokenSymbol)));
                    string = "";
                    charSequenceKWHzl = strAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    charSequence = strKWHzl;
                    break;
                case 11:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sVXHln);
                    break;
                case 12:
                    strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.DGUQLI);
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ);
                    level3 = MemeErrorNoticeView.Level.Error;
                    level4 = level3;
                    string = "";
                    charSequenceKWHzl = strAYXKKw;
                    function02 = function03;
                    level = level4;
                    z = true;
                    charSequence = strKWHzl;
                    break;
                case 13:
                    if (!this.OLrzqt) {
                        charSequenceKWHzl = "";
                        charSequence3 = charSequenceKWHzl;
                        function02 = function03;
                        level = level4;
                        z = false;
                        z2 = false;
                        zEZpvd = false;
                        charSequence2 = charSequence3;
                        charSequence = charSequence2;
                        string = charSequence2;
                    } else {
                        charSequenceKWHzl = "";
                        charSequence2 = charSequenceKWHzl;
                        function02 = function03;
                        level = level4;
                        z = false;
                        charSequence = charSequence2;
                        string = charSequence2;
                    }
                    break;
                case 14:
                    charSequenceKWHzl = "";
                    charSequence3 = charSequenceKWHzl;
                    function02 = function03;
                    level = level4;
                    z = false;
                    z2 = false;
                    zEZpvd = false;
                    charSequence2 = charSequence3;
                    charSequence = charSequence2;
                    string = charSequence2;
                    break;
                default:
                    if (C31212lpk.copydefault.OLrzqt(C33129mqd.AhwBna(str))) {
                        charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setFillInIntent);
                        level2 = MemeErrorNoticeView.Level.Error;
                        level4 = level2;
                        z2 = false;
                        charSequence3 = "";
                        charSequenceKWHzl = charSequenceAYXKKw;
                        function02 = function03;
                        level = level4;
                        z = true;
                        zEZpvd = false;
                        charSequence2 = charSequence3;
                        charSequence = charSequence2;
                        string = charSequence2;
                    }
                    charSequenceKWHzl = "";
                    charSequence3 = charSequenceKWHzl;
                    function02 = function03;
                    level = level4;
                    z = false;
                    z2 = false;
                    zEZpvd = false;
                    charSequence2 = charSequence3;
                    charSequence = charSequence2;
                    string = charSequence2;
                    break;
            }
            if (!zEZpvd) {
                OLrzqt(memeErrorNoticeView, z, charSequence, charSequenceKWHzl, level, string, function02);
            }
            if (function2 == null) {
                function2.invoke(java.lang.Boolean.valueOf(z2), swapState);
                return;
            }
            return;
        }
        charSequence3 = "";
        charSequenceKWHzl = charSequenceAYXKKw;
        function02 = function03;
        level = level4;
        z = true;
        zEZpvd = false;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        string = charSequence2;
        if (!zEZpvd) {
        }
        if (function2 == null) {
        }
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return !interfaceC9738bbJ.gHZMYf();
    }

    public static final boolean AhwBna(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return !interfaceC9738bbJ.ORxRYg();
    }

    public final boolean EZpvd(final MemeErrorNoticeView memeErrorNoticeView, InterfaceC9738bbJ interfaceC9738bbJ, final MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strKWHzl;
        java.lang.String str3;
        java.lang.String strKWHzl2;
        java.lang.String str4;
        java.lang.String strAkhnZx;
        java.lang.String strAYXKKw;
        boolean z = false;
        java.lang.String str5 = "";
        switch (mpcWalletAbleStatus == null ? -1 : TaskDescription.copydefault[mpcWalletAbleStatus.ordinal()]) {
            case 1:
            case 2:
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserServiceCallbackImpl);
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.RZOtbZ);
                str = strAYXKKw2;
                str2 = strAYXKKw3;
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.SqfPTR, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("verify", strAYXKKw3)));
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            case 3:
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItem);
                java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C23274hvD.Fragment.SdSTJp);
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                if (interfaceC9738bbJ != null && (strAkhnZx = interfaceC9738bbJ.AkhnZx()) != null) {
                    str5 = strAkhnZx;
                }
                pairArr[0] = C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str5);
                pairArr[1] = C56390yDp.OLrzqt(RequestParameters.X_OSS_RESTORE, strAYXKKw5);
                str3 = strAYXKKw4;
                z = true;
                strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.zMXLsR, ArrayMapKt.arrayMapOf(pairArr));
                str4 = strAYXKKw5;
                break;
            case 4:
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable);
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection);
                str = strAYXKKw;
                str2 = "";
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            case 5:
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable);
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase4);
                str = strAYXKKw;
                str2 = "";
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            case 6:
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable);
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase2);
                str = strAYXKKw;
                str2 = "";
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            default:
                str3 = "";
                strKWHzl2 = str3;
                str4 = strKWHzl2;
                break;
        }
        OLrzqt(memeErrorNoticeView, z, str3, strKWHzl2, MemeErrorNoticeView.Level.Warning, str4, new Function0() { // from class: o.ibH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24339ibv.KWHzl(mpcWalletAbleStatus, this, memeErrorNoticeView);
            }
        });
        return z;
    }

    public static final Unit KWHzl(MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, C24339ibv c24339ibv, MemeErrorNoticeView memeErrorNoticeView) {
        if (mpcWalletAbleStatus != null) {
            android.content.Context context = memeErrorNoticeView != null ? memeErrorNoticeView.getContext() : null;
            Intrinsics.copydefault(context, "");
            c24339ibv.EZpvd(mpcWalletAbleStatus, (FragmentActivity) context);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, final FragmentActivity fragmentActivity) {
        int i = TaskDescription.copydefault[mpcWalletAbleStatus.ordinal()];
        if (i == 1 || i == 2) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(this.gEmmrt).fARcdN().OLrzqt();
            final Function1 function1 = new Function1() { // from class: o.ibO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24339ibv.AEQbTJ(fragmentActivity, this, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ibK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24339ibv.AhwBna(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.ibS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24339ibv.EZpvd((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ibw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24339ibv.gEmmrt(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.AEQbTJ);
            return;
        }
        if (i != 3) {
            return;
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt2 = C22380heK.OLrzqt.copydefault(this.gEmmrt).fARcdN().OLrzqt();
        final Function1 function13 = new Function1() { // from class: o.ibG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24339ibv.KWHzl(fragmentActivity, this, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ibL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24339ibv.AYXKKw(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.ibM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24339ibv.OLrzqt((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ibN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24339ibv.KWHzl(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ2, this.AEQbTJ);
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, final C24339ibv c24339ibv, InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
        Intrinsics.copydefault(interfaceC9738bbJ);
        mpcWalletService.EZpvd(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.ibI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24339ibv.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24339ibv c24339ibv, boolean z) {
        if (z) {
            c24339ibv.valueOf.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, final C24339ibv c24339ibv, InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
        Intrinsics.copydefault(interfaceC9738bbJ);
        mpcWalletService.AEQbTJ(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.iby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24339ibv.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24339ibv c24339ibv, boolean z) {
        if (z) {
            c24339ibv.valueOf.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ibv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Function0 buildCallback$default(C24339ibv c24339ibv, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, long j, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function12 = new Function1() { // from class: o.ibF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C24339ibv.AEQbTJ((InterfaceC9738bbJ) obj2));
                }
            };
        }
        return c24339ibv.KWHzl(fragmentManager, function1, j, function12);
    }

    public final Function0<Unit> KWHzl(final androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super java.lang.Boolean, Unit> function1, final long j, final Function1<? super InterfaceC9738bbJ, java.lang.Boolean> function12) {
        return new Function0() { // from class: o.ibJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24339ibv.AEQbTJ(fragmentManager, j, function12, function1, this);
            }
        };
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, long j, final Function1 function1, Function1 function12, C24339ibv c24339ibv) {
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default((xWX) C43251rlk.copydefault(xWX.class), fragmentManager, new CurrentWalletSwitchConfig(null, new CurrentWalletSwitchNetworkMode.SingleNetwork(j), C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s), null, null, 0, null, null, 249, null), new Function2() { // from class: o.ibA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C24339ibv.AEQbTJ(function1, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new Application(function12, c24339ibv), 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ibv$Application */
    public static final class Application implements InterfaceC54855xXv {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;
        public final /* synthetic */ C24339ibv copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.Boolean, Unit> function1, C24339ibv c24339ibv) {
            this.KWHzl = function1;
            this.copydefault = c24339ibv;
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.copydefault(this, interfaceC9738bbJ);
            Function1<java.lang.Boolean, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C22372heC.AEQbTJ(this.copydefault.gEmmrt)));
            }
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
            Function1<java.lang.Boolean, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C22372heC.AEQbTJ(this.copydefault.gEmmrt)));
            }
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
            Function1<java.lang.Boolean, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C22372heC.AEQbTJ(this.copydefault.gEmmrt)));
            }
        }
    }

    public static final boolean AEQbTJ(Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((java.lang.Boolean) function1.invoke(interfaceC9738bbJ)).booleanValue();
    }

    public final boolean djBIcL() {
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends SwapState>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt(SwapState.SWITCH_WALLET, SwapState.NO_WALLET, SwapState.MPC_WALLET_LEGAL)), this.EZpvd);
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, MemeErrorNoticeView memeErrorNoticeView, @NotNull java.lang.String str, boolean z, boolean z2, boolean z3, @NotNull java.lang.String str2, @NotNull Function2<? super java.lang.Boolean, ? super SwapState, Unit> function2, Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.KWHzl) {
            SwapState swapState = SwapState.LIMIT_REGION;
            updateErrorState$default(this, swapState, fragmentManager, memeErrorNoticeView, null, function1, null, null, 96, null);
            function2.invoke(java.lang.Boolean.TRUE, swapState);
            return;
        }
        if (djBIcL()) {
            SwapState swapState2 = this.EZpvd;
            if (swapState2 != null) {
                updateErrorState$default(this, swapState2, fragmentManager, memeErrorNoticeView, null, function1, null, null, 96, null);
                function2.invoke(java.lang.Boolean.FALSE, SwapState.SWITCH_WALLET);
                return;
            }
            return;
        }
        if (z) {
            SwapState swapState3 = SwapState.NO_LIQUIDITY_AT_THE_MOMENT;
            updateErrorState$default(this, swapState3, fragmentManager, memeErrorNoticeView, function2, function1, null, function0, 32, null);
            function2.invoke(java.lang.Boolean.TRUE, swapState3);
            return;
        }
        if (z2) {
            SwapState swapState4 = SwapState.LOW_FROM_AMOUNT_FOR_LIMIT;
            updateErrorState$default(this, swapState4, fragmentManager, memeErrorNoticeView, null, function1, null, null, 96, null);
            function2.invoke(java.lang.Boolean.FALSE, swapState4);
            return;
        }
        if (this.copydefault.isLeverage()) {
            SwapState swapState5 = SwapState.STAND_BY_LEVERAGE;
            updateErrorState$default(this, swapState5, fragmentManager, memeErrorNoticeView, null, function1, null, null, 96, null);
            function2.invoke(java.lang.Boolean.TRUE, swapState5);
        } else if (C31212lpk.copydefault.OLrzqt(C33129mqd.AhwBna(str2))) {
            SwapState swapState6 = SwapState.STAND_BY_DISH_WARNING;
            updateErrorState$default(this, swapState6, fragmentManager, memeErrorNoticeView, null, function1, null, null, 96, null);
            function2.invoke(java.lang.Boolean.FALSE, swapState6);
        } else if (z3) {
            SwapState swapState7 = SwapState.SWAP_UNSUPPORTED_FOR_DAPP;
            updateErrorState$default(this, swapState7, fragmentManager, memeErrorNoticeView, null, function1, null, null, 96, null);
            function2.invoke(java.lang.Boolean.TRUE, swapState7);
        } else {
            if (memeErrorNoticeView != null) {
                memeErrorNoticeView.setVisibility(8);
            }
            function2.invoke(java.lang.Boolean.FALSE, SwapState.SWAP);
        }
    }

    public final void OLrzqt(MemeErrorNoticeView memeErrorNoticeView, boolean z, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, MemeErrorNoticeView.Level level, java.lang.String str, Function0<Unit> function0) {
        if (memeErrorNoticeView != null) {
            memeErrorNoticeView.setVisibility(z ? 0 : 8);
            if (z) {
                memeErrorNoticeView.setText(charSequence, charSequence2, level, str, function0);
            }
        }
    }
}
