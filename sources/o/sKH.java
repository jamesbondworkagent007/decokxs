package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.sKH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sKH {
    java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super StateListAnimator> continuation);

    java.lang.Object AEQbTJ(@NotNull CreateBroadcastChannelRequest createBroadcastChannelRequest, @NotNull Continuation<? super ResponseData<CreateBroadcastChannelResponse>> continuation);

    void AEQbTJ();

    void AEQbTJ(@NotNull OKMessage oKMessage);

    void AEQbTJ(@NotNull OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi);

    void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1);

    void AEQbTJ(@NotNull InterfaceC44294sKm interfaceC44294sKm);

    MessengerConnectionStatus AYXKKw();

    Flow<java.lang.Integer> AhwBna();

    sHZ AuCTel();

    void DbNXlk();

    java.lang.Object EZpvd(long j, @NotNull OKMessageContent oKMessageContent, @NotNull Continuation<? super WSSendMessageDetailData> continuation);

    java.lang.Object EZpvd(long j, @NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    java.lang.Object EZpvd(@NotNull OKConversation oKConversation, @NotNull OKMessage[] oKMessageArr, @NotNull Continuation<? super TaskDescription> continuation);

    java.lang.Object EZpvd(@NotNull OKMessage oKMessage, @NotNull Continuation<? super Unit> continuation);

    StateFlow<sNJ> EZpvd();

    void EZpvd(@NotNull InterfaceC44294sKm interfaceC44294sKm);

    LiveData<MessengerConnectionStatus> KWHzl();

    java.lang.Object KWHzl(@NotNull sNH snh, @NotNull Continuation<? super sNM> continuation);

    java.lang.Object KWHzl(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<OKMessage>> continuation);

    void KWHzl(@NotNull OKMessage oKMessage, @NotNull java.lang.String str, @NotNull java.lang.String str2, InterfaceC44289sKh interfaceC44289sKh);

    void KWHzl(@NotNull OKMessage oKMessage, InterfaceC44289sKh interfaceC44289sKh);

    void KWHzl(@NotNull java.lang.String str, long j);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Class<? extends sJU<?>> cls);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.Class<? extends sJU<?>> cls);

    void KWHzl(@NotNull java.util.List<OKMessage> list);

    java.lang.Object OLrzqt(long j, @NotNull OKMessageContent oKMessageContent, @NotNull Continuation<? super WSSendMessageDetailData> continuation);

    java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super C44461sQr> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, boolean z, @NotNull Continuation<? super java.util.List<ReactionDetail>> continuation);

    Flow<OKMessage> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void OLrzqt(@NotNull OKMessage oKMessage);

    void OLrzqt(@NotNull WSSendReactionData wSSendReactionData, InterfaceC44295sKn interfaceC44295sKn);

    void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1);

    void copydefault();

    void copydefault(@NotNull OKMessage oKMessage);

    SharedFlow<C44391sOb> djBIcL();

    java.lang.String fetchVPNInfo();

    StateFlow<java.util.List<InHouseIMMessageEntity>> gEmmrt();

    LiveData<java.lang.String> isConnected();

    SharedFlow<InHouseIMMessageEntity> valueOf();

    public static final class Activity {
        public static /* synthetic */ void sendMessage$default(sKH skh, OKMessage oKMessage, InterfaceC44289sKh interfaceC44289sKh, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
            }
            if ((i & 2) != 0) {
                interfaceC44289sKh = null;
            }
            skh.KWHzl(oKMessage, interfaceC44289sKh);
        }

        public static /* synthetic */ void sendReactionMessage$default(sKH skh, WSSendReactionData wSSendReactionData, InterfaceC44295sKn interfaceC44295sKn, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendReactionMessage");
            }
            if ((i & 2) != 0) {
                interfaceC44295sKn = null;
            }
            skh.OLrzqt(wSSendReactionData, interfaceC44295sKn);
        }

        public static /* synthetic */ java.lang.Object getMessageReactionDetail$default(sKH skh, java.lang.String str, long j, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessageReactionDetail");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return skh.OLrzqt(str, j, z, continuation);
        }

        public static /* synthetic */ void sendCustomMessage$default(sKH skh, OKMessage oKMessage, java.lang.String str, java.lang.String str2, InterfaceC44289sKh interfaceC44289sKh, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCustomMessage");
            }
            if ((i & 8) != 0) {
                interfaceC44289sKh = null;
            }
            skh.KWHzl(oKMessage, str, str2, interfaceC44289sKh);
        }

        public static /* synthetic */ void sendMediaMessage$default(sKH skh, OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMediaMessage");
            }
            if ((i & 2) != 0) {
                interfaceC44290sKi = null;
            }
            skh.AEQbTJ(oKMessage, interfaceC44290sKi);
        }

        public static /* synthetic */ java.lang.Object recallMessage$default(sKH skh, OKMessage oKMessage, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recallMessage");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return skh.AEQbTJ(oKMessage, str, continuation);
        }

        /* JADX INFO: renamed from: o.sKH$Activity$Activity, reason: collision with other inner class name */
        public static final class C0937Activity extends MutableLiveData<java.lang.String> {
            public final Function1<java.lang.String, Unit> AEQbTJ = new Function1() { // from class: o.sKJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return sKH.Activity.C0937Activity.KWHzl(this.copydefault, (java.lang.String) obj);
                }
            };
            public final /* synthetic */ sKH KWHzl;

            public C0937Activity(sKH skh) {
                this.KWHzl = skh;
            }

            public static final Unit KWHzl(C0937Activity c0937Activity, java.lang.String str) {
                c0937Activity.setValue(c0937Activity.EZpvd());
                return Unit.INSTANCE;
            }

            public final java.lang.String EZpvd() {
                return this.KWHzl.fetchVPNInfo();
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                super.onActive();
                this.KWHzl.OLrzqt(this.AEQbTJ);
                setValue(this.KWHzl.fetchVPNInfo());
            }

            @Override // androidx.lifecycle.LiveData
            public void onInactive() {
                super.onInactive();
                this.KWHzl.AEQbTJ(this.AEQbTJ);
            }
        }

        public static LiveData<java.lang.String> EZpvd(@NotNull sKH skh) {
            return new C0937Activity(skh);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sKH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        public static final class Activity extends StateListAnimator {
            public final java.lang.Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = activity.KWHzl;
                }
                return activity.KWHzl(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Activity(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sKH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.sKH$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0938TaskDescription extends TaskDescription {
            public static final C0938TaskDescription copydefault = new C0938TaskDescription();

            private C0938TaskDescription() {
                super(null);
            }
        }

        private TaskDescription() {
        }
    }
}
