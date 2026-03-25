package o;

import com.okinc.okimcore.model.im.AudioCallStatus;
import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC35259nru;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35259nru {
    OKCallCommon.OKCallDisconnectedReason AEQbTJ(@NotNull OKAudioCallRecordMessage oKAudioCallRecordMessage);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super sNK> continuation);

    void AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, Function1<? super InterfaceC35336ntR, Unit> function1, @NotNull Function0<Unit> function0);

    void AEQbTJ(@NotNull java.lang.String str, Function1<? super InterfaceC35336ntR, Unit> function1, @NotNull Function0<Unit> function0);

    void AEQbTJ(@NotNull InterfaceC35215nrC interfaceC35215nrC);

    boolean AEQbTJ();

    boolean AEQbTJ(boolean z);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation);

    StateFlow<C35233nrU> EZpvd();

    void EZpvd(@NotNull InterfaceC35215nrC interfaceC35215nrC);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super InterfaceC35336ntR, Unit> function1);

    boolean KWHzl();

    boolean KWHzl(boolean z);

    kotlin.Pair<AudioCallStatus, OKCallSession> OLrzqt();

    void OLrzqt(@NotNull java.util.List<java.lang.String> list, Function1<? super InterfaceC35336ntR, Unit> function1, @NotNull Function0<Unit> function0);

    void OLrzqt(boolean z);

    void copydefault(@NotNull java.lang.String str, java.lang.Long l, boolean z);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull OKCallCommon.OKVoiceCallType oKVoiceCallType);

    void copydefault(boolean z);

    boolean copydefault();

    /* JADX INFO: renamed from: o.nru$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nru */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startAudioCall$default(InterfaceC35259nru interfaceC35259nru, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAudioCall");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC35259nru.KWHzl(str, str2, function1);
        }

        public static /* synthetic */ void initFromPushNotification$default(InterfaceC35259nru interfaceC35259nru, java.lang.String str, java.lang.String str2, java.lang.String str3, OKCallCommon.OKVoiceCallType oKVoiceCallType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initFromPushNotification");
            }
            if ((i & 8) != 0) {
                oKVoiceCallType = OKCallCommon.OKVoiceCallType.DEFAULT;
            }
            interfaceC35259nru.copydefault(str, str2, str3, oKVoiceCallType);
        }

        public static /* synthetic */ void acceptCallByToken$default(InterfaceC35259nru interfaceC35259nru, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptCallByToken");
            }
            interfaceC35259nru.AEQbTJ(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
        }

        public static /* synthetic */ void hangUpCall$default(InterfaceC35259nru interfaceC35259nru, java.lang.String str, java.lang.Long l, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hangUpCall");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            interfaceC35259nru.copydefault(str, l, z);
        }

        public static Unit AhwBna() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nru */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startGroupCall$default(InterfaceC35259nru interfaceC35259nru, java.lang.String str, java.util.List list, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startGroupCall");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function0 = new Function0() { // from class: o.nry
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InterfaceC35259nru.TaskDescription.AhwBna();
                    }
                };
            }
            interfaceC35259nru.AEQbTJ(str, list, function1, function0);
        }

        public static Unit copydefault() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nru */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void joinGroupCall$default(InterfaceC35259nru interfaceC35259nru, java.lang.String str, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinGroupCall");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                function0 = new Function0() { // from class: o.nrB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InterfaceC35259nru.TaskDescription.copydefault();
                    }
                };
            }
            interfaceC35259nru.AEQbTJ(str, function1, function0);
        }

        public static Unit AEQbTJ() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nru */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void ringGroupCallUsers$default(InterfaceC35259nru interfaceC35259nru, java.util.List list, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ringGroupCallUsers");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                function0 = new Function0() { // from class: o.nrA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InterfaceC35259nru.TaskDescription.AEQbTJ();
                    }
                };
            }
            interfaceC35259nru.OLrzqt(list, function1, function0);
        }
    }
}
