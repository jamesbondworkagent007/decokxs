package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ButtonAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonAction[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName(EopTrackEvent.CLOSE)
    public static final ButtonAction Close = new ButtonAction("Close", 0);

    @SerialName("submit")
    public static final ButtonAction Submit = new ButtonAction("Submit", 1);

    @SerialName(EopTrackEvent.EXIT)
    public static final ButtonAction Exit = new ButtonAction("Exit", 2);

    @SerialName("onboarding")
    public static final ButtonAction Onboarding = new ButtonAction("Onboarding", 3);

    @SerialName("skip")
    public static final ButtonAction Skip = new ButtonAction("Skip", 4);

    @SerialName("aliface")
    public static final ButtonAction AliFace = new ButtonAction("AliFace", 5);

    @SerialName("accountMergeRetry")
    public static final ButtonAction AlifaceMergeAccount = new ButtonAction("AlifaceMergeAccount", 6);

    @SerialName("contact")
    public static final ButtonAction OnlineSupport = new ButtonAction("OnlineSupport", 7);

    @SerialName("contactSupport")
    public static final ButtonAction ContactSupport = new ButtonAction("ContactSupport", 8);

    @SerialName("multiVendor")
    public static final ButtonAction MultiVendor = new ButtonAction("MultiVendor", 9);

    @SerialName("generalVendor")
    public static final ButtonAction GeneralVendor = new ButtonAction("GeneralVendor", 10);

    @SerialName("dialog")
    public static final ButtonAction Dialog = new ButtonAction("Dialog", 11);

    @SerialName("deeplink")
    public static final ButtonAction Deeplink = new ButtonAction("Deeplink", 12);

    @SerialName("hyperlink")
    public static final ButtonAction Hyperlink = new ButtonAction("Hyperlink", 13);

    @SerialName(OtpEventTracker.OTP_EVENT_VALUE_CANCEL)
    public static final ButtonAction Cancel = new ButtonAction("Cancel", 14);

    @SerialName("quit")
    public static final ButtonAction Quit = new ButtonAction(OKGroupNotificationMessage.GROUP_OPERATION_QUIT, 15);

    @SerialName("riskWarning")
    public static final ButtonAction RiskWarning = new ButtonAction("RiskWarning", 16);

    @SerialName("withdrawal")
    public static final ButtonAction Withdrawal = new ButtonAction("Withdrawal", 17);

    @SerialName("homePage")
    public static final ButtonAction HomePage = new ButtonAction("HomePage", 18);

    @SerialName("initWallet")
    public static final ButtonAction InitWallet = new ButtonAction("InitWallet", 19);

    @SerialName("goBack")
    public static final ButtonAction GoBack = new ButtonAction("GoBack", 20);

    @SerialName("checkWallet")
    public static final ButtonAction CheckWallet = new ButtonAction("CheckWallet", 21);

    @SerialName("backUpWallet")
    public static final ButtonAction BackUpWallet = new ButtonAction("BackUpWallet", 22);

    @SerialName("importWallet")
    public static final ButtonAction ImportWallet = new ButtonAction("ImportWallet", 23);

    @SerialName("satoshiTest")
    public static final ButtonAction SatoshiTest = new ButtonAction("SatoshiTest", 24);

    @SerialName("callApi")
    public static final ButtonAction CallApi = new ButtonAction("CallApi", 25);

    @SerialName("goVerifyCenter")
    public static final ButtonAction GoVerifyCenter = new ButtonAction("GoVerifyCenter", 26);

    @SerialName("leanTech")
    public static final ButtonAction LeanTech = new ButtonAction("LeanTech", 27);

    @SerialName("amaniVideoCall")
    public static final ButtonAction AmaniVideoCall = new ButtonAction("AmaniVideoCall", 28);

    @SerialName("startImageUploadFlow")
    public static final ButtonAction StartImageUploadFlow = new ButtonAction("StartImageUploadFlow", 29);

    @SerialName("submitGps")
    public static final ButtonAction SubmitGps = new ButtonAction("SubmitGps", 30);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonAction[] $values() {
        return new ButtonAction[]{Close, Submit, Exit, Onboarding, Skip, AliFace, AlifaceMergeAccount, OnlineSupport, ContactSupport, MultiVendor, GeneralVendor, Dialog, Deeplink, Hyperlink, Cancel, Quit, RiskWarning, Withdrawal, HomePage, InitWallet, GoBack, CheckWallet, BackUpWallet, ImportWallet, SatoshiTest, CallApi, GoVerifyCenter, LeanTech, AmaniVideoCall, StartImageUploadFlow, SubmitGps};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonAction> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) ButtonAction.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ButtonAction> serializer() {
            return KWHzl();
        }
    }

    private ButtonAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction", values(), new String[]{EopTrackEvent.CLOSE, "submit", EopTrackEvent.EXIT, "onboarding", "skip", "aliface", "accountMergeRetry", "contact", "contactSupport", "multiVendor", "generalVendor", "dialog", "deeplink", "hyperlink", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "quit", "riskWarning", "withdrawal", "homePage", "initWallet", "goBack", "checkWallet", "backUpWallet", "importWallet", "satoshiTest", "callApi", "goVerifyCenter", "leanTech", "amaniVideoCall", "startImageUploadFlow", "submitGps"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    static {
        ButtonAction[] buttonActionArr$values = $values();
        $VALUES = buttonActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ruX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ButtonAction._init_$_anonymous_();
            }
        });
    }

    public static ButtonAction valueOf(String str) {
        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
    }

    public static ButtonAction[] values() {
        return (ButtonAction[]) $VALUES.clone();
    }
}
