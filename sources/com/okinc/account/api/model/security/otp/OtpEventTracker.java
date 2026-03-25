package com.okinc.account.api.model.security.otp;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class OtpEventTracker {
    public static final int $stable = 0;
    private static final String ChangeMobile_Mid_Button_Click = "ChangeMobile_Mid_Button_Click";
    private static final String ChangeMobile_Mid_SmsCode_Click = "ChangeMobile_Mid_SmsCode_Click";
    private static final String ChangeMobile_Sheet_Button_Click = "ChangeMobile_Sheet_Button_Click";
    private static final String ChangeMobile_Sheet_OtherMethod_Click = "ChangeMobile_Sheet_OtherMethod_Click";
    private static final String ChangePwd_Mid_Button_Click = "ChangePwd_Mid_Button_Click";
    private static final String ChangePwd_Mid_SmsCode_Click = "ChangePwd_Mid_SmsCode_Click";
    private static final String ChangePwd_Sheet_Button_Click = "ChangePwd_Sheet_Button_Click";
    private static final String ChangePwd_Sheet_OtherMethod_Click = "ChangePwd_Sheet_OtherMethod_Click";
    public static final OtpEventTracker INSTANCE = new OtpEventTracker();
    private static final String LinkMobile_Mid_Button_Click = "LinkMobile_Mid_Button_Click";
    private static final String LinkMobile_Mid_SmsCode_Click = "LinkMobile_Mid_SmsCode_Click";
    private static final String LinkMobile_Sheet_Button_Click = "LinkMobile_Sheet_Button_Click";
    private static final String LinkMobile_Sheet_OtherMethod_Click = "LinkMobile_Sheet_OtherMethod_Click";
    private static final String NewDevice_Mid_Button_Click = "NewDevice_Mid_Button_Click";
    private static final String NewDevice_Mid_SmsCode_Click = "NewDevice_Mid_SmsCode_Click";
    private static final String NewDevice_Sheet_Button_Click = "NewDevice_Sheet_Button_Click";
    private static final String NewDevice_Sheet_OtherMethod_Click = "NewDevice_Sheet_OtherMethod_Click";
    private static final String OTP_EVENT_PROP_BUTTON_NAME = "button_name";
    private static final String OTP_EVENT_PROP_ORIGINAL_METHOD = "original_method";
    private static final String OTP_EVENT_PROP_PHONE = "phone";
    public static final String OTP_EVENT_VALUE_CANCEL = "cancel";
    public static final String OTP_EVENT_VALUE_NEW = "new";
    public static final String OTP_EVENT_VALUE_OLD = "old";
    public static final String OTP_EVENT_VALUE_OTHER_METHOD = "other_method";
    public static final String OTP_EVENT_VALUE_RESEND = "resend";
    public static final String OTP_EVENT_VALUE_SMS = "sms";
    public static final String OTP_EVENT_VALUE_VOICE_CALL = "voicecall";
    private static final String ResetPwd_Mid_Button_Click = "ResetPwd_Mid_Button_Click";
    private static final String ResetPwd_Mid_SmsCode_Click = "ResetPwd_Mid_SmsCode_Click";
    private static final String ResetPwd_Sheet_Button_Click = "ResetPwd_Sheet_Button_Click";
    private static final String ResetPwd_Sheet_OtherMethod_Click = "ResetPwd_Sheet_OtherMethod_Click";

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OtpEventType.values().length];
            try {
                iArr[OtpEventType.LINK_MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtpEventType.CHANGE_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtpEventType.RESET_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtpEventType.CHANGE_MOBILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OtpEventType.NEW_DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OtpEventType.GENERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OtpEventTracker() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OtpEventType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OtpEventType[] $VALUES;
        public static final OtpEventType LINK_MOBILE = new OtpEventType("LINK_MOBILE", 0);
        public static final OtpEventType CHANGE_MOBILE = new OtpEventType("CHANGE_MOBILE", 1);
        public static final OtpEventType CHANGE_PASSWORD = new OtpEventType("CHANGE_PASSWORD", 2);
        public static final OtpEventType RESET_PASSWORD = new OtpEventType("RESET_PASSWORD", 3);
        public static final OtpEventType NEW_DEVICE = new OtpEventType("NEW_DEVICE", 4);
        public static final OtpEventType GENERAL = new OtpEventType("GENERAL", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OtpEventType[] $values() {
            return new OtpEventType[]{LINK_MOBILE, CHANGE_MOBILE, CHANGE_PASSWORD, RESET_PASSWORD, NEW_DEVICE, GENERAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OtpEventType> getEntries() {
            return $ENTRIES;
        }

        private OtpEventType(String str, int i) {
        }

        static {
            OtpEventType[] otpEventTypeArr$values = $values();
            $VALUES = otpEventTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(otpEventTypeArr$values);
        }

        public static OtpEventType valueOf(String str) {
            return (OtpEventType) Enum.valueOf(OtpEventType.class, str);
        }

        public static OtpEventType[] values() {
            return (OtpEventType[]) $VALUES.clone();
        }
    }

    public final void trackSendCodeClickEvent(@NotNull final OtpEventType otpEventType, @NotNull final String str) {
        String str2;
        Intrinsics.checkNotNullParameter(otpEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        switch (WhenMappings.$EnumSwitchMapping$0[otpEventType.ordinal()]) {
            case 1:
                str2 = LinkMobile_Mid_SmsCode_Click;
                break;
            case 2:
                str2 = ChangePwd_Mid_SmsCode_Click;
                break;
            case 3:
                str2 = ResetPwd_Mid_SmsCode_Click;
                break;
            case 4:
                str2 = ChangeMobile_Mid_SmsCode_Click;
                break;
            case 5:
                str2 = NewDevice_Mid_SmsCode_Click;
                break;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str2, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.account.api.model.security.otp.OtpEventTracker$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpEventTracker.trackSendCodeClickEvent$lambda$0(otpEventType, str, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackSendCodeClickEvent$lambda$0(OtpEventType otpEventType, String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (otpEventType == OtpEventType.CHANGE_MOBILE) {
            EventParamsList.put$default(eventParamsList, "phone", str, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void trackResendOrTryOtherMethodClickEvent(@NotNull final OtpEventType otpEventType, final int i, @NotNull final String str, @NotNull final String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(otpEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (WhenMappings.$EnumSwitchMapping$0[otpEventType.ordinal()]) {
            case 1:
                str3 = LinkMobile_Mid_Button_Click;
                break;
            case 2:
                str3 = ChangePwd_Mid_Button_Click;
                break;
            case 3:
                str3 = ResetPwd_Mid_Button_Click;
                break;
            case 4:
                str3 = ChangeMobile_Mid_Button_Click;
                break;
            case 5:
                str3 = NewDevice_Mid_Button_Click;
                break;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str3, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.account.api.model.security.otp.OtpEventTracker$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpEventTracker.trackResendOrTryOtherMethodClickEvent$lambda$1(i, str, otpEventType, str2, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackResendOrTryOtherMethodClickEvent$lambda$1(int i, String str, OtpEventType otpEventType, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OTP_EVENT_PROP_ORIGINAL_METHOD, i == 1 ? OTP_EVENT_VALUE_VOICE_CALL : OTP_EVENT_VALUE_SMS, false, 4, null);
        EventParamsList.put$default(eventParamsList, "button_name", str, false, 4, null);
        if (otpEventType == OtpEventType.CHANGE_MOBILE) {
            EventParamsList.put$default(eventParamsList, "phone", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void trackChooseVerificationMethodClickEvent(@NotNull final OtpEventType otpEventType, @NotNull final String str, @NotNull final String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(otpEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (WhenMappings.$EnumSwitchMapping$0[otpEventType.ordinal()]) {
            case 1:
                str3 = LinkMobile_Sheet_Button_Click;
                break;
            case 2:
                str3 = ChangePwd_Sheet_Button_Click;
                break;
            case 3:
                str3 = ResetPwd_Sheet_Button_Click;
                break;
            case 4:
                str3 = ChangeMobile_Sheet_Button_Click;
                break;
            case 5:
                str3 = NewDevice_Sheet_Button_Click;
                break;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str3, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.account.api.model.security.otp.OtpEventTracker$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpEventTracker.trackChooseVerificationMethodClickEvent$lambda$2(str, otpEventType, str2, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackChooseVerificationMethodClickEvent$lambda$2(String str, OtpEventType otpEventType, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_name", str, false, 4, null);
        if (otpEventType == OtpEventType.CHANGE_MOBILE) {
            EventParamsList.put$default(eventParamsList, "phone", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void trackChangeVerificationMethodClickEvent(@NotNull final OtpEventType otpEventType, @NotNull final String str, final int i, @NotNull final String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(otpEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (WhenMappings.$EnumSwitchMapping$0[otpEventType.ordinal()]) {
            case 1:
                str3 = LinkMobile_Sheet_OtherMethod_Click;
                break;
            case 2:
                str3 = ChangePwd_Sheet_OtherMethod_Click;
                break;
            case 3:
                str3 = ResetPwd_Sheet_OtherMethod_Click;
                break;
            case 4:
                str3 = ChangeMobile_Sheet_OtherMethod_Click;
                break;
            case 5:
                str3 = NewDevice_Sheet_OtherMethod_Click;
                break;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str3, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.account.api.model.security.otp.OtpEventTracker$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpEventTracker.trackChangeVerificationMethodClickEvent$lambda$3(str, i, otpEventType, str2, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackChangeVerificationMethodClickEvent$lambda$3(String str, int i, OtpEventType otpEventType, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OTP_EVENT_PROP_ORIGINAL_METHOD, i == 1 ? OTP_EVENT_VALUE_VOICE_CALL : OTP_EVENT_VALUE_SMS, false, 4, null);
        if (otpEventType == OtpEventType.CHANGE_MOBILE) {
            EventParamsList.put$default(eventParamsList, "phone", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
