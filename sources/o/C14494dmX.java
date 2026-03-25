package o;

import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.common.track.EventTrackerUtils$getAlreadyHaveWallet$1;
import com.okinc.business.defi.common.track.EventTrackerUtils$getWalletType$1;
import com.okinc.business.defi.common.track.EventTrackerUtils$trackHomepageTopButtonClick$1;
import com.okinc.business.defi.common.track.EventTrackerUtils$trackImportWalletConfirmButtonClick$1;
import com.okinc.business.defi.common.track.EventTrackerUtils$trackIntroNoAssetsClick$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14494dmX {
    public static final C14494dmX KWHzl = new C14494dmX();

    private C14494dmX() {
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.dng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.KWHzl(str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackNewWalletMethodButtonClick$default(C14494dmX c14494dmX, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c14494dmX.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dTU.onWeb3Event$default(java.lang.String, com.okinc.components.track.TrackChannel[], kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        dTU.onWeb3Event$default("Web3Onboarding_NewWalletMethod_Button_Click", null, new Function1() { // from class: o.dna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        addIsExchangeUserParam$default(KWHzl, eventParamsList, false, 1, null);
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        if (str2 != null) {
            eventParamsList.add(new EventParam("new_wallet_method", str2, true));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        EventTrackerUtils$trackHomepageTopButtonClick$1 eventTrackerUtils$trackHomepageTopButtonClick$1;
        final boolean z3;
        final boolean z4;
        final java.lang.String str4;
        final java.lang.String str5;
        final java.lang.String str6;
        if (continuation instanceof EventTrackerUtils$trackHomepageTopButtonClick$1) {
            eventTrackerUtils$trackHomepageTopButtonClick$1 = (EventTrackerUtils$trackHomepageTopButtonClick$1) continuation;
            int i = eventTrackerUtils$trackHomepageTopButtonClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventTrackerUtils$trackHomepageTopButtonClick$1.label = i - Integer.MIN_VALUE;
            } else {
                eventTrackerUtils$trackHomepageTopButtonClick$1 = new EventTrackerUtils$trackHomepageTopButtonClick$1(this, continuation);
            }
        }
        java.lang.Object obj = eventTrackerUtils$trackHomepageTopButtonClick$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventTrackerUtils$trackHomepageTopButtonClick$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            eventTrackerUtils$trackHomepageTopButtonClick$1.L$0 = str;
            eventTrackerUtils$trackHomepageTopButtonClick$1.L$1 = str2;
            eventTrackerUtils$trackHomepageTopButtonClick$1.L$2 = str3;
            z3 = z;
            eventTrackerUtils$trackHomepageTopButtonClick$1.Z$0 = z3;
            z4 = z2;
            eventTrackerUtils$trackHomepageTopButtonClick$1.Z$1 = z4;
            eventTrackerUtils$trackHomepageTopButtonClick$1.label = 1;
            java.lang.Object objOLrzqt = OLrzqt(eventTrackerUtils$trackHomepageTopButtonClick$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str4 = str;
            obj = objOLrzqt;
            str5 = str2;
            str6 = str3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = eventTrackerUtils$trackHomepageTopButtonClick$1.Z$1;
            boolean z6 = eventTrackerUtils$trackHomepageTopButtonClick$1.Z$0;
            java.lang.String str7 = (java.lang.String) eventTrackerUtils$trackHomepageTopButtonClick$1.L$2;
            java.lang.String str8 = (java.lang.String) eventTrackerUtils$trackHomepageTopButtonClick$1.L$1;
            java.lang.String str9 = (java.lang.String) eventTrackerUtils$trackHomepageTopButtonClick$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str4 = str9;
            z4 = z5;
            str6 = str7;
            str5 = str8;
            z3 = z6;
        }
        final java.lang.String str10 = (java.lang.String) obj;
        C32866mlf.onEvent$default("Web3WalletHomepage_Top_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.dnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C14494dmX.OLrzqt(z3, z4, str4, str5, str6, str10, (EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (z) {
            eventParamsList.add(new EventParam("home_banner", "click", true));
        }
        if (z2) {
            eventParamsList.add(new EventParam("slide_up", "yes", true));
        }
        if (str != null) {
            eventParamsList.add(new EventParam("users_network", str, false));
        }
        if (str2 != null) {
            eventParamsList.add(new EventParam("users_token", str2, false));
        }
        if (str3 != null) {
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str3, true));
        }
        KWHzl.EZpvd(eventParamsList, str4);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Web3WalletCoin_Button_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.dnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object trackImportWalletConfirmButtonClick$default(C14494dmX c14494dmX, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c14494dmX.KWHzl(str, str2, str3, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        EventTrackerUtils$trackImportWalletConfirmButtonClick$1 eventTrackerUtils$trackImportWalletConfirmButtonClick$1;
        if (continuation instanceof EventTrackerUtils$trackImportWalletConfirmButtonClick$1) {
            eventTrackerUtils$trackImportWalletConfirmButtonClick$1 = (EventTrackerUtils$trackImportWalletConfirmButtonClick$1) continuation;
            int i = eventTrackerUtils$trackImportWalletConfirmButtonClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventTrackerUtils$trackImportWalletConfirmButtonClick$1.label = i - Integer.MIN_VALUE;
            } else {
                eventTrackerUtils$trackImportWalletConfirmButtonClick$1 = new EventTrackerUtils$trackImportWalletConfirmButtonClick$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = eventTrackerUtils$trackImportWalletConfirmButtonClick$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventTrackerUtils$trackImportWalletConfirmButtonClick$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            eventTrackerUtils$trackImportWalletConfirmButtonClick$1.L$0 = str;
            eventTrackerUtils$trackImportWalletConfirmButtonClick$1.L$1 = str2;
            eventTrackerUtils$trackImportWalletConfirmButtonClick$1.L$2 = str3;
            eventTrackerUtils$trackImportWalletConfirmButtonClick$1.label = 1;
            objEZpvd = EZpvd(eventTrackerUtils$trackImportWalletConfirmButtonClick$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) eventTrackerUtils$trackImportWalletConfirmButtonClick$1.L$2;
            str2 = (java.lang.String) eventTrackerUtils$trackImportWalletConfirmButtonClick$1.L$1;
            str = (java.lang.String) eventTrackerUtils$trackImportWalletConfirmButtonClick$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        final java.lang.String str4 = (java.lang.String) objEZpvd;
        C32866mlf.onEvent$default("Web3Onboarding_ImportWalletConfirm_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.dmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.KWHzl(str2, str, str4, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            eventParamsList.add(new EventParam("import_type", str, true));
        }
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str2, true));
        C14494dmX c14494dmX = KWHzl;
        addIsExchangeUserParam$default(c14494dmX, eventParamsList, false, 1, null);
        c14494dmX.OLrzqt(eventParamsList, str3);
        if (str4 != null) {
            eventParamsList.add(new EventParam("import_source", str4, true));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackHomePageIntroSlideUpClick$default(C14494dmX c14494dmX, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c14494dmX.KWHzl(str, str2, str3);
    }

    public final void KWHzl(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Web3HomePage_Intro_SlideUp_Click", (TrackChannel[]) null, new Function1() { // from class: o.dne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.KWHzl(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        if (str2 != null) {
            eventParamsList.add(new EventParam("users_network", str2, false));
        }
        if (str3 != null) {
            eventParamsList.add(new EventParam("users_token", str3, false));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        EventTrackerUtils$getAlreadyHaveWallet$1 eventTrackerUtils$getAlreadyHaveWallet$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof EventTrackerUtils$getAlreadyHaveWallet$1) {
            eventTrackerUtils$getAlreadyHaveWallet$1 = (EventTrackerUtils$getAlreadyHaveWallet$1) continuation;
            int i = eventTrackerUtils$getAlreadyHaveWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventTrackerUtils$getAlreadyHaveWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                eventTrackerUtils$getAlreadyHaveWallet$1 = new EventTrackerUtils$getAlreadyHaveWallet$1(this, continuation);
            }
        }
        java.lang.Object objAwait = eventTrackerUtils$getAlreadyHaveWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventTrackerUtils$getAlreadyHaveWallet$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(false);
                eventTrackerUtils$getAlreadyHaveWallet$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, eventTrackerUtils$getAlreadyHaveWallet$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.Boolean) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null) {
            return ((java.lang.Boolean) objM7377constructorimpl).booleanValue() ? "yes" : "no";
        }
        return null;
    }

    public final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Web3Onboarding_HomeBackedUp_Button", (TrackChannel[]) null, new Function1() { // from class: o.dnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.AhwBna(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("wallet_type", "seedphrase", true));
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull final java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        EventTrackerUtils$trackIntroNoAssetsClick$1 eventTrackerUtils$trackIntroNoAssetsClick$1;
        if (continuation instanceof EventTrackerUtils$trackIntroNoAssetsClick$1) {
            eventTrackerUtils$trackIntroNoAssetsClick$1 = (EventTrackerUtils$trackIntroNoAssetsClick$1) continuation;
            int i = eventTrackerUtils$trackIntroNoAssetsClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventTrackerUtils$trackIntroNoAssetsClick$1.label = i - Integer.MIN_VALUE;
            } else {
                eventTrackerUtils$trackIntroNoAssetsClick$1 = new EventTrackerUtils$trackIntroNoAssetsClick$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = eventTrackerUtils$trackIntroNoAssetsClick$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventTrackerUtils$trackIntroNoAssetsClick$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            eventTrackerUtils$trackIntroNoAssetsClick$1.L$0 = str;
            eventTrackerUtils$trackIntroNoAssetsClick$1.label = 1;
            objOLrzqt = OLrzqt(eventTrackerUtils$trackIntroNoAssetsClick$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) eventTrackerUtils$trackIntroNoAssetsClick$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        final java.lang.String str2 = (java.lang.String) objOLrzqt;
        C32866mlf.onEvent$default("Web3Onboarding_Intro_NoAssets_Click", (TrackChannel[]) null, new Function1() { // from class: o.dnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14494dmX.KWHzl(str2, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        KWHzl.EZpvd(eventParamsList, str);
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str2, true));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        EventTrackerUtils$getWalletType$1 eventTrackerUtils$getWalletType$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof EventTrackerUtils$getWalletType$1) {
            eventTrackerUtils$getWalletType$1 = (EventTrackerUtils$getWalletType$1) continuation;
            int i = eventTrackerUtils$getWalletType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventTrackerUtils$getWalletType$1.label = i - Integer.MIN_VALUE;
            } else {
                eventTrackerUtils$getWalletType$1 = new EventTrackerUtils$getWalletType$1(this, continuation);
            }
        }
        java.lang.Object objAwait = eventTrackerUtils$getWalletType$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventTrackerUtils$getWalletType$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl();
                eventTrackerUtils$getWalletType$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, eventTrackerUtils$getWalletType$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
        C14494dmX c14494dmX = KWHzl;
        Intrinsics.copydefault(interfaceC9738bbJ);
        return c14494dmX.EZpvd(interfaceC9738bbJ);
    }

    public final java.lang.String EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.AubY() ? Web3SecurityTrackEvent.VALUE_SEED_PHRASE : interfaceC9738bbJ.AwvSrB() ? "privatekey" : interfaceC9738bbJ.ORxRYg() ? "keyless" : interfaceC9738bbJ.gHZMYf() ? "hardware" : interfaceC9738bbJ.getFieldNames() ? "aa" : interfaceC9738bbJ.QfsBiF() ? "tracking" : interfaceC9738bbJ.zsXlph() ? "demo" : interfaceC9738bbJ.UeEOUB() ? "wc" : interfaceC9738bbJ.QVAiDq() ? "ton" : Constants.IPC_BUNDLE_KEY_SEND_ERROR;
    }

    public final java.lang.String KWHzl(long j) {
        if (j == Long.MIN_VALUE) {
            return "All";
        }
        if (j >= 0) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
            if (c10854bwMKWHzl != null) {
                return c10854bwMKWHzl.djBIcL();
            }
        } else {
            CustomChainMeta customChainMetaEZpvd = C10598brV.AEQbTJ.EZpvd(j);
            if (customChainMetaEZpvd != null) {
                return customChainMetaEZpvd.OLrzqt();
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ(@NotNull EventParamsList eventParamsList, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = "keyless";
        java.lang.String str3 = "create";
        switch (str.hashCode()) {
            case -1470420798:
                if (!str.equals("mnemonic")) {
                    return;
                } else {
                    str2 = "seedphrase";
                }
                break;
            case -1352294148:
                if (str.equals("create")) {
                    str2 = "seedphrase";
                    eventParamsList.add(new EventParam("wallet_scene", str3, true));
                    eventParamsList.add(new EventParam("wallet_type", str2, true));
                }
                return;
            case 330281455:
                if (!str.equals("restore_mpc")) {
                    return;
                }
                break;
            case 1369545053:
                if (!str.equals("create_mpc")) {
                    return;
                }
                eventParamsList.add(new EventParam("wallet_scene", str3, true));
                eventParamsList.add(new EventParam("wallet_type", str2, true));
            case 1971943843:
                if (!str.equals(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY)) {
                    return;
                } else {
                    str2 = "privatekey";
                }
                break;
            default:
                return;
        }
        str3 = Web3SecurityTrackEvent.VALUE_IMPORT;
        eventParamsList.add(new EventParam("wallet_scene", str3, true));
        eventParamsList.add(new EventParam("wallet_type", str2, true));
    }

    public static /* synthetic */ void addIsExchangeUserParam$default(C14494dmX c14494dmX, EventParamsList eventParamsList, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c14494dmX.AEQbTJ(eventParamsList, z);
    }

    public final void AEQbTJ(@NotNull EventParamsList eventParamsList, boolean z) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("is_exchange_user", dZP.OLrzqt.valueOf() ? "yes" : "no", z));
    }

    public final void OLrzqt(@NotNull EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            eventParamsList.add(new EventParam("already_have_wallet", str, true));
        }
    }

    public final void EZpvd(@NotNull EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            eventParamsList.add(new EventParam("wallet_type", str, true));
        }
    }
}
