package o;

import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.im.call.model.CallType;
import com.okinc.im.call.model.DisconnectReason;
import com.okinc.okimcore.model.im.AudioCallStatus;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC35221nrI;
import o.InterfaceC35336ntR;

/* JADX INFO: renamed from: o.nrt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35258nrt {

    /* JADX INFO: renamed from: o.nrt$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CallType.values().length];
            try {
                iArr[CallType.QUEUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CallType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DisconnectReason.values().length];
            try {
                iArr2[DisconnectReason.LOCAL_HANGUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[DisconnectReason.REMOTE_HANGUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[DisconnectReason.LOCAL_REJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[DisconnectReason.REMOTE_REJECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[DisconnectReason.LOCAL_CANCEL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[DisconnectReason.REMOTE_CANCEL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[DisconnectReason.NO_ANSWER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[DisconnectReason.NETWORK_ERROR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[DisconnectReason.AGORA_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[DisconnectReason.PERMISSION_DENIED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[DisconnectReason.ACCEPTED_ON_OTHER_DEVICE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[DisconnectReason.BUSY.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[DisconnectReason.BLOCKED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[DisconnectReason.UNKNOWN.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final AudioCallStatus KWHzl(CallStateV2 callStateV2) {
        if (callStateV2 instanceof CallStateV2.Idle) {
            return AudioCallStatus.Idle;
        }
        if (callStateV2 instanceof CallStateV2.Ringing) {
            return ((CallStateV2.Ringing) callStateV2).valueOf() == CallDirection.OUTGOING ? AudioCallStatus.CallOutGoing : AudioCallStatus.CallInComing;
        }
        if (callStateV2 instanceof CallStateV2.Connecting) {
            return ((CallStateV2.Connecting) callStateV2).valueOf() == CallDirection.OUTGOING ? AudioCallStatus.CallOutGoing : AudioCallStatus.CallInComing;
        }
        if (callStateV2 instanceof CallStateV2.Connected) {
            return AudioCallStatus.OnCallIn;
        }
        if (callStateV2 instanceof CallStateV2.Disconnected) {
            return AudioCallStatus.Idle;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final C44455sQl EZpvd(CallStateV2 callStateV2) {
        OKCallSession oKCallSessionKWHzl;
        CallSessionV2 callSessionV2AEQbTJ = callStateV2.AEQbTJ();
        if (callSessionV2AEQbTJ == null || (oKCallSessionKWHzl = KWHzl(callSessionV2AEQbTJ)) == null) {
            return null;
        }
        return new C44455sQl(oKCallSessionKWHzl, callStateV2 instanceof CallStateV2.Disconnected ? KWHzl(((CallStateV2.Disconnected) callStateV2).valueOf()) : null);
    }

    public static final OKCallSession KWHzl(CallSessionV2 callSessionV2) {
        OKCallCommon.OKVoiceCallType oKVoiceCallType;
        java.lang.String strGEmmrt = callSessionV2.gEmmrt();
        java.lang.String strAYXKKw = callSessionV2.AYXKKw();
        java.lang.String strIsConnected = callSessionV2.isConnected();
        java.lang.String strAhwBna = callSessionV2.AhwBna();
        java.lang.String strValues = callSessionV2.values();
        java.lang.String strAhwBna2 = callSessionV2.AhwBna();
        OKCallCommon.OKCallMediaType oKCallMediaType = OKCallCommon.OKCallMediaType.AUDIO;
        int i = TaskDescription.AEQbTJ[callSessionV2.djBIcL().ordinal()];
        if (i == 1) {
            oKVoiceCallType = OKCallCommon.OKVoiceCallType.QUEUE;
        } else if (i == 2) {
            oKVoiceCallType = OKCallCommon.OKVoiceCallType.GROUP;
        } else {
            oKVoiceCallType = OKCallCommon.OKVoiceCallType.DEFAULT;
        }
        return new OKCallSession(strGEmmrt, (OKConversationType) null, strAYXKKw, strIsConnected, (java.lang.Long) null, oKCallMediaType, strAhwBna, strValues, (java.lang.Long) null, strAhwBna2, oKVoiceCallType, 274, (DefaultConstructorMarker) null);
    }

    public static final OKCallCommon.OKCallDisconnectedReason KWHzl(DisconnectReason disconnectReason) {
        switch (TaskDescription.OLrzqt[disconnectReason.ordinal()]) {
            case 1:
                return OKCallCommon.OKCallDisconnectedReason.HANGUP;
            case 2:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_HANGUP;
            case 3:
                return OKCallCommon.OKCallDisconnectedReason.REJECT;
            case 4:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_REJECT;
            case 5:
                return OKCallCommon.OKCallDisconnectedReason.CANCEL;
            case 6:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_CANCEL;
            case 7:
                return OKCallCommon.OKCallDisconnectedReason.NO_RESPONSE;
            case 8:
                return OKCallCommon.OKCallDisconnectedReason.NETWORK_ERROR;
            case 9:
                return OKCallCommon.OKCallDisconnectedReason.ENGINE_UNSUPPORTED;
            case 10:
                return OKCallCommon.OKCallDisconnectedReason.ENGINE_UNSUPPORTED;
            case 11:
                return OKCallCommon.OKCallDisconnectedReason.OTHER_DEVICE_HAD_ACCEPTED;
            case 12:
                return OKCallCommon.OKCallDisconnectedReason.BUSY_LINE;
            case 13:
                return OKCallCommon.OKCallDisconnectedReason.REJECTED_BY_BLACKLIST;
            case 14:
                return OKCallCommon.OKCallDisconnectedReason.HANGUP;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final InterfaceC35336ntR EZpvd(AbstractC35221nrI abstractC35221nrI) {
        InterfaceC35336ntR.TaskStackBuilder taskStackBuilder;
        if (abstractC35221nrI instanceof AbstractC35221nrI.Fragment) {
            return InterfaceC35336ntR.PendingIntent.copydefault;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.TaskDescription) {
            return InterfaceC35336ntR.Application.OLrzqt;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.SharedElementCallback) {
            return InterfaceC35336ntR.LoaderManager.OLrzqt;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.ActionBar) {
            return InterfaceC35336ntR.Dialog.KWHzl;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.TaskStackBuilder) {
            return InterfaceC35336ntR.FragmentManager.OLrzqt;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.Activity) {
            return InterfaceC35336ntR.Activity.OLrzqt;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.Application) {
            return InterfaceC35336ntR.TaskDescription.AEQbTJ;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.StateListAnimator) {
            return InterfaceC35336ntR.ActionBar.copydefault;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.FragmentManager) {
            return InterfaceC35336ntR.FragmentManager.OLrzqt;
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.Dialog) {
            return new InterfaceC35336ntR.TaskStackBuilder(new java.lang.Exception("Microphone in use"));
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.LoaderManager) {
            return new InterfaceC35336ntR.TaskStackBuilder(new java.lang.Exception("Cannot call self"));
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.ComponentCallbacks) {
            return new InterfaceC35336ntR.TaskStackBuilder(new java.lang.Exception("User blocked: " + ((AbstractC35221nrI.ComponentCallbacks) abstractC35221nrI).KWHzl()));
        }
        if (abstractC35221nrI instanceof AbstractC35221nrI.AssistContent) {
            taskStackBuilder = new InterfaceC35336ntR.TaskStackBuilder(new java.lang.Exception(((AbstractC35221nrI.AssistContent) abstractC35221nrI).AEQbTJ()));
        } else if (abstractC35221nrI instanceof AbstractC35221nrI.PendingIntent) {
            taskStackBuilder = new InterfaceC35336ntR.TaskStackBuilder(new java.lang.Exception(((AbstractC35221nrI.PendingIntent) abstractC35221nrI).AEQbTJ()));
        } else {
            if (!(abstractC35221nrI instanceof AbstractC35221nrI.PictureInPictureParams)) {
                if (!(abstractC35221nrI instanceof AbstractC35221nrI.VoiceInteractor)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC35221nrI.VoiceInteractor voiceInteractor = (AbstractC35221nrI.VoiceInteractor) abstractC35221nrI;
                java.lang.Throwable thKWHzl = voiceInteractor.KWHzl();
                if (thKWHzl == null) {
                    thKWHzl = new java.lang.Exception(voiceInteractor.AEQbTJ());
                }
                return new InterfaceC35336ntR.TaskStackBuilder(thKWHzl);
            }
            taskStackBuilder = new InterfaceC35336ntR.TaskStackBuilder(new java.lang.Exception(abstractC35221nrI.AEQbTJ()));
        }
        return taskStackBuilder;
    }
}
