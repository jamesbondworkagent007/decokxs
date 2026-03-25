package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sPQ {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMContentType.values().length];
            try {
                iArr[InHouseIMContentType.Text.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMContentType.Image.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InHouseIMContentType.Voice.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InHouseIMContentType.VoiceCall.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[InHouseIMContentType.Quote.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[InHouseIMContentType.Custom.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[InHouseIMContentType.Video.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[InHouseIMContentType.Media.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[InHouseIMContentType.GroupInvitation.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[InHouseIMContentType.STICKER.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[InHouseIMContentType.Unknown.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[InHouseIMContentType.ReadReceipt.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageBySender.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageByAdmin.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageBySenderServer.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageByAdminServer.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[InHouseIMContentType.Share.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[InHouseIMContentType.TypingIndicator.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[InHouseIMContentType.SystemMessage.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[InHouseIMContentType.StreamPlaceHolder.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[InHouseIMContentType.Stream.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            EZpvd = iArr;
        }
    }

    public static final boolean copydefault(InHouseIMContentType inHouseIMContentType) {
        switch (inHouseIMContentType == null ? -1 : StateListAnimator.EZpvd[inHouseIMContentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public static final boolean OLrzqt(@NotNull InHouseIMContentType inHouseIMContentType) {
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        switch (StateListAnimator.EZpvd[inHouseIMContentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 10:
                return true;
            case 4:
            case 5:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
