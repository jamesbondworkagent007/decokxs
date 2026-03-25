package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKInvisibleCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import com.okinc.okimcore.model.im.inhouseim.ws.Reaction;
import com.okinc.okimcore.model.im.inhouseim.ws.UserUid;
import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMsg;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse;
import com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import com.okinc.okimcore.usecase.MessagesUseCase$buildAckMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$calculateNextSequenceRange$1;
import com.okinc.okimcore.usecase.MessagesUseCase$createResponseWithFetchedMessages$2;
import com.okinc.okimcore.usecase.MessagesUseCase$deleteMessageFromDb$1;
import com.okinc.okimcore.usecase.MessagesUseCase$determineMaxSequence$1;
import com.okinc.okimcore.usecase.MessagesUseCase$determineMaxSequenceWithWebSocketCheck$1;
import com.okinc.okimcore.usecase.MessagesUseCase$extractReferenceMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$fetchMissingMessages$2;
import com.okinc.okimcore.usecase.MessagesUseCase$finalizeLoadingResult$1;
import com.okinc.okimcore.usecase.MessagesUseCase$generateInHouseMessageListResponse$1;
import com.okinc.okimcore.usecase.MessagesUseCase$getFirstUnreadMessageSeq$1;
import com.okinc.okimcore.usecase.MessagesUseCase$getFirstUnreadMessageSeqOffline$1;
import com.okinc.okimcore.usecase.MessagesUseCase$getRecallingMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$handleUpdateNewReaction$1;
import com.okinc.okimcore.usecase.MessagesUseCase$invalidatePendingMessages$1;
import com.okinc.okimcore.usecase.MessagesUseCase$loadMessageInBothDirections$2;
import com.okinc.okimcore.usecase.MessagesUseCase$loadMessageWithReactionResult$1;
import com.okinc.okimcore.usecase.MessagesUseCase$loadMessagesWith$2;
import com.okinc.okimcore.usecase.MessagesUseCase$loadMessagesWith$3;
import com.okinc.okimcore.usecase.MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1;
import com.okinc.okimcore.usecase.MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1;
import com.okinc.okimcore.usecase.MessagesUseCase$loadOfflineMessagesInBothDirections$2;
import com.okinc.okimcore.usecase.MessagesUseCase$loadOfflineMessagesInSingleDirection$1;
import com.okinc.okimcore.usecase.MessagesUseCase$onPreSendMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$onReactionMessageSent$1;
import com.okinc.okimcore.usecase.MessagesUseCase$onSendMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$onSendMessage$2$1;
import com.okinc.okimcore.usecase.MessagesUseCase$onSendMessageFailed$1;
import com.okinc.okimcore.usecase.MessagesUseCase$onSendMessageSuccess$1;
import com.okinc.okimcore.usecase.MessagesUseCase$persistSentMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$preSendFlow$1;
import com.okinc.okimcore.usecase.MessagesUseCase$processMessageLoadingLoop$1;
import com.okinc.okimcore.usecase.MessagesUseCase$processOfflineDownloadRequest$1;
import com.okinc.okimcore.usecase.MessagesUseCase$readAllMessages$1;
import com.okinc.okimcore.usecase.MessagesUseCase$recallMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$refreshConversationLastMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$sendMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$sendReadReceiptIfPossible$1;
import com.okinc.okimcore.usecase.MessagesUseCase$sendWsMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$submitMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$submitReactionMessage$1;
import com.okinc.okimcore.usecase.MessagesUseCase$updateSequenceRangeIfNeeded$1;
import com.okinc.okimcore.usecase.MessagesUseCase$validateConversation$1;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C59462zhW;
import o.sFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44502sSe {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C44484sRn AEQbTJ;
    public final sMF AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final sJZ AkhnZx;
    public final C44486sRp DbNXlk;
    public final InHouseIMConversationService KWHzl;
    public final sHZ OLrzqt;
    public final C44485sRo copydefault;
    public final sJW djBIcL;
    public final sSL ejfBZ;
    public final C44489sRs fARcdN;
    public final ConcurrentHashMap<java.lang.String, Mutex> fIwbmz;
    public final sSJ fJNWhG;
    public final sSK fetchVPNInfo;
    public final sJY gEmmrt;
    public final CoroutineDispatcher isConnected;
    public final C44272sJr valueOf;
    public final CoroutineDispatcher values;

    /* JADX INFO: renamed from: o.sSe$PendingIntent */
    public final /* synthetic */ class PendingIntent {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GetMessageDirection.values().length];
            try {
                iArr[GetMessageDirection.BOTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher AEQbTJ() {
        return this.isConnected;
    }

    public final boolean KWHzl(int i, boolean z) {
        return i > 0 && !z;
    }

    @yCM
    public C44502sSe(@NotNull C44484sRn c44484sRn, @NotNull C44485sRo c44485sRo, @NotNull C44486sRp c44486sRp, @NotNull sMF smf, @NotNull InHouseIMConversationService inHouseIMConversationService, @NotNull C44489sRs c44489sRs, @NotNull C44272sJr c44272sJr, @NotNull sHZ shz, @NotNull sJY sjy, @NotNull sJZ sjz, @NotNull sJW sjw, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sSL ssl, @NotNull sSJ ssj, @NotNull sSK ssk) {
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(c44485sRo, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        Intrinsics.checkNotNullParameter(smf, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationService, "");
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        Intrinsics.checkNotNullParameter(c44272sJr, "");
        Intrinsics.checkNotNullParameter(shz, "");
        Intrinsics.checkNotNullParameter(sjy, "");
        Intrinsics.checkNotNullParameter(sjz, "");
        Intrinsics.checkNotNullParameter(sjw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ssl, "");
        Intrinsics.checkNotNullParameter(ssj, "");
        Intrinsics.checkNotNullParameter(ssk, "");
        this.AEQbTJ = c44484sRn;
        this.copydefault = c44485sRo;
        this.DbNXlk = c44486sRp;
        this.AYXKKw = smf;
        this.KWHzl = inHouseIMConversationService;
        this.fARcdN = c44489sRs;
        this.valueOf = c44272sJr;
        this.OLrzqt = shz;
        this.gEmmrt = sjy;
        this.AkhnZx = sjz;
        this.djBIcL = sjw;
        this.AhwBna = coroutineDispatcher;
        this.ejfBZ = ssl;
        this.fJNWhG = ssj;
        this.fetchVPNInfo = ssk;
        this.values = coroutineDispatcher.limitedParallelism(1);
        this.isConnected = coroutineDispatcher.limitedParallelism(10);
        this.fIwbmz = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.sSe$AssistContent */
    public static final class AssistContent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((InHouseIMMessageEntity) t).getSeq()), java.lang.Long.valueOf(((InHouseIMMessageEntity) t2).getSeq()));
        }
    }

    /* JADX INFO: renamed from: o.sSe$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((InHouseIMMessageWithReactions) t).getImMessageEntity().getSendTime()), java.lang.Long.valueOf(((InHouseIMMessageWithReactions) t2).getImMessageEntity().getSendTime()));
        }
    }

    /* JADX INFO: renamed from: o.sSe$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((InHouseIMMessageWithReactions) t).getImMessageEntity().getSendTime()), java.lang.Long.valueOf(((InHouseIMMessageWithReactions) t2).getImMessageEntity().getSendTime()));
        }
    }

    /* JADX INFO: renamed from: o.sSe$SharedElementCallback */
    public static final class SharedElementCallback<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((WSSendMessageDetailData) t).getSeq(), ((WSSendMessageDetailData) t2).getSeq());
        }
    }

    /* JADX INFO: renamed from: o.sSe$TaskStackBuilder */
    public static final class TaskStackBuilder<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((InHouseIMMessageEntity) t).getSeq()), java.lang.Long.valueOf(((InHouseIMMessageEntity) t2).getSeq()));
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (r19v0 o.sRn)
  (r20v0 o.sRo)
  (r21v0 o.sRp)
  (r22v0 o.sMF)
  (r23v0 com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService)
  (r24v0 o.sRs)
  (r25v0 o.sJr)
  (r26v0 o.sHZ)
  (r27v0 o.sJY)
  (r28v0 o.sJZ)
  (r29v0 o.sJW)
  (r30v0 kotlinx.coroutines.CoroutineDispatcher)
  (wrap:o.sSL:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:107) call: o.sSF.<init>():void type: CONSTRUCTOR) : (r31v0 o.sSL))
  (wrap:o.sSJ:?: TERNARY null = ((wrap:int:0x000f: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:108) call: o.sSD.<init>():void type: CONSTRUCTOR) : (r32v0 o.sSJ))
  (wrap:o.sSK:?: TERNARY null = ((wrap:int:0x001d: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:109) call: o.sSE.<init>():void type: CONSTRUCTOR) : (r33v0 o.sSK))
 A[MD:(o.sRn, o.sRo, o.sRp, o.sMF, com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService, o.sRs, o.sJr, o.sHZ, o.sJY, o.sJZ, o.sJW, kotlinx.coroutines.CoroutineDispatcher, o.sSL, o.sSJ, o.sSK):void (m)] (LINE:94) call: o.sSe.<init>(o.sRn, o.sRo, o.sRp, o.sMF, com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService, o.sRs, o.sJr, o.sHZ, o.sJY, o.sJZ, o.sJW, kotlinx.coroutines.CoroutineDispatcher, o.sSL, o.sSJ, o.sSK):void type: THIS */
    public /* synthetic */ C44502sSe(C44484sRn c44484sRn, C44485sRo c44485sRo, C44486sRp c44486sRp, sMF smf, InHouseIMConversationService inHouseIMConversationService, C44489sRs c44489sRs, C44272sJr c44272sJr, sHZ shz, sJY sjy, sJZ sjz, sJW sjw, CoroutineDispatcher coroutineDispatcher, sSL ssl, sSJ ssj, sSK ssk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c44484sRn, c44485sRo, c44486sRp, smf, inHouseIMConversationService, c44489sRs, c44272sJr, shz, sjy, sjz, sjw, coroutineDispatcher, (i & 4096) != 0 ? new sSF() : ssl, (i & 8192) != 0 ? new sSD() : ssj, (i & 16384) != 0 ? new sSE() : ssk);
    }

    /* JADX INFO: renamed from: o.sSe$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSe.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.sSe$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((InHouseIMMessageWithReactions) t2).getImMessageEntity().getSendTime()), java.lang.Long.valueOf(((InHouseIMMessageWithReactions) t).getImMessageEntity().getSendTime()));
        }
    }

    /* JADX INFO: renamed from: o.sSe$VoiceInteractor */
    public static final class VoiceInteractor<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((InHouseIMMessageEntity) t2).getSeq()), java.lang.Long.valueOf(((InHouseIMMessageEntity) t).getSeq()));
        }
    }

    /* JADX INFO: renamed from: o.sSe$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.sSe$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0942StateListAnimator extends StateListAnimator {
            public final boolean AEQbTJ;
            public final InHouseIMMessageEntity EZpvd;
            public final InHouseIMMessageEntity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0942StateListAnimator copy$default(C0942StateListAnimator c0942StateListAnimator, InHouseIMMessageEntity inHouseIMMessageEntity, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    inHouseIMMessageEntity = c0942StateListAnimator.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = c0942StateListAnimator.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    inHouseIMMessageEntity2 = c0942StateListAnimator.copydefault;
                }
                return c0942StateListAnimator.KWHzl(inHouseIMMessageEntity, z, inHouseIMMessageEntity2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0942StateListAnimator KWHzl(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity2) {
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
                return new C0942StateListAnimator(inHouseIMMessageEntity, z, inHouseIMMessageEntity2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InHouseIMMessageEntity OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InHouseIMMessageEntity copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0942StateListAnimator)) {
                    return false;
                }
                C0942StateListAnimator c0942StateListAnimator = (C0942StateListAnimator) obj;
                return Intrinsics.EZpvd(this.EZpvd, c0942StateListAnimator.EZpvd) && this.AEQbTJ == c0942StateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c0942StateListAnimator.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
                InHouseIMMessageEntity inHouseIMMessageEntity = this.copydefault;
                return (((iHashCode * 31) + iHashCode2) * 31) + (inHouseIMMessageEntity == null ? 0 : inHouseIMMessageEntity.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Sending(message=" + this.EZpvd + ", isResend=" + this.AEQbTJ + ", referenceMessage=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0942StateListAnimator(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, boolean z, InHouseIMMessageEntity inHouseIMMessageEntity2) {
                super(null);
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
                this.EZpvd = inHouseIMMessageEntity;
                this.AEQbTJ = z;
                this.copydefault = inHouseIMMessageEntity2;
            }
        }

        /* JADX INFO: renamed from: o.sSe$StateListAnimator$Application */
        public static final class Application extends StateListAnimator {
            public final InHouseIMMessageEntity AEQbTJ;
            public final InHouseIMMessageEntity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, InHouseIMMessageEntity inHouseIMMessageEntity, InHouseIMMessageEntity inHouseIMMessageEntity2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    inHouseIMMessageEntity = application.copydefault;
                }
                if ((i & 2) != 0) {
                    inHouseIMMessageEntity2 = application.AEQbTJ;
                }
                return application.OLrzqt(inHouseIMMessageEntity, inHouseIMMessageEntity2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InHouseIMMessageEntity EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InHouseIMMessageEntity KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity2) {
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity2, "");
                return new Application(inHouseIMMessageEntity, inHouseIMMessageEntity2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Sent(pendingMessage=" + this.copydefault + ", ackMessage=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity2) {
                super(null);
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity2, "");
                this.copydefault = inHouseIMMessageEntity;
                this.AEQbTJ = inHouseIMMessageEntity2;
            }
        }

        /* JADX INFO: renamed from: o.sSe$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public final InHouseIMMessageEntity KWHzl;
            public final java.lang.Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InHouseIMMessageEntity inHouseIMMessageEntity, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    inHouseIMMessageEntity = taskDescription.KWHzl;
                }
                if ((i & 2) != 0) {
                    th = taskDescription.OLrzqt;
                }
                return taskDescription.KWHzl(inHouseIMMessageEntity, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InHouseIMMessageEntity AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
                Intrinsics.checkNotNullParameter(th, "");
                return new TaskDescription(inHouseIMMessageEntity, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failed(message=" + this.KWHzl + ", throwable=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = inHouseIMMessageEntity;
                this.OLrzqt = th;
            }
        }
    }

    /* JADX INFO: renamed from: o.sSe$Dialog */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Dialog {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSe.Dialog.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Dialog(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Dialog() {
        }

        /* JADX INFO: renamed from: o.sSe$Dialog$StateListAnimator */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class StateListAnimator extends Dialog {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.sSe$Dialog$TaskDescription */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription extends Dialog {
            public final OKMessage copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, OKMessage oKMessage, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKMessage = taskDescription.copydefault;
                }
                return taskDescription.KWHzl(oKMessage);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKMessage AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull OKMessage oKMessage) {
                Intrinsics.checkNotNullParameter(oKMessage, "");
                return new TaskDescription(oKMessage);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Sent(message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull OKMessage oKMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(oKMessage, "");
                this.copydefault = oKMessage;
            }
        }

        /* JADX INFO: renamed from: o.sSe$Dialog$ActionBar */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class ActionBar extends Dialog {
            public final OKMessage OLrzqt;
            public final java.lang.Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, OKMessage oKMessage, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKMessage = actionBar.OLrzqt;
                }
                if ((i & 2) != 0) {
                    th = actionBar.copydefault;
                }
                return actionBar.EZpvd(oKMessage, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKMessage EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull OKMessage oKMessage, @NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(oKMessage, "");
                Intrinsics.checkNotNullParameter(th, "");
                return new ActionBar(oKMessage, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failed(message=" + this.OLrzqt + ", throwable=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull OKMessage oKMessage, @NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(oKMessage, "");
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = oKMessage;
                this.copydefault = th;
            }
        }
    }

    public final long KWHzl() {
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        return C59462zhW.gEmmrt(C59519zia.EZpvd(90, DurationUnit.SECONDS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull OKMessage oKMessage, @NotNull Continuation<? super StateListAnimator.C0942StateListAnimator> continuation) throws java.lang.Throwable {
        MessagesUseCase$onPreSendMessage$1 messagesUseCase$onPreSendMessage$1;
        java.lang.Object objAEQbTJ;
        C44502sSe c44502sSe;
        ?? r13;
        WSSendMsg wSSendMsg;
        OKMessage oKMessage2;
        ?? r12;
        C44502sSe c44502sSe2;
        if (continuation instanceof MessagesUseCase$onPreSendMessage$1) {
            messagesUseCase$onPreSendMessage$1 = (MessagesUseCase$onPreSendMessage$1) continuation;
            int i = messagesUseCase$onPreSendMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$onPreSendMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$onPreSendMessage$1 = new MessagesUseCase$onPreSendMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = messagesUseCase$onPreSendMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$onPreSendMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            oKMessage.setSentTime(java.lang.System.currentTimeMillis());
            boolean z = oKMessage.getSentStatus() == OKMessage.SentStatus.FAILED;
            java.lang.String targetId = oKMessage.getTargetId();
            pUU.EZpvd("okimreply", "onPreSendMessage, message id=" + oKMessage.getSeq());
            AEQbTJ(oKMessage, z, targetId);
            C44489sRs c44489sRs = this.fARcdN;
            messagesUseCase$onPreSendMessage$1.L$0 = this;
            messagesUseCase$onPreSendMessage$1.L$1 = oKMessage;
            messagesUseCase$onPreSendMessage$1.I$0 = z ? 1 : 0;
            messagesUseCase$onPreSendMessage$1.label = 1;
            objAEQbTJ = c44489sRs.AEQbTJ(oKMessage, messagesUseCase$onPreSendMessage$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
            r13 = z;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = messagesUseCase$onPreSendMessage$1.I$0;
                wSSendMsg = (WSSendMsg) messagesUseCase$onPreSendMessage$1.L$2;
                oKMessage2 = (OKMessage) messagesUseCase$onPreSendMessage$1.L$1;
                C44502sSe c44502sSe3 = (C44502sSe) messagesUseCase$onPreSendMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c44502sSe2 = c44502sSe3;
                r12 = i3;
                InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) obj;
                InHouseIMMessageEntity inHouseIMMessageEntityAEQbTJ = c44502sSe2.AEQbTJ(oKMessage2, wSSendMsg, inHouseIMMessageEntity);
                c44502sSe2.EZpvd(inHouseIMMessageEntityAEQbTJ);
                return new StateListAnimator.C0942StateListAnimator(inHouseIMMessageEntityAEQbTJ, r12 != 0, inHouseIMMessageEntity);
            }
            int i4 = messagesUseCase$onPreSendMessage$1.I$0;
            OKMessage oKMessage3 = (OKMessage) messagesUseCase$onPreSendMessage$1.L$1;
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$onPreSendMessage$1.L$0;
            C56391yDq.AEQbTJ(obj);
            r13 = i4;
            oKMessage = oKMessage3;
            objAEQbTJ = obj;
            c44502sSe = c44502sSe4;
        }
        WSSendMsg wSSendMsg2 = (WSSendMsg) objAEQbTJ;
        messagesUseCase$onPreSendMessage$1.L$0 = c44502sSe;
        messagesUseCase$onPreSendMessage$1.L$1 = oKMessage;
        messagesUseCase$onPreSendMessage$1.L$2 = wSSendMsg2;
        messagesUseCase$onPreSendMessage$1.I$0 = r13;
        messagesUseCase$onPreSendMessage$1.label = 2;
        java.lang.Object objKWHzl = c44502sSe.KWHzl(oKMessage, wSSendMsg2, messagesUseCase$onPreSendMessage$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        wSSendMsg = wSSendMsg2;
        oKMessage2 = oKMessage;
        r12 = r13;
        obj = objKWHzl;
        c44502sSe2 = c44502sSe;
        InHouseIMMessageEntity inHouseIMMessageEntity2 = (InHouseIMMessageEntity) obj;
        InHouseIMMessageEntity inHouseIMMessageEntityAEQbTJ2 = c44502sSe2.AEQbTJ(oKMessage2, wSSendMsg, inHouseIMMessageEntity2);
        c44502sSe2.EZpvd(inHouseIMMessageEntityAEQbTJ2);
        return new StateListAnimator.C0942StateListAnimator(inHouseIMMessageEntityAEQbTJ2, r12 != 0, inHouseIMMessageEntity2);
    }

    public final void AEQbTJ(OKMessage oKMessage, boolean z, java.lang.String str) {
        if (z) {
            C44124sEe.imLogSync$default("resend message => resend[" + oKMessage.getSeq() + "] clientMessageId[" + oKMessage.getClientMessageId() + "]", null, str, 2, null);
            oKMessage.setSeq(oKMessage.getSeq());
            return;
        }
        long j = -java.lang.System.currentTimeMillis();
        C44124sEe.imLogSync$default("send message => send[" + j + "] clientMessageId[" + oKMessage.getClientMessageId() + "]", null, str, 2, null);
        oKMessage.setSeq(j);
        oKMessage.setSentStatus(OKMessage.SentStatus.SENDING);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(OKMessage oKMessage, WSSendMsg wSSendMsg, Continuation<? super InHouseIMMessageEntity> continuation) throws java.lang.Throwable {
        MessagesUseCase$extractReferenceMessage$1 messagesUseCase$extractReferenceMessage$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.String referMsgUid;
        java.lang.Long fieldNames;
        if (continuation instanceof MessagesUseCase$extractReferenceMessage$1) {
            messagesUseCase$extractReferenceMessage$1 = (MessagesUseCase$extractReferenceMessage$1) continuation;
            int i = messagesUseCase$extractReferenceMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$extractReferenceMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$extractReferenceMessage$1 = new MessagesUseCase$extractReferenceMessage$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = messagesUseCase$extractReferenceMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$extractReferenceMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                OKMessageContent content = oKMessage.getContent();
                OKReferenceMessage oKReferenceMessage = content instanceof OKReferenceMessage ? (OKReferenceMessage) content : null;
                if (oKReferenceMessage == null || (referMsgUid = oKReferenceMessage.getReferMsgUid()) == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(referMsgUid)) == null) {
                    return null;
                }
                Result.Application application = Result.Companion;
                long jLongValue = fieldNames.longValue();
                C44486sRp c44486sRp = this.DbNXlk;
                java.lang.String strAEQbTJ = wSSendMsg.OLrzqt().AEQbTJ();
                messagesUseCase$extractReferenceMessage$1.label = 1;
                objAEQbTJ = c44486sRp.AEQbTJ(strAEQbTJ, jLongValue, messagesUseCase$extractReferenceMessage$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InHouseIMMessageEntity) objAEQbTJ);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (InHouseIMMessageEntity) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final InHouseIMMessageEntity AEQbTJ(@NotNull OKMessage oKMessage, @NotNull WSSendMsg wSSendMsg, InHouseIMMessageEntity inHouseIMMessageEntity) {
        java.lang.String messageId;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(wSSendMsg, "");
        InHouseIMMessageEntity inHouseIMMessageEntity$default = sQS.toInHouseIMMessageEntity$default(wSSendMsg.OLrzqt().EZpvd(), 0, 1, null);
        boolean zAYXKKw = sMS.djBIcL.AYXKKw(wSSendMsg.OLrzqt().EZpvd());
        java.lang.String targetId = oKMessage.getTargetId();
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        java.lang.String str = strKWHzl == null ? "" : strKWHzl;
        long sentTime = oKMessage.getSentTime();
        long seq = oKMessage.getSeq();
        if (sQS.KWHzl(inHouseIMMessageEntity$default)) {
            messageId = inHouseIMMessageEntity$default.getChannelId() + inHouseIMMessageEntity$default.getSeq();
        } else {
            messageId = inHouseIMMessageEntity$default.getMessageId();
        }
        return inHouseIMMessageEntity$default.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity$default.messageId : messageId, ((-2) & 2) != 0 ? inHouseIMMessageEntity$default.channelId : targetId, ((-2) & 4) != 0 ? inHouseIMMessageEntity$default.senderUid : str, ((-2) & 8) != 0 ? inHouseIMMessageEntity$default.seq : seq, ((-2) & 16) != 0 ? inHouseIMMessageEntity$default.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity$default.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity$default.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity$default.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity$default.isVisible : java.lang.Boolean.valueOf(zAYXKKw), ((-2) & 512) != 0 ? inHouseIMMessageEntity$default.sendTime : sentTime, ((-2) & 1024) != 0 ? inHouseIMMessageEntity$default.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity$default.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity$default.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity$default.sentStatus : 1, ((-2) & 16384) != 0 ? inHouseIMMessageEntity$default.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity$default.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity$default.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity$default.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity$default.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity$default.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity$default.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity$default.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity$default.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity$default.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity$default.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity$default.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity$default.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity$default.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity$default.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity$default.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity$default.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity$default.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity$default.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity$default.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity$default.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity$default.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity$default.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity$default.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity$default.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity$default.replySeq : inHouseIMMessageEntity != null ? java.lang.Long.valueOf(inHouseIMMessageEntity.getSeq()) : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity$default.quotedMessage : inHouseIMMessageEntity, (536870911 & 512) != 0 ? inHouseIMMessageEntity$default.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity$default.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity$default.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity$default.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity$default.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity$default.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity$default.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity$default.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity$default.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity$default.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity$default.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity$default.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity$default.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity$default.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity$default.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity$default.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity$default.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity$default.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity$default.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity$default.reactionUpdateTime : 0L);
    }

    public final void EZpvd(InHouseIMMessageEntity inHouseIMMessageEntity) {
        C44124sEe.imLogSync$default("send message => inserted pending message[" + inHouseIMMessageEntity.getSeq() + "]", null, inHouseIMMessageEntity.getChannelId(), 2, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.okinc.okimcore.model.im.OKMessage] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.okinc.okimcore.model.im.OKMessage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull Continuation<? super WSSendAck> continuation) throws java.lang.Throwable {
        MessagesUseCase$onSendMessage$1 messagesUseCase$onSendMessage$1;
        C44502sSe c44502sSe;
        ?? r10;
        InHouseIMMessageEntity inHouseIMMessageEntity2;
        java.lang.String str;
        Mutex mutex;
        Mutex mutexPutIfAbsent;
        if (continuation instanceof MessagesUseCase$onSendMessage$1) {
            messagesUseCase$onSendMessage$1 = (MessagesUseCase$onSendMessage$1) continuation;
            int i = messagesUseCase$onSendMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$onSendMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$onSendMessage$1 = new MessagesUseCase$onSendMessage$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeout = messagesUseCase$onSendMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$onSendMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithTimeout);
                java.lang.String messageId = inHouseIMMessageEntity.getMessageId();
                ConcurrentHashMap<java.lang.String, Mutex> concurrentHashMap = this.fIwbmz;
                Mutex mutexMutex$default = concurrentHashMap.get(messageId);
                if (mutexMutex$default == null && (mutexPutIfAbsent = concurrentHashMap.putIfAbsent(messageId, (mutexMutex$default = MutexKt.Mutex$default(false, 1, null)))) != null) {
                    mutexMutex$default = mutexPutIfAbsent;
                }
                Mutex mutex2 = mutexMutex$default;
                Intrinsics.copydefault(mutex2);
                messagesUseCase$onSendMessage$1.L$0 = this;
                messagesUseCase$onSendMessage$1.L$1 = oKMessage;
                messagesUseCase$onSendMessage$1.L$2 = inHouseIMMessageEntity;
                messagesUseCase$onSendMessage$1.L$3 = messageId;
                messagesUseCase$onSendMessage$1.L$4 = mutex2;
                messagesUseCase$onSendMessage$1.label = 1;
                if (mutex2.lock(null, messagesUseCase$onSendMessage$1) == objCopydefault) {
                    return objCopydefault;
                }
                c44502sSe = this;
                r10 = oKMessage;
                inHouseIMMessageEntity2 = inHouseIMMessageEntity;
                str = messageId;
                mutex = mutex2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex3 = (Mutex) messagesUseCase$onSendMessage$1.L$0;
                    C56391yDq.AEQbTJ(objWithTimeout);
                    oKMessage = mutex3;
                    return (WSSendAck) objWithTimeout;
                }
                Mutex mutex4 = (Mutex) messagesUseCase$onSendMessage$1.L$4;
                java.lang.String str2 = (java.lang.String) messagesUseCase$onSendMessage$1.L$3;
                InHouseIMMessageEntity inHouseIMMessageEntity3 = (InHouseIMMessageEntity) messagesUseCase$onSendMessage$1.L$2;
                OKMessage oKMessage2 = (OKMessage) messagesUseCase$onSendMessage$1.L$1;
                C44502sSe c44502sSe2 = (C44502sSe) messagesUseCase$onSendMessage$1.L$0;
                C56391yDq.AEQbTJ(objWithTimeout);
                str = str2;
                inHouseIMMessageEntity2 = inHouseIMMessageEntity3;
                r10 = oKMessage2;
                c44502sSe = c44502sSe2;
                mutex = mutex4;
            }
            long jKWHzl = c44502sSe.KWHzl();
            MessagesUseCase$onSendMessage$2$1 messagesUseCase$onSendMessage$2$1 = new MessagesUseCase$onSendMessage$2$1(c44502sSe, str, inHouseIMMessageEntity2, r10, null);
            messagesUseCase$onSendMessage$1.L$0 = mutex;
            messagesUseCase$onSendMessage$1.L$1 = null;
            messagesUseCase$onSendMessage$1.L$2 = null;
            messagesUseCase$onSendMessage$1.L$3 = null;
            messagesUseCase$onSendMessage$1.L$4 = null;
            messagesUseCase$onSendMessage$1.label = 2;
            objWithTimeout = TimeoutKt.withTimeout(jKWHzl, messagesUseCase$onSendMessage$2$1, messagesUseCase$onSendMessage$1);
            oKMessage = mutex;
            if (objWithTimeout == objCopydefault) {
                return objCopydefault;
            }
            return (WSSendAck) objWithTimeout;
        } finally {
            oKMessage.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(WSRequest wSRequest, Continuation<? super WSSendAck> continuation) throws java.lang.Throwable {
        MessagesUseCase$sendWsMessage$1 messagesUseCase$sendWsMessage$1;
        if (continuation instanceof MessagesUseCase$sendWsMessage$1) {
            messagesUseCase$sendWsMessage$1 = (MessagesUseCase$sendWsMessage$1) continuation;
            int i = messagesUseCase$sendWsMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$sendWsMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$sendWsMessage$1 = new MessagesUseCase$sendWsMessage$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messagesUseCase$sendWsMessage$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messagesUseCase$sendWsMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            this.fARcdN.OLrzqt();
            C44489sRs c44489sRs = this.fARcdN;
            messagesUseCase$sendWsMessage$1.label = 1;
            objCopydefault = c44489sRs.copydefault(wSRequest, messagesUseCase$sendWsMessage$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        WSSendAck wSSendAck = (WSSendAck) objCopydefault;
        if (wSSendAck != null) {
            return wSSendAck;
        }
        throw new java.lang.IllegalStateException("send message => WebSocket returned null ack".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull StateListAnimator.C0942StateListAnimator c0942StateListAnimator, @NotNull WSSendAck wSSendAck, boolean z, @NotNull Continuation<? super StateListAnimator.Application> continuation) throws java.lang.Exception {
        MessagesUseCase$onSendMessageSuccess$1 messagesUseCase$onSendMessageSuccess$1;
        InHouseIMMessageEntity inHouseIMMessageEntityOLrzqt;
        java.lang.Object objKWHzl;
        C44502sSe c44502sSe;
        InHouseIMMessageEntity inHouseIMMessageEntityOLrzqt2;
        InHouseIMMessageEntity inHouseIMMessageEntityCopydefault;
        InHouseIMMessageEntity inHouseIMMessageEntity;
        InHouseIMMessageEntity inHouseIMMessageEntity2;
        if (continuation instanceof MessagesUseCase$onSendMessageSuccess$1) {
            messagesUseCase$onSendMessageSuccess$1 = (MessagesUseCase$onSendMessageSuccess$1) continuation;
            int i = messagesUseCase$onSendMessageSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$onSendMessageSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$onSendMessageSuccess$1 = new MessagesUseCase$onSendMessageSuccess$1(this, continuation);
            }
        }
        java.lang.Object obj = messagesUseCase$onSendMessageSuccess$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$onSendMessageSuccess$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            inHouseIMMessageEntityOLrzqt = c0942StateListAnimator.OLrzqt();
            pUU.EZpvd("okimreply", "onSendMessageSuccess, message id=" + inHouseIMMessageEntityOLrzqt.getSeq());
            messagesUseCase$onSendMessageSuccess$1.L$0 = this;
            messagesUseCase$onSendMessageSuccess$1.L$1 = c0942StateListAnimator;
            messagesUseCase$onSendMessageSuccess$1.L$2 = inHouseIMMessageEntityOLrzqt;
            messagesUseCase$onSendMessageSuccess$1.Z$0 = z;
            messagesUseCase$onSendMessageSuccess$1.label = 1;
            objKWHzl = KWHzl(wSSendAck, c0942StateListAnimator, messagesUseCase$onSendMessageSuccess$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inHouseIMMessageEntity2 = (InHouseIMMessageEntity) messagesUseCase$onSendMessageSuccess$1.L$1;
                inHouseIMMessageEntity = (InHouseIMMessageEntity) messagesUseCase$onSendMessageSuccess$1.L$0;
                C56391yDq.AEQbTJ(obj);
                inHouseIMMessageEntityCopydefault = inHouseIMMessageEntity2;
                inHouseIMMessageEntityOLrzqt2 = inHouseIMMessageEntity;
                return new StateListAnimator.Application(inHouseIMMessageEntityCopydefault, inHouseIMMessageEntityOLrzqt2);
            }
            z = messagesUseCase$onSendMessageSuccess$1.Z$0;
            InHouseIMMessageEntity inHouseIMMessageEntity3 = (InHouseIMMessageEntity) messagesUseCase$onSendMessageSuccess$1.L$2;
            StateListAnimator.C0942StateListAnimator c0942StateListAnimator2 = (StateListAnimator.C0942StateListAnimator) messagesUseCase$onSendMessageSuccess$1.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$onSendMessageSuccess$1.L$0;
            C56391yDq.AEQbTJ(obj);
            inHouseIMMessageEntityOLrzqt = inHouseIMMessageEntity3;
            c0942StateListAnimator = c0942StateListAnimator2;
            objKWHzl = obj;
        }
        InHouseIMMessageEntity inHouseIMMessageEntity4 = (InHouseIMMessageEntity) objKWHzl;
        inHouseIMMessageEntityOLrzqt2 = c44502sSe.OLrzqt(inHouseIMMessageEntity4, c0942StateListAnimator, z);
        inHouseIMMessageEntityCopydefault = c44502sSe.copydefault(inHouseIMMessageEntityOLrzqt2, inHouseIMMessageEntityOLrzqt, z);
        if (InHouseIMContentType.Companion.AEQbTJ(C56443yFo.AEQbTJ(inHouseIMMessageEntityCopydefault.getContentType())) != InHouseIMContentType.TypingIndicator) {
            messagesUseCase$onSendMessageSuccess$1.L$0 = inHouseIMMessageEntityOLrzqt2;
            messagesUseCase$onSendMessageSuccess$1.L$1 = inHouseIMMessageEntityCopydefault;
            messagesUseCase$onSendMessageSuccess$1.L$2 = null;
            messagesUseCase$onSendMessageSuccess$1.label = 2;
            if (c44502sSe.copydefault(inHouseIMMessageEntityCopydefault, inHouseIMMessageEntity4, messagesUseCase$onSendMessageSuccess$1) == objCopydefault) {
                return objCopydefault;
            }
            inHouseIMMessageEntity = inHouseIMMessageEntityOLrzqt2;
            inHouseIMMessageEntity2 = inHouseIMMessageEntityCopydefault;
            inHouseIMMessageEntityCopydefault = inHouseIMMessageEntity2;
            inHouseIMMessageEntityOLrzqt2 = inHouseIMMessageEntity;
        }
        return new StateListAnimator.Application(inHouseIMMessageEntityCopydefault, inHouseIMMessageEntityOLrzqt2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull WSSendReactionAck wSSendReactionAck, @NotNull Continuation<? super InHouseIMMessageWithReactions> continuation) throws java.lang.Exception {
        MessagesUseCase$onReactionMessageSent$1 messagesUseCase$onReactionMessageSent$1;
        C44502sSe c44502sSe;
        InHouseIMMessageWithReactions inHouseIMMessageWithReactions;
        if (continuation instanceof MessagesUseCase$onReactionMessageSent$1) {
            messagesUseCase$onReactionMessageSent$1 = (MessagesUseCase$onReactionMessageSent$1) continuation;
            int i = messagesUseCase$onReactionMessageSent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$onReactionMessageSent$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$onReactionMessageSent$1 = new MessagesUseCase$onReactionMessageSent$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messagesUseCase$onReactionMessageSent$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messagesUseCase$onReactionMessageSent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            WSSendReactionResponse wSSendReactionResponseEZpvd = wSSendReactionAck.EZpvd();
            messagesUseCase$onReactionMessageSent$1.L$0 = this;
            messagesUseCase$onReactionMessageSent$1.L$1 = wSSendReactionAck;
            messagesUseCase$onReactionMessageSent$1.label = 1;
            if (EZpvd(wSSendReactionResponseEZpvd, messagesUseCase$onReactionMessageSent$1) == objCopydefault2) {
                return objCopydefault2;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) objCopydefault;
                if (inHouseIMMessageWithReactions == null) {
                    return inHouseIMMessageWithReactions;
                }
                throw new java.lang.IllegalArgumentException("cannot find message".toString());
            }
            wSSendReactionAck = (WSSendReactionAck) messagesUseCase$onReactionMessageSent$1.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$onReactionMessageSent$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C44486sRp c44486sRp = c44502sSe.DbNXlk;
        java.lang.String strOLrzqt = wSSendReactionAck.EZpvd().OLrzqt();
        long jEZpvd = wSSendReactionAck.EZpvd().EZpvd();
        messagesUseCase$onReactionMessageSent$1.L$0 = null;
        messagesUseCase$onReactionMessageSent$1.L$1 = null;
        messagesUseCase$onReactionMessageSent$1.label = 2;
        objCopydefault = c44486sRp.copydefault(strOLrzqt, jEZpvd, messagesUseCase$onReactionMessageSent$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) objCopydefault;
        if (inHouseIMMessageWithReactions == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(WSSendAck wSSendAck, StateListAnimator.C0942StateListAnimator c0942StateListAnimator, Continuation<? super InHouseIMMessageEntity> continuation) throws java.lang.Exception {
        MessagesUseCase$buildAckMessage$1 messagesUseCase$buildAckMessage$1;
        C44502sSe c44502sSe;
        long j;
        StateListAnimator.C0942StateListAnimator c0942StateListAnimator2;
        if (continuation instanceof MessagesUseCase$buildAckMessage$1) {
            messagesUseCase$buildAckMessage$1 = (MessagesUseCase$buildAckMessage$1) continuation;
            int i = messagesUseCase$buildAckMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$buildAckMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$buildAckMessage$1 = new MessagesUseCase$buildAckMessage$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = messagesUseCase$buildAckMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$buildAckMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            sFA sfa = sFA.KWHzl;
            sMF smf = this.AYXKKw;
            C44486sRp c44486sRp = this.DbNXlk;
            WSSendMessageDetailData wSSendMessageDetailDataEZpvd = wSSendAck.EZpvd();
            messagesUseCase$buildAckMessage$1.L$0 = this;
            messagesUseCase$buildAckMessage$1.L$1 = c0942StateListAnimator;
            messagesUseCase$buildAckMessage$1.J$0 = jCurrentTimeMillis;
            messagesUseCase$buildAckMessage$1.label = 1;
            objKWHzl = sfa.KWHzl(smf, c44486sRp, wSSendMessageDetailDataEZpvd, messagesUseCase$buildAckMessage$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
            j = jCurrentTimeMillis;
            c0942StateListAnimator2 = c0942StateListAnimator;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = messagesUseCase$buildAckMessage$1.J$0;
            c0942StateListAnimator2 = (StateListAnimator.C0942StateListAnimator) messagesUseCase$buildAckMessage$1.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$buildAckMessage$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        InHouseIMMessageEntity inHouseIMMessageEntity$default = sQS.toInHouseIMMessageEntity$default((WSSendMessageDetailData) objKWHzl, 0, 1, null);
        return c44502sSe.OLrzqt(inHouseIMMessageEntity$default.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity$default.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity$default.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity$default.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity$default.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity$default.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity$default.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity$default.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity$default.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity$default.isVisible : null, ((-2) & 512) != 0 ? inHouseIMMessageEntity$default.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity$default.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity$default.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity$default.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity$default.sentStatus : 0, ((-2) & 16384) != 0 ? inHouseIMMessageEntity$default.receiveTime : C56443yFo.KWHzl(j), ((-2) & 32768) != 0 ? inHouseIMMessageEntity$default.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity$default.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity$default.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity$default.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity$default.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity$default.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity$default.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity$default.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity$default.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity$default.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity$default.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity$default.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity$default.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity$default.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity$default.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity$default.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity$default.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity$default.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity$default.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity$default.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity$default.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity$default.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity$default.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity$default.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity$default.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity$default.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity$default.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity$default.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity$default.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity$default.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity$default.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity$default.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity$default.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity$default.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity$default.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity$default.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity$default.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity$default.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity$default.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity$default.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity$default.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity$default.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity$default.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity$default.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity$default.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity$default.reactionUpdateTime : 0L), c0942StateListAnimator2.copydefault());
    }

    public final InHouseIMMessageEntity OLrzqt(InHouseIMMessageEntity inHouseIMMessageEntity, InHouseIMMessageEntity inHouseIMMessageEntity2) {
        return inHouseIMMessageEntity2 == null ? inHouseIMMessageEntity : inHouseIMMessageEntity.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity.isVisible : null, ((-2) & 512) != 0 ? inHouseIMMessageEntity.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity.sentStatus : 0, ((-2) & 16384) != 0 ? inHouseIMMessageEntity.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity.replySeq : java.lang.Long.valueOf(inHouseIMMessageEntity2.getSeq()), (536870911 & 256) != 0 ? inHouseIMMessageEntity.quotedMessage : inHouseIMMessageEntity2, (536870911 & 512) != 0 ? inHouseIMMessageEntity.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity.reactionUpdateTime : 0L);
    }

    public final InHouseIMMessageEntity OLrzqt(InHouseIMMessageEntity inHouseIMMessageEntity, StateListAnimator.C0942StateListAnimator c0942StateListAnimator, boolean z) {
        return inHouseIMMessageEntity.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity.isVisible : java.lang.Boolean.valueOf(!z), ((-2) & 512) != 0 ? inHouseIMMessageEntity.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity.sentStatus : 0, ((-2) & 16384) != 0 ? inHouseIMMessageEntity.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity.localUri : c0942StateListAnimator.OLrzqt().getLocalUri(), (536870911 & 2) != 0 ? inHouseIMMessageEntity.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity.reactionUpdateTime : 0L);
    }

    public final InHouseIMMessageEntity copydefault(InHouseIMMessageEntity inHouseIMMessageEntity, InHouseIMMessageEntity inHouseIMMessageEntity2, boolean z) {
        return inHouseIMMessageEntity.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity.seq : inHouseIMMessageEntity2.getSeq(), ((-2) & 16) != 0 ? inHouseIMMessageEntity.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity.isVisible : java.lang.Boolean.valueOf(!z), ((-2) & 512) != 0 ? inHouseIMMessageEntity.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity.sentStatus : 0, ((-2) & 16384) != 0 ? inHouseIMMessageEntity.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity.reactionUpdateTime : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(InHouseIMMessageEntity inHouseIMMessageEntity, InHouseIMMessageEntity inHouseIMMessageEntity2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MessagesUseCase$persistSentMessage$1 messagesUseCase$persistSentMessage$1;
        if (continuation instanceof MessagesUseCase$persistSentMessage$1) {
            messagesUseCase$persistSentMessage$1 = (MessagesUseCase$persistSentMessage$1) continuation;
            int i = messagesUseCase$persistSentMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$persistSentMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$persistSentMessage$1 = new MessagesUseCase$persistSentMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = messagesUseCase$persistSentMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$persistSentMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C44486sRp c44486sRp = this.DbNXlk;
            long seq = inHouseIMMessageEntity2.getSeq();
            messagesUseCase$persistSentMessage$1.L$0 = inHouseIMMessageEntity;
            messagesUseCase$persistSentMessage$1.label = 1;
            if (c44486sRp.EZpvd(inHouseIMMessageEntity, seq, messagesUseCase$persistSentMessage$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inHouseIMMessageEntity = (InHouseIMMessageEntity) messagesUseCase$persistSentMessage$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C44124sEe.imLogSync$default("send message => inserted ack message with sent status, message[" + inHouseIMMessageEntity.getSeq() + "] clientMessageId[" + inHouseIMMessageEntity.getMessageId() + "]", null, inHouseIMMessageEntity.getChannelId(), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull java.lang.Throwable th, @NotNull OKMessage oKMessage, @NotNull Continuation<? super StateListAnimator.TaskDescription> continuation) throws java.lang.Throwable {
        MessagesUseCase$onSendMessageFailed$1 messagesUseCase$onSendMessageFailed$1;
        InHouseIMMessageEntity inHouseIMMessageEntity2;
        java.lang.Throwable th2;
        InHouseIMMessageEntity inHouseIMMessageEntity3;
        C44502sSe c44502sSe;
        C44484sRn c44484sRn;
        java.lang.String channelId;
        long sendTime;
        java.lang.String messageId;
        if (continuation instanceof MessagesUseCase$onSendMessageFailed$1) {
            messagesUseCase$onSendMessageFailed$1 = (MessagesUseCase$onSendMessageFailed$1) continuation;
            int i = messagesUseCase$onSendMessageFailed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$onSendMessageFailed$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$onSendMessageFailed$1 = new MessagesUseCase$onSendMessageFailed$1(this, continuation);
            }
        }
        MessagesUseCase$onSendMessageFailed$1 messagesUseCase$onSendMessageFailed$12 = messagesUseCase$onSendMessageFailed$1;
        java.lang.Object obj = messagesUseCase$onSendMessageFailed$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$onSendMessageFailed$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("okimreply", "onSendMessageFailed, message id=" + inHouseIMMessageEntity.getSeq());
            InHouseIMMessageEntity inHouseIMMessageEntityCopy = inHouseIMMessageEntity.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity.isVisible : null, ((-2) & 512) != 0 ? inHouseIMMessageEntity.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity.sentStatus : 2, ((-2) & 16384) != 0 ? inHouseIMMessageEntity.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity.reactionUpdateTime : 0L);
            boolean z = oKMessage.getContent() instanceof OKInvisibleCustomMessage;
            if (!sPQ.OLrzqt(InHouseIMContentType.Companion.AEQbTJ(C56443yFo.AEQbTJ(inHouseIMMessageEntity.getContentType()))) || z) {
                inHouseIMMessageEntity2 = inHouseIMMessageEntityCopy;
                th2 = th;
            } else {
                C44486sRp c44486sRp = this.DbNXlk;
                messagesUseCase$onSendMessageFailed$12.L$0 = this;
                messagesUseCase$onSendMessageFailed$12.L$1 = th;
                messagesUseCase$onSendMessageFailed$12.L$2 = inHouseIMMessageEntityCopy;
                messagesUseCase$onSendMessageFailed$12.label = 1;
                if (c44486sRp.copydefault(inHouseIMMessageEntityCopy, messagesUseCase$onSendMessageFailed$12) == objCopydefault) {
                    return objCopydefault;
                }
                inHouseIMMessageEntity3 = inHouseIMMessageEntityCopy;
                th2 = th;
                c44502sSe = this;
                c44484sRn = c44502sSe.AEQbTJ;
                channelId = inHouseIMMessageEntity3.getChannelId();
                sendTime = inHouseIMMessageEntity3.getSendTime();
                messageId = inHouseIMMessageEntity3.getMessageId();
                messagesUseCase$onSendMessageFailed$12.L$0 = th2;
                messagesUseCase$onSendMessageFailed$12.L$1 = inHouseIMMessageEntity3;
                messagesUseCase$onSendMessageFailed$12.L$2 = null;
                messagesUseCase$onSendMessageFailed$12.label = 2;
                if (c44484sRn.EZpvd(channelId, sendTime, messageId, messagesUseCase$onSendMessageFailed$12) != objCopydefault) {
                }
            }
        } else if (i2 == 1) {
            InHouseIMMessageEntity inHouseIMMessageEntity4 = (InHouseIMMessageEntity) messagesUseCase$onSendMessageFailed$12.L$2;
            java.lang.Throwable th3 = (java.lang.Throwable) messagesUseCase$onSendMessageFailed$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$onSendMessageFailed$12.L$0;
            C56391yDq.AEQbTJ(obj);
            inHouseIMMessageEntity3 = inHouseIMMessageEntity4;
            th2 = th3;
            c44484sRn = c44502sSe.AEQbTJ;
            channelId = inHouseIMMessageEntity3.getChannelId();
            sendTime = inHouseIMMessageEntity3.getSendTime();
            messageId = inHouseIMMessageEntity3.getMessageId();
            messagesUseCase$onSendMessageFailed$12.L$0 = th2;
            messagesUseCase$onSendMessageFailed$12.L$1 = inHouseIMMessageEntity3;
            messagesUseCase$onSendMessageFailed$12.L$2 = null;
            messagesUseCase$onSendMessageFailed$12.label = 2;
            if (c44484sRn.EZpvd(channelId, sendTime, messageId, messagesUseCase$onSendMessageFailed$12) != objCopydefault) {
                return objCopydefault;
            }
            inHouseIMMessageEntity2 = inHouseIMMessageEntity3;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inHouseIMMessageEntity2 = (InHouseIMMessageEntity) messagesUseCase$onSendMessageFailed$12.L$1;
            java.lang.Throwable th4 = (java.lang.Throwable) messagesUseCase$onSendMessageFailed$12.L$0;
            C56391yDq.AEQbTJ(obj);
            th2 = th4;
        }
        C44124sEe.AEQbTJ("send message => inserted pending message with failed status, message[" + inHouseIMMessageEntity2.getSeq() + "] clientMessageId[" + inHouseIMMessageEntity2.getMessageId() + "], error=" + C56379yDe.AEQbTJ(th2), th2, inHouseIMMessageEntity2.getChannelId());
        sRW.KWHzl.KWHzl(inHouseIMMessageEntity2, th2);
        return new StateListAnimator.TaskDescription(inHouseIMMessageEntity2, th2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MessagesUseCase$deleteMessageFromDb$1 messagesUseCase$deleteMessageFromDb$1;
        java.lang.String str2;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C44502sSe c44502sSe;
        java.lang.String channelId;
        if (continuation instanceof MessagesUseCase$deleteMessageFromDb$1) {
            messagesUseCase$deleteMessageFromDb$1 = (MessagesUseCase$deleteMessageFromDb$1) continuation;
            int i = messagesUseCase$deleteMessageFromDb$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$deleteMessageFromDb$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$deleteMessageFromDb$1 = new MessagesUseCase$deleteMessageFromDb$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = messagesUseCase$deleteMessageFromDb$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$deleteMessageFromDb$1.label;
        try {
        } catch (java.lang.Throwable th2) {
            str2 = str;
            th = th2;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            Result.Application application = Result.Companion;
            C44486sRp c44486sRp = this.DbNXlk;
            messagesUseCase$deleteMessageFromDb$1.L$0 = str;
            messagesUseCase$deleteMessageFromDb$1.L$1 = this;
            messagesUseCase$deleteMessageFromDb$1.label = 1;
            objDjBIcL = c44486sRp.djBIcL(str, messagesUseCase$deleteMessageFromDb$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) messagesUseCase$deleteMessageFromDb$1.L$0;
                    C56391yDq.AEQbTJ(objDjBIcL);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("FileUploadProgress", "[" + C59454zhO.isConnected(str, 8) + "] deleteMessageFromDb: failed", thM7380exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                java.lang.String str3 = (java.lang.String) messagesUseCase$deleteMessageFromDb$1.L$2;
                c44502sSe = (C44502sSe) messagesUseCase$deleteMessageFromDb$1.L$1;
                str2 = (java.lang.String) messagesUseCase$deleteMessageFromDb$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objDjBIcL);
                    channelId = str3;
                    str = str2;
                    pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(str, 8) + "] deleteMessageFromDb: deleted");
                    messagesUseCase$deleteMessageFromDb$1.L$0 = str;
                    messagesUseCase$deleteMessageFromDb$1.L$1 = null;
                    messagesUseCase$deleteMessageFromDb$1.L$2 = null;
                    messagesUseCase$deleteMessageFromDb$1.label = 3;
                    if (c44502sSe.AEQbTJ(channelId, messagesUseCase$deleteMessageFromDb$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    str = str2;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C44502sSe c44502sSe2 = (C44502sSe) messagesUseCase$deleteMessageFromDb$1.L$1;
            java.lang.String str4 = (java.lang.String) messagesUseCase$deleteMessageFromDb$1.L$0;
            try {
                C56391yDq.AEQbTJ(objDjBIcL);
                c44502sSe = c44502sSe2;
                str = str4;
            } catch (java.lang.Throwable th4) {
                th = th4;
                str2 = str4;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str = str2;
            }
            Result.Application application222 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            str = str2;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) objDjBIcL;
        if (inHouseIMMessageEntity != null) {
            channelId = inHouseIMMessageEntity.getChannelId();
            messagesUseCase$deleteMessageFromDb$1.L$0 = str;
            messagesUseCase$deleteMessageFromDb$1.L$1 = c44502sSe;
            messagesUseCase$deleteMessageFromDb$1.L$2 = channelId;
            messagesUseCase$deleteMessageFromDb$1.label = 2;
            if (c44502sSe.DbNXlk.OLrzqt(new InHouseIMMessageEntity[]{inHouseIMMessageEntity}, messagesUseCase$deleteMessageFromDb$1) == objCopydefault) {
                return objCopydefault;
            }
            pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(str, 8) + "] deleteMessageFromDb: deleted");
            messagesUseCase$deleteMessageFromDb$1.L$0 = str;
            messagesUseCase$deleteMessageFromDb$1.L$1 = null;
            messagesUseCase$deleteMessageFromDb$1.L$2 = null;
            messagesUseCase$deleteMessageFromDb$1.label = 3;
            if (c44502sSe.AEQbTJ(channelId, messagesUseCase$deleteMessageFromDb$1) == objCopydefault) {
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Exception {
        MessagesUseCase$refreshConversationLastMessage$1 messagesUseCase$refreshConversationLastMessage$1;
        C44502sSe c44502sSe;
        if (continuation instanceof MessagesUseCase$refreshConversationLastMessage$1) {
            messagesUseCase$refreshConversationLastMessage$1 = (MessagesUseCase$refreshConversationLastMessage$1) continuation;
            int i = messagesUseCase$refreshConversationLastMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$refreshConversationLastMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$refreshConversationLastMessage$1 = new MessagesUseCase$refreshConversationLastMessage$1(this, continuation);
            }
        }
        MessagesUseCase$refreshConversationLastMessage$1 messagesUseCase$refreshConversationLastMessage$12 = messagesUseCase$refreshConversationLastMessage$1;
        java.lang.Object objEZpvd = messagesUseCase$refreshConversationLastMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$refreshConversationLastMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C44486sRp c44486sRp = this.DbNXlk;
            messagesUseCase$refreshConversationLastMessage$12.L$0 = this;
            messagesUseCase$refreshConversationLastMessage$12.L$1 = str;
            messagesUseCase$refreshConversationLastMessage$12.label = 1;
            objEZpvd = c44486sRp.EZpvd(str, messagesUseCase$refreshConversationLastMessage$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) messagesUseCase$refreshConversationLastMessage$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$refreshConversationLastMessage$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) objEZpvd;
        if (inHouseIMMessageEntity == null) {
            return Unit.INSTANCE;
        }
        C44484sRn c44484sRn = c44502sSe.AEQbTJ;
        long sendTime = inHouseIMMessageEntity.getSendTime();
        java.lang.String messageId = inHouseIMMessageEntity.getMessageId();
        messagesUseCase$refreshConversationLastMessage$12.L$0 = null;
        messagesUseCase$refreshConversationLastMessage$12.L$1 = null;
        messagesUseCase$refreshConversationLastMessage$12.label = 2;
        if (c44484sRn.EZpvd(str, sendTime, messageId, messagesUseCase$refreshConversationLastMessage$12) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Flow<StateListAnimator.C0942StateListAnimator> OLrzqt(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return FlowKt.flowOn(FlowKt.flow(new MessagesUseCase$preSendFlow$1(this, oKMessage, null)), this.values);
    }

    public final Flow<StateListAnimator> OLrzqt(@NotNull StateListAnimator.C0942StateListAnimator c0942StateListAnimator, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(c0942StateListAnimator, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return FlowKt.flow(new MessagesUseCase$submitMessage$1(this, oKMessage, c0942StateListAnimator, null));
    }

    public final Flow<Dialog> OLrzqt(@NotNull WSSendReactionData wSSendReactionData) {
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        return FlowKt.flow(new MessagesUseCase$submitReactionMessage$1(this, wSSendReactionData, null));
    }

    public final Flow<StateListAnimator> KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return FlowKt__MergeKt.flatMapMerge$default(OLrzqt(oKMessage), 0, new MessagesUseCase$sendMessage$1(this, oKMessage, null), 1, null);
    }

    public final Flow<Dialog> KWHzl(@NotNull WSSendReactionData wSSendReactionData) {
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        return OLrzqt(wSSendReactionData);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        MessagesUseCase$readAllMessages$1 messagesUseCase$readAllMessages$1;
        C44502sSe c44502sSe;
        java.lang.String str2;
        java.lang.String str3;
        OKConversationType oKConversationType;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        long jLongValue;
        OKConversationType oKConversationType2;
        int iIntValue;
        boolean z;
        java.lang.String str4 = str;
        if (continuation instanceof MessagesUseCase$readAllMessages$1) {
            messagesUseCase$readAllMessages$1 = (MessagesUseCase$readAllMessages$1) continuation;
            int i = messagesUseCase$readAllMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$readAllMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$readAllMessages$1 = new MessagesUseCase$readAllMessages$1(this, continuation);
            }
        }
        MessagesUseCase$readAllMessages$1 messagesUseCase$readAllMessages$12 = messagesUseCase$readAllMessages$1;
        java.lang.Object objValueOf = messagesUseCase$readAllMessages$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$readAllMessages$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            java.lang.String strOLrzqt = this.ejfBZ.OLrzqt();
            C44484sRn c44484sRn = this.AEQbTJ;
            messagesUseCase$readAllMessages$12.L$0 = this;
            messagesUseCase$readAllMessages$12.L$1 = str4;
            messagesUseCase$readAllMessages$12.L$2 = strOLrzqt;
            messagesUseCase$readAllMessages$12.label = 1;
            java.lang.Object objEZpvd = c44484sRn.EZpvd(str4, messagesUseCase$readAllMessages$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
            str2 = strOLrzqt;
            objValueOf = objEZpvd;
        } else if (i2 == 1) {
            java.lang.String str5 = (java.lang.String) messagesUseCase$readAllMessages$12.L$2;
            java.lang.String str6 = (java.lang.String) messagesUseCase$readAllMessages$12.L$1;
            C44502sSe c44502sSe2 = (C44502sSe) messagesUseCase$readAllMessages$12.L$0;
            C56391yDq.AEQbTJ(objValueOf);
            c44502sSe = c44502sSe2;
            str2 = str5;
            str4 = str6;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objValueOf);
                    return Unit.INSTANCE;
                }
                long j = messagesUseCase$readAllMessages$12.J$0;
                OKConversationType oKConversationType3 = (OKConversationType) messagesUseCase$readAllMessages$12.L$4;
                inHouseIMConversationEntity = (InHouseIMConversationEntity) messagesUseCase$readAllMessages$12.L$3;
                java.lang.String str7 = (java.lang.String) messagesUseCase$readAllMessages$12.L$2;
                java.lang.String str8 = (java.lang.String) messagesUseCase$readAllMessages$12.L$1;
                C44502sSe c44502sSe3 = (C44502sSe) messagesUseCase$readAllMessages$12.L$0;
                C56391yDq.AEQbTJ(objValueOf);
                oKConversationType2 = oKConversationType3;
                str2 = str7;
                str3 = str8;
                c44502sSe = c44502sSe3;
                jLongValue = j;
                iIntValue = ((java.lang.Number) objValueOf).intValue();
                z = oKConversationType2 == OKConversationType.GROUP;
                C44124sEe.imLogSync$default("read all messages => maxSequence=" + jLongValue + ", isGroupChat=" + z + ", currentUserId=" + str2 + ", conversation=" + inHouseIMConversationEntity, null, str3, 2, null);
                if (c44502sSe.KWHzl(iIntValue, z)) {
                    return Unit.INSTANCE;
                }
                messagesUseCase$readAllMessages$12.L$0 = null;
                messagesUseCase$readAllMessages$12.L$1 = null;
                messagesUseCase$readAllMessages$12.L$2 = null;
                messagesUseCase$readAllMessages$12.L$3 = null;
                messagesUseCase$readAllMessages$12.L$4 = null;
                messagesUseCase$readAllMessages$12.label = 4;
                if (c44502sSe.AEQbTJ(str3, oKConversationType2, jLongValue, str2, messagesUseCase$readAllMessages$12) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            oKConversationType = (OKConversationType) messagesUseCase$readAllMessages$12.L$4;
            inHouseIMConversationEntity = (InHouseIMConversationEntity) messagesUseCase$readAllMessages$12.L$3;
            str2 = (java.lang.String) messagesUseCase$readAllMessages$12.L$2;
            str3 = (java.lang.String) messagesUseCase$readAllMessages$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$readAllMessages$12.L$0;
            C56391yDq.AEQbTJ(objValueOf);
            jLongValue = ((java.lang.Number) objValueOf).longValue();
            C44486sRp c44486sRp = c44502sSe.DbNXlk;
            messagesUseCase$readAllMessages$12.L$0 = c44502sSe;
            messagesUseCase$readAllMessages$12.L$1 = str3;
            messagesUseCase$readAllMessages$12.L$2 = str2;
            messagesUseCase$readAllMessages$12.L$3 = inHouseIMConversationEntity;
            messagesUseCase$readAllMessages$12.L$4 = oKConversationType;
            messagesUseCase$readAllMessages$12.J$0 = jLongValue;
            messagesUseCase$readAllMessages$12.label = 3;
            objValueOf = c44486sRp.valueOf(str3, messagesUseCase$readAllMessages$12);
            if (objValueOf != objCopydefault) {
                return objCopydefault;
            }
            oKConversationType2 = oKConversationType;
            iIntValue = ((java.lang.Number) objValueOf).intValue();
            if (oKConversationType2 == OKConversationType.GROUP) {
            }
            C44124sEe.imLogSync$default("read all messages => maxSequence=" + jLongValue + ", isGroupChat=" + z + ", currentUserId=" + str2 + ", conversation=" + inHouseIMConversationEntity, null, str3, 2, null);
            if (c44502sSe.KWHzl(iIntValue, z)) {
            }
        }
        InHouseIMConversationEntity inHouseIMConversationEntity2 = (InHouseIMConversationEntity) objValueOf;
        if (inHouseIMConversationEntity2 == null) {
            throw new java.lang.IllegalArgumentException(("read all messages => conversation[" + str4 + "](db) is null, ignore").toString());
        }
        OKConversationType conversationType = C44169sFw.OLrzqt(inHouseIMConversationEntity2).getConversationType();
        C44124sEe.imLogSync$default("read all messages => conversationType=" + conversationType, null, str4, 2, null);
        C44486sRp c44486sRp2 = c44502sSe.DbNXlk;
        messagesUseCase$readAllMessages$12.L$0 = c44502sSe;
        messagesUseCase$readAllMessages$12.L$1 = str4;
        messagesUseCase$readAllMessages$12.L$2 = str2;
        messagesUseCase$readAllMessages$12.L$3 = inHouseIMConversationEntity2;
        messagesUseCase$readAllMessages$12.L$4 = conversationType;
        messagesUseCase$readAllMessages$12.label = 2;
        java.lang.Object objAEQbTJ = c44486sRp2.AEQbTJ(str4, messagesUseCase$readAllMessages$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        str3 = str4;
        oKConversationType = conversationType;
        inHouseIMConversationEntity = inHouseIMConversationEntity2;
        objValueOf = objAEQbTJ;
        jLongValue = ((java.lang.Number) objValueOf).longValue();
        C44486sRp c44486sRp3 = c44502sSe.DbNXlk;
        messagesUseCase$readAllMessages$12.L$0 = c44502sSe;
        messagesUseCase$readAllMessages$12.L$1 = str3;
        messagesUseCase$readAllMessages$12.L$2 = str2;
        messagesUseCase$readAllMessages$12.L$3 = inHouseIMConversationEntity;
        messagesUseCase$readAllMessages$12.L$4 = oKConversationType;
        messagesUseCase$readAllMessages$12.J$0 = jLongValue;
        messagesUseCase$readAllMessages$12.label = 3;
        objValueOf = c44486sRp3.valueOf(str3, messagesUseCase$readAllMessages$12);
        if (objValueOf != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, OKConversationType oKConversationType, long j, java.lang.String str2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MessagesUseCase$sendReadReceiptIfPossible$1 messagesUseCase$sendReadReceiptIfPossible$1;
        OKConversationType oKConversationType2;
        C44502sSe c44502sSe;
        java.lang.String str3;
        long j2;
        java.lang.Object objKWHzl;
        WSSendAck wSSendAck;
        java.lang.String str4 = str;
        if (continuation instanceof MessagesUseCase$sendReadReceiptIfPossible$1) {
            messagesUseCase$sendReadReceiptIfPossible$1 = (MessagesUseCase$sendReadReceiptIfPossible$1) continuation;
            int i = messagesUseCase$sendReadReceiptIfPossible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$sendReadReceiptIfPossible$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$sendReadReceiptIfPossible$1 = new MessagesUseCase$sendReadReceiptIfPossible$1(this, continuation);
            }
        }
        java.lang.Object obj = messagesUseCase$sendReadReceiptIfPossible$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$sendReadReceiptIfPossible$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C44489sRs c44489sRs = this.fARcdN;
            messagesUseCase$sendReadReceiptIfPossible$1.L$0 = this;
            messagesUseCase$sendReadReceiptIfPossible$1.L$1 = str4;
            oKConversationType2 = oKConversationType;
            messagesUseCase$sendReadReceiptIfPossible$1.L$2 = oKConversationType2;
            messagesUseCase$sendReadReceiptIfPossible$1.L$3 = str2;
            messagesUseCase$sendReadReceiptIfPossible$1.J$0 = j;
            messagesUseCase$sendReadReceiptIfPossible$1.label = 1;
            if (c44489sRs.KWHzl(str, "read all messages", messagesUseCase$sendReadReceiptIfPossible$1) == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
            str3 = str2;
            j2 = j;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                j2 = messagesUseCase$sendReadReceiptIfPossible$1.J$0;
                java.lang.String str5 = (java.lang.String) messagesUseCase$sendReadReceiptIfPossible$1.L$2;
                java.lang.String str6 = (java.lang.String) messagesUseCase$sendReadReceiptIfPossible$1.L$1;
                c44502sSe = (C44502sSe) messagesUseCase$sendReadReceiptIfPossible$1.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str5;
                str4 = str6;
                objKWHzl = obj;
                wSSendAck = (WSSendAck) objKWHzl;
                C44124sEe.imLogSync$default("read all messages => sent read receipt command", null, str4, 2, null);
                if (wSSendAck != null) {
                    return Unit.INSTANCE;
                }
                C44486sRp c44486sRp = c44502sSe.DbNXlk;
                messagesUseCase$sendReadReceiptIfPossible$1.L$0 = null;
                messagesUseCase$sendReadReceiptIfPossible$1.L$1 = null;
                messagesUseCase$sendReadReceiptIfPossible$1.L$2 = null;
                messagesUseCase$sendReadReceiptIfPossible$1.label = 3;
                if (c44486sRp.EZpvd(str4, j2, str3, messagesUseCase$sendReadReceiptIfPossible$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            j2 = messagesUseCase$sendReadReceiptIfPossible$1.J$0;
            java.lang.String str7 = (java.lang.String) messagesUseCase$sendReadReceiptIfPossible$1.L$3;
            oKConversationType2 = (OKConversationType) messagesUseCase$sendReadReceiptIfPossible$1.L$2;
            java.lang.String str8 = (java.lang.String) messagesUseCase$sendReadReceiptIfPossible$1.L$1;
            C44502sSe c44502sSe2 = (C44502sSe) messagesUseCase$sendReadReceiptIfPossible$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str3 = str7;
            str4 = str8;
            c44502sSe = c44502sSe2;
        }
        C44489sRs c44489sRs2 = c44502sSe.fARcdN;
        messagesUseCase$sendReadReceiptIfPossible$1.L$0 = c44502sSe;
        messagesUseCase$sendReadReceiptIfPossible$1.L$1 = str4;
        messagesUseCase$sendReadReceiptIfPossible$1.L$2 = str3;
        messagesUseCase$sendReadReceiptIfPossible$1.L$3 = null;
        messagesUseCase$sendReadReceiptIfPossible$1.J$0 = j2;
        messagesUseCase$sendReadReceiptIfPossible$1.label = 2;
        objKWHzl = c44489sRs2.KWHzl(str4, oKConversationType2, j2, messagesUseCase$sendReadReceiptIfPossible$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        wSSendAck = (WSSendAck) objKWHzl;
        C44124sEe.imLogSync$default("read all messages => sent read receipt command", null, str4, 2, null);
        if (wSSendAck != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull OKConversationType oKConversationType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        MessagesUseCase$recallMessage$1 messagesUseCase$recallMessage$1;
        OKConversationType oKConversationType2;
        java.lang.Object objAEQbTJ;
        C44502sSe c44502sSe;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3;
        long j2;
        OKConversationType oKConversationType3;
        InHouseIMMessageEntity inHouseIMMessageEntity;
        C44502sSe c44502sSe2;
        java.lang.String str4;
        C44489sRs c44489sRs;
        java.lang.String str5;
        InHouseIMContentType inHouseIMContentType;
        OKConversationType oKConversationType4;
        java.lang.String str6;
        java.lang.String str7;
        C44489sRs c44489sRs2;
        java.lang.String str8 = str;
        long j3 = j;
        if (continuation instanceof MessagesUseCase$recallMessage$1) {
            messagesUseCase$recallMessage$1 = (MessagesUseCase$recallMessage$1) continuation;
            int i = messagesUseCase$recallMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$recallMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$recallMessage$1 = new MessagesUseCase$recallMessage$1(this, continuation);
            }
        }
        MessagesUseCase$recallMessage$1 messagesUseCase$recallMessage$12 = messagesUseCase$recallMessage$1;
        java.lang.Object obj2 = messagesUseCase$recallMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$recallMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            C44124sEe.imLogSync$default("recall message[" + j3 + "] => start", null, str8, 2, null);
            java.lang.String strOLrzqt = this.ejfBZ.OLrzqt();
            messagesUseCase$recallMessage$12.L$0 = this;
            messagesUseCase$recallMessage$12.L$1 = str8;
            oKConversationType2 = oKConversationType;
            messagesUseCase$recallMessage$12.L$2 = oKConversationType2;
            messagesUseCase$recallMessage$12.L$3 = strOLrzqt;
            messagesUseCase$recallMessage$12.J$0 = j3;
            messagesUseCase$recallMessage$12.label = 1;
            objAEQbTJ = AEQbTJ(str8, j3, messagesUseCase$recallMessage$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
            str2 = strOLrzqt;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    j2 = messagesUseCase$recallMessage$12.J$0;
                    inHouseIMContentType = (InHouseIMContentType) messagesUseCase$recallMessage$12.L$4;
                    str4 = (java.lang.String) messagesUseCase$recallMessage$12.L$3;
                    OKConversationType oKConversationType5 = (OKConversationType) messagesUseCase$recallMessage$12.L$2;
                    java.lang.String str9 = (java.lang.String) messagesUseCase$recallMessage$12.L$1;
                    c44502sSe2 = (C44502sSe) messagesUseCase$recallMessage$12.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    oKConversationType4 = oKConversationType5;
                    str6 = str9;
                    obj = null;
                    str7 = str4;
                    c44489sRs2 = c44502sSe2.fARcdN;
                    messagesUseCase$recallMessage$12.L$0 = obj;
                    messagesUseCase$recallMessage$12.L$1 = obj;
                    messagesUseCase$recallMessage$12.L$2 = obj;
                    messagesUseCase$recallMessage$12.L$3 = obj;
                    messagesUseCase$recallMessage$12.L$4 = obj;
                    messagesUseCase$recallMessage$12.label = 4;
                    if (c44489sRs2.OLrzqt(str6, str7, inHouseIMContentType, oKConversationType4, j2, messagesUseCase$recallMessage$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                j2 = messagesUseCase$recallMessage$12.J$0;
                InHouseIMMessageEntity inHouseIMMessageEntity2 = (InHouseIMMessageEntity) messagesUseCase$recallMessage$12.L$4;
                str4 = (java.lang.String) messagesUseCase$recallMessage$12.L$3;
                oKConversationType3 = (OKConversationType) messagesUseCase$recallMessage$12.L$2;
                str3 = (java.lang.String) messagesUseCase$recallMessage$12.L$1;
                c44502sSe2 = (C44502sSe) messagesUseCase$recallMessage$12.L$0;
                C56391yDq.AEQbTJ(obj2);
                inHouseIMMessageEntity = inHouseIMMessageEntity2;
                obj = null;
                InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) obj2;
                c44502sSe2.KWHzl(str3, j2, str4, inHouseIMMessageEntity, inHouseIMContentType2);
                c44489sRs = c44502sSe2.fARcdN;
                str5 = "recall message[" + j2 + "]";
                messagesUseCase$recallMessage$12.L$0 = c44502sSe2;
                messagesUseCase$recallMessage$12.L$1 = str3;
                messagesUseCase$recallMessage$12.L$2 = oKConversationType3;
                messagesUseCase$recallMessage$12.L$3 = str4;
                messagesUseCase$recallMessage$12.L$4 = inHouseIMContentType2;
                messagesUseCase$recallMessage$12.J$0 = j2;
                messagesUseCase$recallMessage$12.label = 3;
                if (c44489sRs.KWHzl(str3, str5, messagesUseCase$recallMessage$12) != objCopydefault) {
                    return objCopydefault;
                }
                inHouseIMContentType = inHouseIMContentType2;
                oKConversationType4 = oKConversationType3;
                str6 = str3;
                str7 = str4;
                c44489sRs2 = c44502sSe2.fARcdN;
                messagesUseCase$recallMessage$12.L$0 = obj;
                messagesUseCase$recallMessage$12.L$1 = obj;
                messagesUseCase$recallMessage$12.L$2 = obj;
                messagesUseCase$recallMessage$12.L$3 = obj;
                messagesUseCase$recallMessage$12.L$4 = obj;
                messagesUseCase$recallMessage$12.label = 4;
                if (c44489sRs2.OLrzqt(str6, str7, inHouseIMContentType, oKConversationType4, j2, messagesUseCase$recallMessage$12) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            long j4 = messagesUseCase$recallMessage$12.J$0;
            java.lang.String str10 = (java.lang.String) messagesUseCase$recallMessage$12.L$3;
            oKConversationType2 = (OKConversationType) messagesUseCase$recallMessage$12.L$2;
            java.lang.String str11 = (java.lang.String) messagesUseCase$recallMessage$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$recallMessage$12.L$0;
            C56391yDq.AEQbTJ(obj2);
            str2 = str10;
            j3 = j4;
            str8 = str11;
            objAEQbTJ = obj2;
        }
        OKConversationType oKConversationType6 = oKConversationType2;
        InHouseIMMessageEntity inHouseIMMessageEntity3 = (InHouseIMMessageEntity) objAEQbTJ;
        messagesUseCase$recallMessage$12.L$0 = c44502sSe;
        messagesUseCase$recallMessage$12.L$1 = str8;
        messagesUseCase$recallMessage$12.L$2 = oKConversationType6;
        messagesUseCase$recallMessage$12.L$3 = str2;
        messagesUseCase$recallMessage$12.L$4 = inHouseIMMessageEntity3;
        messagesUseCase$recallMessage$12.J$0 = j3;
        messagesUseCase$recallMessage$12.label = 2;
        C44502sSe c44502sSe3 = c44502sSe;
        java.lang.String str12 = str2;
        obj = null;
        java.lang.Object objOLrzqt = c44502sSe.OLrzqt(str2, str8, oKConversationType6, inHouseIMMessageEntity3, messagesUseCase$recallMessage$12);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        str3 = str8;
        j2 = j3;
        oKConversationType3 = oKConversationType6;
        obj2 = objOLrzqt;
        inHouseIMMessageEntity = inHouseIMMessageEntity3;
        c44502sSe2 = c44502sSe3;
        str4 = str12;
        InHouseIMContentType inHouseIMContentType22 = (InHouseIMContentType) obj2;
        c44502sSe2.KWHzl(str3, j2, str4, inHouseIMMessageEntity, inHouseIMContentType22);
        c44489sRs = c44502sSe2.fARcdN;
        str5 = "recall message[" + j2 + "]";
        messagesUseCase$recallMessage$12.L$0 = c44502sSe2;
        messagesUseCase$recallMessage$12.L$1 = str3;
        messagesUseCase$recallMessage$12.L$2 = oKConversationType3;
        messagesUseCase$recallMessage$12.L$3 = str4;
        messagesUseCase$recallMessage$12.L$4 = inHouseIMContentType22;
        messagesUseCase$recallMessage$12.J$0 = j2;
        messagesUseCase$recallMessage$12.label = 3;
        if (c44489sRs.KWHzl(str3, str5, messagesUseCase$recallMessage$12) != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, long j, Continuation<? super InHouseIMMessageEntity> continuation) throws java.lang.Exception {
        MessagesUseCase$getRecallingMessage$1 messagesUseCase$getRecallingMessage$1;
        if (continuation instanceof MessagesUseCase$getRecallingMessage$1) {
            messagesUseCase$getRecallingMessage$1 = (MessagesUseCase$getRecallingMessage$1) continuation;
            int i = messagesUseCase$getRecallingMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$getRecallingMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$getRecallingMessage$1 = new MessagesUseCase$getRecallingMessage$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messagesUseCase$getRecallingMessage$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messagesUseCase$getRecallingMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C44486sRp c44486sRp = this.DbNXlk;
            messagesUseCase$getRecallingMessage$1.L$0 = str;
            messagesUseCase$getRecallingMessage$1.J$0 = j;
            messagesUseCase$getRecallingMessage$1.label = 1;
            objCopydefault = c44486sRp.copydefault(str, j, messagesUseCase$getRecallingMessage$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = messagesUseCase$getRecallingMessage$1.J$0;
            str = (java.lang.String) messagesUseCase$getRecallingMessage$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InHouseIMMessageWithReactions inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) objCopydefault;
        InHouseIMMessageEntity imMessageEntity = inHouseIMMessageWithReactions != null ? inHouseIMMessageWithReactions.getImMessageEntity() : null;
        if (imMessageEntity != null) {
            return imMessageEntity;
        }
        throw new java.lang.IllegalArgumentException(("Message not found for recall: channelId=" + str + ", messageId=" + j).toString());
    }

    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, OKConversationType oKConversationType, InHouseIMMessageEntity inHouseIMMessageEntity, Continuation<? super InHouseIMContentType> continuation) {
        boolean zAEQbTJ = C44169sFw.AEQbTJ(str, str2, oKConversationType, this.OLrzqt.copydefault());
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) inHouseIMMessageEntity.getSenderUid(), (java.lang.Object) str);
        if (zAEQbTJ && !zEZpvd) {
            return InHouseIMContentType.RecallMessageByAdmin;
        }
        return InHouseIMContentType.RecallMessageBySender;
    }

    public final void KWHzl(java.lang.String str, long j, java.lang.String str2, InHouseIMMessageEntity inHouseIMMessageEntity, InHouseIMContentType inHouseIMContentType) {
        C44124sEe.imLogSync$default("recall message[" + j + "] => isMessageSendByMe=" + Intrinsics.EZpvd((java.lang.Object) inHouseIMMessageEntity.getSenderUid(), (java.lang.Object) str2) + ", contentType=" + inHouseIMContentType, null, str, 2, null);
    }

    /* JADX INFO: renamed from: o.sSe$TaskDescription */
    public static final class TaskDescription {
        public final java.util.List<InHouseIMMessageEntity> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sSe$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            return taskDescription.copydefault(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InHouseIMMessageEntity> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.util.List<InHouseIMMessageEntity> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidatePendingResult(invalidatedMessages=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.util.List<InHouseIMMessageEntity> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x014d -> B:33:0x014e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Exception {
        MessagesUseCase$invalidatePendingMessages$1 messagesUseCase$invalidatePendingMessages$1;
        C44502sSe c44502sSe;
        long j;
        java.util.List arrayList;
        java.util.Iterator it;
        C44502sSe c44502sSe2;
        java.util.Collection collection;
        if (continuation instanceof MessagesUseCase$invalidatePendingMessages$1) {
            messagesUseCase$invalidatePendingMessages$1 = (MessagesUseCase$invalidatePendingMessages$1) continuation;
            int i = messagesUseCase$invalidatePendingMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$invalidatePendingMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$invalidatePendingMessages$1 = new MessagesUseCase$invalidatePendingMessages$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messagesUseCase$invalidatePendingMessages$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messagesUseCase$invalidatePendingMessages$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - KWHzl();
            C44486sRp c44486sRp = this.DbNXlk;
            messagesUseCase$invalidatePendingMessages$1.L$0 = this;
            messagesUseCase$invalidatePendingMessages$1.J$0 = jCurrentTimeMillis;
            messagesUseCase$invalidatePendingMessages$1.label = 1;
            objCopydefault = c44486sRp.copydefault(messagesUseCase$invalidatePendingMessages$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c44502sSe = this;
            j = jCurrentTimeMillis;
        } else if (i2 == 1) {
            j = messagesUseCase$invalidatePendingMessages$1.J$0;
            c44502sSe = (C44502sSe) messagesUseCase$invalidatePendingMessages$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) messagesUseCase$invalidatePendingMessages$1.L$4;
            it = (java.util.Iterator) messagesUseCase$invalidatePendingMessages$1.L$3;
            java.util.Collection collection2 = (java.util.Collection) messagesUseCase$invalidatePendingMessages$1.L$2;
            arrayList = (java.util.List) messagesUseCase$invalidatePendingMessages$1.L$1;
            c44502sSe2 = (C44502sSe) messagesUseCase$invalidatePendingMessages$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            collection.add(Unit.INSTANCE);
            collection = collection2;
            if (it.hasNext()) {
                InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) it.next();
                C44486sRp c44486sRp2 = c44502sSe2.DbNXlk;
                InHouseIMMessageEntity inHouseIMMessageEntityCopy = inHouseIMMessageEntity.copy(((-2) & 1) != 0 ? inHouseIMMessageEntity.messageId : null, ((-2) & 2) != 0 ? inHouseIMMessageEntity.channelId : null, ((-2) & 4) != 0 ? inHouseIMMessageEntity.senderUid : null, ((-2) & 8) != 0 ? inHouseIMMessageEntity.seq : 0L, ((-2) & 16) != 0 ? inHouseIMMessageEntity.senderPlatformType : 0, ((-2) & 32) != 0 ? inHouseIMMessageEntity.contentType : 0, ((-2) & 64) != 0 ? inHouseIMMessageEntity.channelType : 0, ((-2) & 128) != 0 ? inHouseIMMessageEntity.isRead : null, ((-2) & 256) != 0 ? inHouseIMMessageEntity.isVisible : null, ((-2) & 512) != 0 ? inHouseIMMessageEntity.sendTime : 0L, ((-2) & 1024) != 0 ? inHouseIMMessageEntity.shouldIncludeInUnreadCount : null, ((-2) & 2048) != 0 ? inHouseIMMessageEntity.extra : null, ((-2) & 4096) != 0 ? inHouseIMMessageEntity.status : null, ((-2) & 8192) != 0 ? inHouseIMMessageEntity.sentStatus : 2, ((-2) & 16384) != 0 ? inHouseIMMessageEntity.receiveTime : null, ((-2) & 32768) != 0 ? inHouseIMMessageEntity.isRecalled : false, ((-2) & 65536) != 0 ? inHouseIMMessageEntity.isMentionMe : false, ((-2) & 131072) != 0 ? inHouseIMMessageEntity.isReceiveReadReceipt : null, ((-2) & 262144) != 0 ? inHouseIMMessageEntity.textContent : null, ((-2) & 524288) != 0 ? inHouseIMMessageEntity.atUserList : null, ((-2) & 1048576) != 0 ? inHouseIMMessageEntity.atType : null, ((-2) & 2097152) != 0 ? inHouseIMMessageEntity.urlList : null, ((-2) & 4194304) != 0 ? inHouseIMMessageEntity.siteMeta : null, ((-2) & 8388608) != 0 ? inHouseIMMessageEntity.messageTextWithoutTagContent : null, ((-2) & 16777216) != 0 ? inHouseIMMessageEntity.fileId : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.urlPathCn : null, ((-2) & 67108864) != 0 ? inHouseIMMessageEntity.urlPathDefault : null, ((-2) & 134217728) != 0 ? inHouseIMMessageEntity.mediaThumbnail : null, ((-2) & 268435456) != 0 ? inHouseIMMessageEntity.mediaWidth : null, ((-2) & 536870912) != 0 ? inHouseIMMessageEntity.mediaHeight : null, ((-2) & 1073741824) != 0 ? inHouseIMMessageEntity.mediaDuration : null, ((-2) & Integer.MIN_VALUE) != 0 ? inHouseIMMessageEntity.mediaSize : null, (536870911 & 1) != 0 ? inHouseIMMessageEntity.localUri : null, (536870911 & 2) != 0 ? inHouseIMMessageEntity.fileName : null, (536870911 & 4) != 0 ? inHouseIMMessageEntity.fileExtension : null, (536870911 & 8) != 0 ? inHouseIMMessageEntity.callType : null, (536870911 & 16) != 0 ? inHouseIMMessageEntity.callStatus : null, (536870911 & 32) != 0 ? inHouseIMMessageEntity.callDuration : null, (536870911 & 64) != 0 ? inHouseIMMessageEntity.callerUid : null, (536870911 & 128) != 0 ? inHouseIMMessageEntity.replySeq : null, (536870911 & 256) != 0 ? inHouseIMMessageEntity.quotedMessage : null, (536870911 & 512) != 0 ? inHouseIMMessageEntity.customMessage : null, (536870911 & 1024) != 0 ? inHouseIMMessageEntity.systemMessage : null, (536870911 & 2048) != 0 ? inHouseIMMessageEntity.shareMessage : null, (536870911 & 4096) != 0 ? inHouseIMMessageEntity.streamPlaceholderMessage : null, (536870911 & 8192) != 0 ? inHouseIMMessageEntity.stickerId : null, (536870911 & 16384) != 0 ? inHouseIMMessageEntity.stickerPath : null, (536870911 & 32768) != 0 ? inHouseIMMessageEntity.readReceiptSequence : null, (536870911 & 65536) != 0 ? inHouseIMMessageEntity.recallMessage : null, (536870911 & 131072) != 0 ? inHouseIMMessageEntity.invitationId : null, (536870911 & 262144) != 0 ? inHouseIMMessageEntity.groupInvitationGroupId : null, (536870911 & 524288) != 0 ? inHouseIMMessageEntity.groupInviterUid : null, (536870911 & 1048576) != 0 ? inHouseIMMessageEntity.groupInviteExpireTime : null, (536870911 & 2097152) != 0 ? inHouseIMMessageEntity.groupInviteName : null, (536870911 & 4194304) != 0 ? inHouseIMMessageEntity.groupInviteAvatar : null, (536870911 & 8388608) != 0 ? inHouseIMMessageEntity.senderNickname : null, (536870911 & 16777216) != 0 ? inHouseIMMessageEntity.senderAvatar : null, (536870911 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMMessageEntity.senderEnNickName : null, (536870911 & 67108864) != 0 ? inHouseIMMessageEntity.lookupSeq : null, (536870911 & 134217728) != 0 ? inHouseIMMessageEntity.frontendOption : null, (536870911 & 268435456) != 0 ? inHouseIMMessageEntity.reactionUpdateTime : 0L);
                messagesUseCase$invalidatePendingMessages$1.L$0 = c44502sSe2;
                messagesUseCase$invalidatePendingMessages$1.L$1 = arrayList;
                messagesUseCase$invalidatePendingMessages$1.L$2 = collection;
                messagesUseCase$invalidatePendingMessages$1.L$3 = it;
                messagesUseCase$invalidatePendingMessages$1.L$4 = collection;
                messagesUseCase$invalidatePendingMessages$1.label = 2;
                if (c44486sRp2.copydefault(inHouseIMMessageEntityCopy, messagesUseCase$invalidatePendingMessages$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                collection2 = collection;
                collection.add(Unit.INSTANCE);
                collection = collection2;
                if (it.hasNext()) {
                    return new TaskDescription(arrayList);
                }
            }
        }
        arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.lang.Iterable) objCopydefault) {
            if (((InHouseIMMessageEntity) obj).getSendTime() < j) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        it = arrayList.iterator();
        c44502sSe2 = c44502sSe;
        collection = arrayList2;
        if (it.hasNext()) {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        C44486sRp c44486sRp = this.DbNXlk;
        java.lang.String[] strArr = (java.lang.String[]) set.toArray(new java.lang.String[0]);
        java.lang.Object objOLrzqt = c44486sRp.OLrzqt((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, long j2, int i, boolean z, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) {
        pUU.KWHzl("MessagesUseCase", "getVisibleMessages: [" + str + "] fromSeq=" + j + ", toSeq=" + j2 + ", total=" + i + ", asc=" + z + " ");
        return this.DbNXlk.copydefault(str, j, j2, i, z, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a A[PHI: r1
  0x017a: PHI (r1v30 java.lang.Object) = (r1v29 java.lang.Object), (r1v1 java.lang.Object) binds: [B:50:0x0177, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d9 A[PHI: r1
  0x01d9: PHI (r1v34 java.lang.Object) = (r1v33 java.lang.Object), (r1v1 java.lang.Object) binds: [B:62:0x01d6, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull sNH snh, @NotNull Continuation<? super sNQ> continuation) throws java.lang.Exception {
        MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1 messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1;
        sNH snh2;
        C44502sSe c44502sSe;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        C44502sSe c44502sSe2;
        sNH snh3;
        java.lang.Long l;
        long jLongValue;
        java.lang.Long l2;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        long j;
        C44502sSe c44502sSe3;
        sNH snh4;
        java.lang.Object objOLrzqt;
        InHouseIMConversationEntity inHouseIMConversationEntity4;
        sNH snh5;
        C44502sSe c44502sSe4;
        sNH snh6;
        C44502sSe c44502sSe5;
        InHouseIMConversationEntity inHouseIMConversationEntity5;
        if (continuation instanceof MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1) {
            messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1 = (MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1) continuation;
            int i = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1 = new MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd);
                C44484sRn c44484sRn = this.AEQbTJ;
                java.lang.String strCopydefault = snh.copydefault();
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = this;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = snh;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 1;
                objEZpvd = c44484sRn.EZpvd(strCopydefault, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                snh2 = snh;
                c44502sSe = this;
                inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
                if (inHouseIMConversationEntity != null) {
                    throw new java.lang.IllegalArgumentException(("loadMessagesWithOfflineDownloadMissingMessagesV2 => conversation is null for channelId: " + snh2.copydefault()).toString());
                }
                java.lang.Long lastReadMsgSeq = inHouseIMConversationEntity.getLastReadMsgSeq();
                if (inHouseIMConversationEntity.getStartMsgSeq() == null) {
                    throw new java.lang.IllegalArgumentException(("loadMessagesWithOfflineDownloadMissingMessagesV2 => startMessageSequence is null for channelId: " + snh2.copydefault()).toString());
                }
                C44486sRp c44486sRp = c44502sSe.DbNXlk;
                java.lang.String strCopydefault2 = snh2.copydefault();
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = c44502sSe;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = snh2;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = inHouseIMConversationEntity;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3 = lastReadMsgSeq;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 2;
                java.lang.Object objAEQbTJ = c44486sRp.AEQbTJ(strCopydefault2, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                C44502sSe c44502sSe6 = c44502sSe;
                inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                objEZpvd = objAEQbTJ;
                c44502sSe2 = c44502sSe6;
                snh3 = snh2;
                l = lastReadMsgSeq;
                jLongValue = ((java.lang.Number) objEZpvd).longValue();
                if (jLongValue > 0) {
                    c44502sSe2.fARcdN.OLrzqt();
                    C44489sRs c44489sRs = c44502sSe2.fARcdN;
                    java.lang.String strCopydefault3 = snh3.copydefault();
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = c44502sSe2;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = snh3;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = inHouseIMConversationEntity2;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3 = l;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 3;
                    objEZpvd = c44489sRs.EZpvd(strCopydefault3, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    java.lang.Long l3 = (java.lang.Long) objEZpvd;
                    long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                    inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                    c44502sSe3 = c44502sSe2;
                    j = jLongValue2;
                    snh4 = snh3;
                    l2 = l;
                    if (snh4.KWHzl() == null && snh4.AEQbTJ() == GetMessageDirection.BOTH) {
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = c44502sSe3;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = snh4;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = inHouseIMConversationEntity3;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3 = null;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 4;
                        java.lang.Object objAEQbTJ2 = c44502sSe3.AEQbTJ(snh4, l2, j, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                        if (objAEQbTJ2 == objCopydefault) {
                            return objCopydefault;
                        }
                        snh6 = snh4;
                        c44502sSe5 = c44502sSe3;
                        inHouseIMConversationEntity5 = inHouseIMConversationEntity3;
                        objEZpvd = objAEQbTJ2;
                        kotlin.Pair pair = (kotlin.Pair) objEZpvd;
                        java.util.List<InHouseIMMessageWithReactions> list = (java.util.List) pair.component1();
                        java.lang.Long lKWHzl = C56443yFo.KWHzl(((java.lang.Number) pair.component2()).longValue());
                        java.lang.String strGEmmrt = C33129mqd.gEmmrt(inHouseIMConversationEntity5.getStartMsgSeq());
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = null;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = null;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = null;
                        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 5;
                        objEZpvd = c44502sSe5.AEQbTJ(snh6, list, lKWHzl, strGEmmrt, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                        return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
                    }
                    sNO sno = new sNO(snh4.copydefault(), snh4.KWHzl(), snh4.djBIcL(), snh4.EZpvd(), snh4.AEQbTJ() == GetMessageDirection.TOP, 0, true, 32, null);
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = inHouseIMConversationEntity3;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = c44502sSe3;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = snh4;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3 = null;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 6;
                    objOLrzqt = c44502sSe3.OLrzqt(sno, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMConversationEntity4 = inHouseIMConversationEntity3;
                    objEZpvd = objOLrzqt;
                    snh5 = snh4;
                    c44502sSe4 = c44502sSe3;
                    java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(inHouseIMConversationEntity4.getStartMsgSeq());
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = null;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = null;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = null;
                    messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 7;
                    objEZpvd = c44502sSe4.AEQbTJ(snh5, (java.util.List<InHouseIMMessageWithReactions>) objEZpvd, (java.lang.Long) null, strGEmmrt2, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                    return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
                }
                l2 = l;
                inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                j = jLongValue;
                c44502sSe3 = c44502sSe2;
                snh4 = snh3;
                if (snh4.KWHzl() == null) {
                }
                sNO sno2 = new sNO(snh4.copydefault(), snh4.KWHzl(), snh4.djBIcL(), snh4.EZpvd(), snh4.AEQbTJ() == GetMessageDirection.TOP, 0, true, 32, null);
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = inHouseIMConversationEntity3;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = c44502sSe3;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = snh4;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 6;
                objOLrzqt = c44502sSe3.OLrzqt(sno2, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                if (objOLrzqt == objCopydefault) {
                }
                break;
            case 1:
                snh2 = (sNH) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1;
                c44502sSe = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
                if (inHouseIMConversationEntity != null) {
                }
                break;
            case 2:
                l = (java.lang.Long) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3;
                inHouseIMConversationEntity2 = (InHouseIMConversationEntity) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2;
                snh3 = (sNH) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1;
                c44502sSe2 = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                jLongValue = ((java.lang.Number) objEZpvd).longValue();
                if (jLongValue > 0) {
                }
                break;
            case 3:
                l = (java.lang.Long) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3;
                inHouseIMConversationEntity2 = (InHouseIMConversationEntity) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2;
                snh3 = (sNH) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1;
                c44502sSe2 = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.lang.Long l32 = (java.lang.Long) objEZpvd;
                if (l32 != null) {
                }
                inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                c44502sSe3 = c44502sSe2;
                j = jLongValue2;
                snh4 = snh3;
                l2 = l;
                if (snh4.KWHzl() == null) {
                }
                sNO sno22 = new sNO(snh4.copydefault(), snh4.KWHzl(), snh4.djBIcL(), snh4.EZpvd(), snh4.AEQbTJ() == GetMessageDirection.TOP, 0, true, 32, null);
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = inHouseIMConversationEntity3;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = c44502sSe3;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = snh4;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$3 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 6;
                objOLrzqt = c44502sSe3.OLrzqt(sno22, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                if (objOLrzqt == objCopydefault) {
                }
                break;
            case 4:
                inHouseIMConversationEntity5 = (InHouseIMConversationEntity) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2;
                snh6 = (sNH) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1;
                c44502sSe5 = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                kotlin.Pair pair2 = (kotlin.Pair) objEZpvd;
                java.util.List<InHouseIMMessageWithReactions> list2 = (java.util.List) pair2.component1();
                java.lang.Long lKWHzl2 = C56443yFo.KWHzl(((java.lang.Number) pair2.component2()).longValue());
                java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(inHouseIMConversationEntity5.getStartMsgSeq());
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 5;
                objEZpvd = c44502sSe5.AEQbTJ(snh6, list2, lKWHzl2, strGEmmrt3, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 5:
                C56391yDq.AEQbTJ(objEZpvd);
            case 6:
                sNH snh7 = (sNH) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2;
                C44502sSe c44502sSe7 = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1;
                inHouseIMConversationEntity4 = (InHouseIMConversationEntity) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                snh5 = snh7;
                c44502sSe4 = c44502sSe7;
                java.lang.String strGEmmrt22 = C33129mqd.gEmmrt(inHouseIMConversationEntity4.getStartMsgSeq());
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$0 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$1 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.L$2 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1.label = 7;
                objEZpvd = c44502sSe4.AEQbTJ(snh5, (java.util.List<InHouseIMMessageWithReactions>) objEZpvd, (java.lang.Long) null, strGEmmrt22, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessages$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 7:
                C56391yDq.AEQbTJ(objEZpvd);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull sNH snh, java.lang.Long l, long j, @NotNull Continuation<? super kotlin.Pair<? extends java.util.List<InHouseIMMessageWithReactions>, java.lang.Long>> continuation) {
        return CoroutineScopeKt.coroutineScope(new MessagesUseCase$loadOfflineMessagesInBothDirections$2(this, snh, l, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) throws java.lang.Exception {
        MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1 messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1;
        C44502sSe c44502sSe;
        long jCopydefault;
        long jLongValue;
        long jMax;
        sNO sno2 = sno;
        if (continuation instanceof MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1) {
            messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1 = (MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1) continuation;
            int i = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1 = new MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1(this, continuation);
            }
        }
        MessagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1 messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12 = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$1;
        java.lang.Object objEZpvd = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MessagesUseCase", "loadMessagesWithOfflineDownloadMissingMessages request: " + sno2);
            java.lang.String strCopydefault = sno.copydefault();
            messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$0 = this;
            messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$1 = sno2;
            messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.label = 1;
            objEZpvd = EZpvd(strCopydefault, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objEZpvd);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCopydefault = messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.J$0;
                sno2 = (sNO) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$1;
                c44502sSe = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                long j = jCopydefault;
                long jLongValue2 = ((java.lang.Number) objEZpvd).longValue();
                java.lang.Long lDjBIcL = sno2.djBIcL();
                jLongValue = lDjBIcL == null ? lDjBIcL.longValue() : jLongValue2;
                jMax = java.lang.Math.max(j, 1L);
                java.lang.Boolean boolKWHzl = sno2.KWHzl();
                boolean zBooleanValue = boolKWHzl == null ? boolKWHzl.booleanValue() : true;
                if (jLongValue >= jMax) {
                    return yDY.AhwBna();
                }
                if (sno2.djBIcL() != null && sno2.djBIcL().longValue() > jLongValue2) {
                    return yDY.AhwBna();
                }
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$0 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$1 = null;
                messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.label = 3;
                objEZpvd = c44502sSe.EZpvd(sno2, jLongValue, jMax, zBooleanValue, j, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12);
                return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
            }
            sno2 = (sNO) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        jCopydefault = c44502sSe.copydefault((InHouseIMConversationEntity) objEZpvd);
        java.lang.String strCopydefault2 = sno2.copydefault();
        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$0 = c44502sSe;
        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.L$1 = sno2;
        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.J$0 = jCopydefault;
        messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12.label = 2;
        objEZpvd = c44502sSe.copydefault(strCopydefault2, messagesUseCase$loadMessagesWithOfflineDownloadMissingMessagesOld$12);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        long j2 = jCopydefault;
        long jLongValue22 = ((java.lang.Number) objEZpvd).longValue();
        java.lang.Long lDjBIcL2 = sno2.djBIcL();
        if (lDjBIcL2 == null) {
        }
        jMax = java.lang.Math.max(j2, 1L);
        java.lang.Boolean boolKWHzl2 = sno2.KWHzl();
        if (boolKWHzl2 == null) {
        }
        if (jLongValue >= jMax) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027c A[LOOP:0: B:95:0x0276->B:97:0x027c, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull sNO sno, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) throws java.lang.Exception {
        MessagesUseCase$loadOfflineMessagesInSingleDirection$1 messagesUseCase$loadOfflineMessagesInSingleDirection$1;
        C44502sSe c44502sSe;
        C44502sSe c44502sSe2;
        long j;
        long jLongValue;
        long jLongValue2;
        sNO sno2;
        java.lang.Long l;
        C44502sSe c44502sSe3;
        long j2;
        long j3;
        ?? r1;
        java.lang.Long lKWHzl;
        long seq;
        java.util.Iterator it;
        java.lang.Object next;
        InHouseIMMessageWithReactions inHouseIMMessageWithReactions;
        java.util.Iterator it2;
        InHouseIMMessageEntity imMessageEntity;
        InHouseIMMessageEntity imMessageEntity2;
        java.lang.Object next2;
        InHouseIMMessageEntity imMessageEntity3;
        sNO sno3 = sno;
        if (continuation instanceof MessagesUseCase$loadOfflineMessagesInSingleDirection$1) {
            messagesUseCase$loadOfflineMessagesInSingleDirection$1 = (MessagesUseCase$loadOfflineMessagesInSingleDirection$1) continuation;
            int i = messagesUseCase$loadOfflineMessagesInSingleDirection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$loadOfflineMessagesInSingleDirection$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$loadOfflineMessagesInSingleDirection$1 = new MessagesUseCase$loadOfflineMessagesInSingleDirection$1(this, continuation);
            }
        }
        MessagesUseCase$loadOfflineMessagesInSingleDirection$1 messagesUseCase$loadOfflineMessagesInSingleDirection$12 = messagesUseCase$loadOfflineMessagesInSingleDirection$1;
        java.lang.Object objEZpvd = messagesUseCase$loadOfflineMessagesInSingleDirection$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$loadOfflineMessagesInSingleDirection$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MessagesUseCase", "loadOfflineMessagesInSingleDirection request: " + sno3);
            java.lang.String strCopydefault = sno.copydefault();
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$0 = this;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$1 = sno3;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.label = 1;
            objEZpvd = EZpvd(strCopydefault, messagesUseCase$loadOfflineMessagesInSingleDirection$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else if (i2 == 1) {
            sno3 = (sNO) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = messagesUseCase$loadOfflineMessagesInSingleDirection$12.I$0;
                j3 = messagesUseCase$loadOfflineMessagesInSingleDirection$12.J$1;
                long j4 = messagesUseCase$loadOfflineMessagesInSingleDirection$12.J$0;
                l = (java.lang.Long) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$2;
                sno2 = (sNO) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$1;
                c44502sSe3 = (C44502sSe) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                j2 = j4;
                r1 = i3;
                java.util.List list = (java.util.List) objEZpvd;
                lKWHzl = null;
                if (sno2.AEQbTJ()) {
                    seq = j3;
                } else {
                    java.util.Iterator it3 = list.iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            long seq2 = ((InHouseIMMessageWithReactions) next2).getImMessageEntity().getSeq();
                            do {
                                java.lang.Object next3 = it3.next();
                                long seq3 = ((InHouseIMMessageWithReactions) next3).getImMessageEntity().getSeq();
                                if (seq2 < seq3) {
                                    next2 = next3;
                                    seq2 = seq3;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    InHouseIMMessageWithReactions inHouseIMMessageWithReactions2 = (InHouseIMMessageWithReactions) next2;
                    if (inHouseIMMessageWithReactions2 != null && (imMessageEntity3 = inHouseIMMessageWithReactions2.getImMessageEntity()) != null) {
                        seq = imMessageEntity3.getSeq();
                    }
                }
                it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long seq4 = ((InHouseIMMessageWithReactions) next).getImMessageEntity().getSeq();
                        do {
                            java.lang.Object next4 = it.next();
                            long seq5 = ((InHouseIMMessageWithReactions) next4).getImMessageEntity().getSeq();
                            if (seq4 > seq5) {
                                next = next4;
                                seq4 = seq5;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) next;
                if (inHouseIMMessageWithReactions != null && (imMessageEntity2 = inHouseIMMessageWithReactions.getImMessageEntity()) != null) {
                    lKWHzl = C56443yFo.KWHzl(imMessageEntity2.getSeq());
                }
                long j5 = j3;
                long seq6 = 0;
                long jMax = java.lang.Math.max(j3 - sno2.AhwBna(), 0L);
                long jMin = java.lang.Math.min(lKWHzl != null ? lKWHzl.longValue() : jMax, jMax);
                java.lang.String strCopydefault2 = sno2.copydefault();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C56443yFo.KWHzl(((InHouseIMMessageWithReactions) it2.next()).getImMessageEntity().getSeq()));
                }
                pUU.KWHzl("MessagesUseCase", "loadOfflineMessagesInSingleDirection: [" + strCopydefault2 + "] visibleMessages=" + arrayList + ", downloadFromSeq=" + seq + ", downloadToSeq=" + jMin);
                c44502sSe3.gEmmrt.OLrzqt(sno2.copydefault(), seq, C56443yFo.KWHzl(jMin), sno2.AhwBna(), r1 != 0, j2);
                if (l == null) {
                    return list;
                }
                InHouseIMMessageWithReactions inHouseIMMessageWithReactions3 = (InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (inHouseIMMessageWithReactions3 != null && (imMessageEntity = inHouseIMMessageWithReactions3.getImMessageEntity()) != null) {
                    seq6 = imMessageEntity.getSeq();
                }
                return j5 < seq6 ? yDY.AhwBna() : list;
            }
            long j6 = messagesUseCase$loadOfflineMessagesInSingleDirection$12.J$0;
            sno3 = (sNO) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$1;
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            c44502sSe2 = c44502sSe4;
            j = j6;
            long jLongValue3 = ((java.lang.Number) objEZpvd).longValue();
            java.lang.Long lDjBIcL = sno3.djBIcL();
            jLongValue = (sno3.AEQbTJ() || lDjBIcL == null) ? jLongValue3 : lDjBIcL.longValue();
            C44502sSe c44502sSe5 = c44502sSe2;
            jLongValue2 = (sno3.AEQbTJ() && lDjBIcL != null) ? lDjBIcL.longValue() : java.lang.Math.max(j, 1L);
            boolean zAEQbTJ = sno3.AEQbTJ();
            long jAhwBna = sno3.AhwBna();
            java.lang.Boolean boolKWHzl = sno3.KWHzl();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("loadOfflineMessagesInSingleDirection fromSeq is ");
            sb.append(jLongValue);
            sb.append(", toSequence is ");
            sb.append(jLongValue2);
            sb.append(", requestMessageId is ");
            sb.append(lDjBIcL);
            sb.append(", maxSeq is ");
            long j7 = j;
            sb.append(jLongValue3);
            sb.append(", loadMoreOnTop is ");
            sb.append(zAEQbTJ);
            sb.append(", total is ");
            sb.append(jAhwBna);
            sb.append(", asc is ");
            sb.append(boolKWHzl);
            pUU.KWHzl("MessagesUseCase", sb.toString());
            java.lang.Boolean boolKWHzl2 = sno3.KWHzl();
            ?? BooleanValue = boolKWHzl2 == null ? boolKWHzl2.booleanValue() : 1;
            if (jLongValue >= jLongValue2) {
                return yDY.AhwBna();
            }
            if (lDjBIcL != null && lDjBIcL.longValue() > jLongValue3) {
                return yDY.AhwBna();
            }
            java.lang.String strCopydefault3 = sno3.copydefault();
            int iAhwBna = (int) sno3.AhwBna();
            boolean zAEQbTJ2 = sno3.AEQbTJ();
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$0 = c44502sSe5;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$1 = sno3;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$2 = lDjBIcL;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.J$0 = j7;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.J$1 = jLongValue;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.I$0 = BooleanValue;
            messagesUseCase$loadOfflineMessagesInSingleDirection$12.label = 3;
            long j8 = jLongValue;
            java.lang.Object objOLrzqt = c44502sSe5.OLrzqt(strCopydefault3, jLongValue, jLongValue2, iAhwBna, zAEQbTJ2, messagesUseCase$loadOfflineMessagesInSingleDirection$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            sno2 = sno3;
            l = lDjBIcL;
            c44502sSe3 = c44502sSe5;
            objEZpvd = objOLrzqt;
            j2 = j7;
            j3 = j8;
            r1 = BooleanValue;
            java.util.List list2 = (java.util.List) objEZpvd;
            lKWHzl = null;
            if (sno2.AEQbTJ()) {
            }
            it = list2.iterator();
            if (it.hasNext()) {
            }
            inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) next;
            if (inHouseIMMessageWithReactions != null) {
                lKWHzl = C56443yFo.KWHzl(imMessageEntity2.getSeq());
            }
            long j52 = j3;
            long seq62 = 0;
            long jMax2 = java.lang.Math.max(j3 - sno2.AhwBna(), 0L);
            long jMin2 = java.lang.Math.min(lKWHzl != null ? lKWHzl.longValue() : jMax2, jMax2);
            java.lang.String strCopydefault22 = sno2.copydefault();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            it2 = list2.iterator();
            while (it2.hasNext()) {
            }
            pUU.KWHzl("MessagesUseCase", "loadOfflineMessagesInSingleDirection: [" + strCopydefault22 + "] visibleMessages=" + arrayList2 + ", downloadFromSeq=" + seq + ", downloadToSeq=" + jMin2);
            c44502sSe3.gEmmrt.OLrzqt(sno2.copydefault(), seq, C56443yFo.KWHzl(jMin2), sno2.AhwBna(), r1 != 0, j2);
            if (l == null) {
            }
        }
        long jCopydefault = c44502sSe.copydefault((InHouseIMConversationEntity) objEZpvd);
        java.lang.String strCopydefault4 = sno3.copydefault();
        messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$0 = c44502sSe;
        messagesUseCase$loadOfflineMessagesInSingleDirection$12.L$1 = sno3;
        messagesUseCase$loadOfflineMessagesInSingleDirection$12.J$0 = jCopydefault;
        messagesUseCase$loadOfflineMessagesInSingleDirection$12.label = 2;
        objEZpvd = c44502sSe.copydefault(strCopydefault4, messagesUseCase$loadOfflineMessagesInSingleDirection$12);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c44502sSe2 = c44502sSe;
        j = jCopydefault;
        long jLongValue32 = ((java.lang.Number) objEZpvd).longValue();
        java.lang.Long lDjBIcL2 = sno3.djBIcL();
        if (sno3.AEQbTJ()) {
            C44502sSe c44502sSe52 = c44502sSe2;
            if (sno3.AEQbTJ()) {
                jLongValue2 = java.lang.Math.max(j, 1L);
            }
            boolean zAEQbTJ3 = sno3.AEQbTJ();
            long jAhwBna2 = sno3.AhwBna();
            java.lang.Boolean boolKWHzl3 = sno3.KWHzl();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("loadOfflineMessagesInSingleDirection fromSeq is ");
            sb2.append(jLongValue);
            sb2.append(", toSequence is ");
            sb2.append(jLongValue2);
            sb2.append(", requestMessageId is ");
            sb2.append(lDjBIcL2);
            sb2.append(", maxSeq is ");
            long j72 = j;
            sb2.append(jLongValue32);
            sb2.append(", loadMoreOnTop is ");
            sb2.append(zAEQbTJ3);
            sb2.append(", total is ");
            sb2.append(jAhwBna2);
            sb2.append(", asc is ");
            sb2.append(boolKWHzl3);
            pUU.KWHzl("MessagesUseCase", sb2.toString());
            java.lang.Boolean boolKWHzl22 = sno3.KWHzl();
            if (boolKWHzl22 == null) {
            }
            if (jLongValue >= jLongValue2) {
            }
        }
        java.util.List list22 = (java.util.List) objEZpvd;
        lKWHzl = null;
        if (sno2.AEQbTJ()) {
        }
        it = list22.iterator();
        if (it.hasNext()) {
        }
        inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) next;
        if (inHouseIMMessageWithReactions != null) {
        }
        long j522 = j3;
        long seq622 = 0;
        long jMax22 = java.lang.Math.max(j3 - sno2.AhwBna(), 0L);
        long jMin22 = java.lang.Math.min(lKWHzl != null ? lKWHzl.longValue() : jMax22, jMax22);
        java.lang.String strCopydefault222 = sno2.copydefault();
        java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list22, 10));
        it2 = list22.iterator();
        while (it2.hasNext()) {
        }
        pUU.KWHzl("MessagesUseCase", "loadOfflineMessagesInSingleDirection: [" + strCopydefault222 + "] visibleMessages=" + arrayList22 + ", downloadFromSeq=" + seq + ", downloadToSeq=" + jMin22);
        c44502sSe3.gEmmrt.OLrzqt(sno2.copydefault(), seq, C56443yFo.KWHzl(jMin22), sno2.AhwBna(), r1 != 0, j2);
        if (l == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Exception {
        MessagesUseCase$determineMaxSequenceWithWebSocketCheck$1 messagesUseCase$determineMaxSequenceWithWebSocketCheck$1;
        C44502sSe c44502sSe;
        java.lang.Long l;
        if (continuation instanceof MessagesUseCase$determineMaxSequenceWithWebSocketCheck$1) {
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1 = (MessagesUseCase$determineMaxSequenceWithWebSocketCheck$1) continuation;
            int i = messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$determineMaxSequenceWithWebSocketCheck$1 = new MessagesUseCase$determineMaxSequenceWithWebSocketCheck$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.label;
        long jLongValue = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C44486sRp c44486sRp = this.DbNXlk;
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.L$0 = this;
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.L$1 = str;
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.label = 1;
            objAEQbTJ = c44486sRp.AEQbTJ(str, messagesUseCase$determineMaxSequenceWithWebSocketCheck$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                l = (java.lang.Long) objAEQbTJ;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                return C56443yFo.KWHzl(jLongValue);
            }
            str = (java.lang.String) messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        long jLongValue2 = ((java.lang.Number) objAEQbTJ).longValue();
        if (jLongValue2 <= 0) {
            c44502sSe.fARcdN.OLrzqt();
            C44489sRs c44489sRs = c44502sSe.fARcdN;
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.L$0 = null;
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.L$1 = null;
            messagesUseCase$determineMaxSequenceWithWebSocketCheck$1.label = 2;
            objAEQbTJ = c44489sRs.EZpvd(str, messagesUseCase$determineMaxSequenceWithWebSocketCheck$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            l = (java.lang.Long) objAEQbTJ;
            if (l != null) {
            }
            return C56443yFo.KWHzl(jLongValue);
        }
        jLongValue = jLongValue2;
        return C56443yFo.KWHzl(jLongValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(sNO sno, long j, long j2, boolean z, long j3, Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) throws java.lang.Throwable {
        MessagesUseCase$processOfflineDownloadRequest$1 messagesUseCase$processOfflineDownloadRequest$1;
        long j4;
        boolean z2;
        long j5;
        C44502sSe c44502sSe;
        sNO sno2;
        if (continuation instanceof MessagesUseCase$processOfflineDownloadRequest$1) {
            messagesUseCase$processOfflineDownloadRequest$1 = (MessagesUseCase$processOfflineDownloadRequest$1) continuation;
            int i = messagesUseCase$processOfflineDownloadRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$processOfflineDownloadRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$processOfflineDownloadRequest$1 = new MessagesUseCase$processOfflineDownloadRequest$1(this, continuation);
            }
        }
        MessagesUseCase$processOfflineDownloadRequest$1 messagesUseCase$processOfflineDownloadRequest$12 = messagesUseCase$processOfflineDownloadRequest$1;
        java.lang.Object objOLrzqt = messagesUseCase$processOfflineDownloadRequest$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$processOfflineDownloadRequest$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String strCopydefault = sno.copydefault();
            int iAhwBna = (int) sno.AhwBna();
            messagesUseCase$processOfflineDownloadRequest$12.L$0 = this;
            messagesUseCase$processOfflineDownloadRequest$12.L$1 = sno;
            j4 = j;
            messagesUseCase$processOfflineDownloadRequest$12.J$0 = j4;
            z2 = z;
            messagesUseCase$processOfflineDownloadRequest$12.Z$0 = z2;
            messagesUseCase$processOfflineDownloadRequest$12.J$1 = j3;
            messagesUseCase$processOfflineDownloadRequest$12.label = 1;
            objOLrzqt = OLrzqt(strCopydefault, j, j2, iAhwBna, z, messagesUseCase$processOfflineDownloadRequest$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            j5 = j3;
            c44502sSe = this;
            sno2 = sno;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = messagesUseCase$processOfflineDownloadRequest$12.J$1;
            boolean z3 = messagesUseCase$processOfflineDownloadRequest$12.Z$0;
            long j6 = messagesUseCase$processOfflineDownloadRequest$12.J$0;
            sno2 = (sNO) messagesUseCase$processOfflineDownloadRequest$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$processOfflineDownloadRequest$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            z2 = z3;
            j4 = j6;
        }
        java.util.List<InHouseIMMessageWithReactions> list = (java.util.List) objOLrzqt;
        c44502sSe.AEQbTJ(sno2, list);
        c44502sSe.copydefault(sno2, j4, z2, j5);
        return c44502sSe.AEQbTJ(sno2.djBIcL(), j4, list) ? yDY.AhwBna() : list;
    }

    public final void AEQbTJ(sNO sno, java.util.List<InHouseIMMessageWithReactions> list) {
        java.lang.String strCopydefault = sno.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((InHouseIMMessageWithReactions) it.next()).getImMessageEntity().getSeq()));
        }
        pUU.KWHzl("MessagesUseCase", "loadMessagesWithOfflineDownloadMissingMessages: [" + strCopydefault + "] visibleMessages=" + arrayList);
    }

    public final void copydefault(sNO sno, long j, boolean z, long j2) {
        this.gEmmrt.OLrzqt(sno.copydefault(), j, null, sno.AhwBna(), z, j2);
    }

    public final boolean AEQbTJ(java.lang.Long l, long j, java.util.List<InHouseIMMessageWithReactions> list) {
        InHouseIMMessageEntity imMessageEntity;
        if (l != null) {
            InHouseIMMessageWithReactions inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (j < ((inHouseIMMessageWithReactions == null || (imMessageEntity = inHouseIMMessageWithReactions.getImMessageEntity()) == null) ? 0L : imMessageEntity.getSeq())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o.sSe$Application */
    public static final class Application {
        public final java.util.List<WSSendMessageDetailData> AEQbTJ;
        public final java.util.List<java.lang.Long> EZpvd;
        public final java.util.List<WSSendMessageDetailData> OLrzqt;
        public final java.util.List<InHouseIMMessageEntity> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sSe$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.copydefault;
            }
            if ((i & 2) != 0) {
                list2 = application.AEQbTJ;
            }
            if ((i & 4) != 0) {
                list3 = application.OLrzqt;
            }
            if ((i & 8) != 0) {
                list4 = application.EZpvd;
            }
            return application.AEQbTJ(list, list2, list3, list4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InHouseIMMessageEntity> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.util.List<InHouseIMMessageEntity> list, java.util.List<WSSendMessageDetailData> list2, java.util.List<WSSendMessageDetailData> list3, @NotNull java.util.List<java.lang.Long> list4) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list4, "");
            return new Application(list, list2, list3, list4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WSSendMessageDetailData> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Long> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WSSendMessageDetailData> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.util.List<WSSendMessageDetailData> list = this.AEQbTJ;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            java.util.List<WSSendMessageDetailData> list2 = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LoadMessageResponse(localVisibleMessages=" + this.copydefault + ", fetchedMessages=" + this.AEQbTJ + ", fetchedVisibleMessages=" + this.OLrzqt + ", missingMessageIds=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.util.List<InHouseIMMessageEntity> list, java.util.List<WSSendMessageDetailData> list2, java.util.List<WSSendMessageDetailData> list3, @NotNull java.util.List<java.lang.Long> list4) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list4, "");
            this.copydefault = list;
            this.AEQbTJ = list2;
            this.OLrzqt = list3;
            this.EZpvd = list4;
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, long j) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        C44124sEe.imLogSync$default("downloadRemainingMessages => channelId: " + str + ", minSeq: " + j, null, null, 6, null);
        try {
            this.gEmmrt.OLrzqt(str, j);
            C44124sEe.imLogSync$default("downloadRemainingMessages => Successfully scheduled download for channel: " + str, null, null, 6, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("MessagesUseCase", "Failed to schedule download for remaining messages", e);
            throw e;
        }
    }

    public static /* synthetic */ java.lang.Object generateInHouseMessageListResponse$default(C44502sSe c44502sSe, sNH snh, java.util.List list, java.lang.Long l, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return c44502sSe.AEQbTJ(snh, (java.util.List<InHouseIMMessageWithReactions>) list, l, str, (Continuation<? super sNQ>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull sNH snh, @NotNull java.util.List<InHouseIMMessageWithReactions> list, java.lang.Long l, java.lang.String str, @NotNull Continuation<? super sNQ> continuation) throws java.lang.Exception {
        MessagesUseCase$generateInHouseMessageListResponse$1 messagesUseCase$generateInHouseMessageListResponse$1;
        java.lang.Long l2;
        java.lang.Object obj;
        long j;
        sNH snh2;
        java.util.List<InHouseIMMessageWithReactions> list2;
        C44502sSe c44502sSe;
        InHouseIMMessageEntity inHouseIMMessageEntity;
        boolean z;
        boolean z2;
        long j2;
        java.lang.Long l3;
        java.util.List list3;
        C44502sSe c44502sSe2;
        sNH snh3;
        long j3;
        java.lang.Boolean boolEZpvd;
        java.lang.Object objAhwBna;
        long j4;
        java.util.List list4;
        long j5;
        java.util.List list5;
        C44502sSe c44502sSe3;
        java.lang.Object objGEmmrt;
        long j6;
        long j7;
        java.lang.Long l4;
        boolean z3;
        java.util.Iterator it;
        if (continuation instanceof MessagesUseCase$generateInHouseMessageListResponse$1) {
            messagesUseCase$generateInHouseMessageListResponse$1 = (MessagesUseCase$generateInHouseMessageListResponse$1) continuation;
            int i = messagesUseCase$generateInHouseMessageListResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$generateInHouseMessageListResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$generateInHouseMessageListResponse$1 = new MessagesUseCase$generateInHouseMessageListResponse$1(this, continuation);
            }
        }
        java.lang.Object obj2 = messagesUseCase$generateInHouseMessageListResponse$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$generateInHouseMessageListResponse$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            long jOLrzqt = OLrzqt(str);
            C44486sRp c44486sRp = this.DbNXlk;
            java.lang.String strCopydefault = snh.copydefault();
            messagesUseCase$generateInHouseMessageListResponse$1.L$0 = this;
            messagesUseCase$generateInHouseMessageListResponse$1.L$1 = snh;
            messagesUseCase$generateInHouseMessageListResponse$1.L$2 = list;
            l2 = l;
            messagesUseCase$generateInHouseMessageListResponse$1.L$3 = l2;
            messagesUseCase$generateInHouseMessageListResponse$1.J$0 = jOLrzqt;
            messagesUseCase$generateInHouseMessageListResponse$1.label = 1;
            java.lang.Object objKWHzl = c44486sRp.KWHzl(strCopydefault, messagesUseCase$generateInHouseMessageListResponse$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            obj = objKWHzl;
            j = jOLrzqt;
            snh2 = snh;
            list2 = list;
            c44502sSe = this;
        } else if (i2 == 1) {
            long j8 = messagesUseCase$generateInHouseMessageListResponse$1.J$0;
            java.lang.Long l5 = (java.lang.Long) messagesUseCase$generateInHouseMessageListResponse$1.L$3;
            list2 = (java.util.List) messagesUseCase$generateInHouseMessageListResponse$1.L$2;
            sNH snh4 = (sNH) messagesUseCase$generateInHouseMessageListResponse$1.L$1;
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$generateInHouseMessageListResponse$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            j = j8;
            obj = obj2;
            snh2 = snh4;
            c44502sSe = c44502sSe4;
            l2 = l5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = messagesUseCase$generateInHouseMessageListResponse$1.J$2;
                    j5 = messagesUseCase$generateInHouseMessageListResponse$1.J$1;
                    j6 = messagesUseCase$generateInHouseMessageListResponse$1.J$0;
                    list5 = (java.util.List) messagesUseCase$generateInHouseMessageListResponse$1.L$2;
                    list4 = (java.util.List) messagesUseCase$generateInHouseMessageListResponse$1.L$1;
                    l4 = (java.lang.Long) messagesUseCase$generateInHouseMessageListResponse$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    z = true;
                    z2 = false;
                    java.lang.Long l6 = (java.lang.Long) obj2;
                    long jLongValue = l6 == null ? l6.longValue() : Long.MAX_VALUE;
                    if (j7 <= j6 && !((list4 instanceof java.util.Collection) && list4.isEmpty())) {
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (((InHouseIMMessageWithReactions) it.next()).getImMessageEntity().getSeq() == jLongValue) {
                                z3 = z2;
                                break;
                            }
                        }
                        z3 = z;
                    } else {
                        z3 = z;
                    }
                    return new sNQ(list5, ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AubY(list4)).getImMessageEntity().getSendTime() >= j5 ? z : z2, z3, l4);
                }
                long j9 = messagesUseCase$generateInHouseMessageListResponse$1.J$1;
                long j10 = messagesUseCase$generateInHouseMessageListResponse$1.J$0;
                list5 = (java.util.List) messagesUseCase$generateInHouseMessageListResponse$1.L$4;
                list4 = (java.util.List) messagesUseCase$generateInHouseMessageListResponse$1.L$3;
                l3 = (java.lang.Long) messagesUseCase$generateInHouseMessageListResponse$1.L$2;
                snh3 = (sNH) messagesUseCase$generateInHouseMessageListResponse$1.L$1;
                c44502sSe3 = (C44502sSe) messagesUseCase$generateInHouseMessageListResponse$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                z = true;
                z2 = false;
                j4 = j10;
                j5 = j9;
                java.lang.Long l7 = (java.lang.Long) obj2;
                long jLongValue2 = l7 == null ? l7.longValue() : Long.MAX_VALUE;
                C44486sRp c44486sRp2 = c44502sSe3.DbNXlk;
                java.lang.String strCopydefault2 = snh3.copydefault();
                messagesUseCase$generateInHouseMessageListResponse$1.L$0 = l3;
                messagesUseCase$generateInHouseMessageListResponse$1.L$1 = list4;
                messagesUseCase$generateInHouseMessageListResponse$1.L$2 = list5;
                messagesUseCase$generateInHouseMessageListResponse$1.L$3 = null;
                messagesUseCase$generateInHouseMessageListResponse$1.L$4 = null;
                messagesUseCase$generateInHouseMessageListResponse$1.J$0 = j4;
                messagesUseCase$generateInHouseMessageListResponse$1.J$1 = j5;
                messagesUseCase$generateInHouseMessageListResponse$1.J$2 = jLongValue2;
                messagesUseCase$generateInHouseMessageListResponse$1.label = 4;
                objGEmmrt = c44486sRp2.gEmmrt(strCopydefault2, messagesUseCase$generateInHouseMessageListResponse$1);
                if (objGEmmrt != objCopydefault) {
                    return objCopydefault;
                }
                j6 = j4;
                j7 = jLongValue2;
                obj2 = objGEmmrt;
                l4 = l3;
                java.lang.Long l62 = (java.lang.Long) obj2;
                if (l62 == null) {
                }
                if (j7 <= j6) {
                    it = list4.iterator();
                    while (it.hasNext()) {
                    }
                    z3 = z;
                }
                return new sNQ(list5, ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AubY(list4)).getImMessageEntity().getSendTime() >= j5 ? z : z2, z3, l4);
            }
            j3 = messagesUseCase$generateInHouseMessageListResponse$1.J$1;
            j2 = messagesUseCase$generateInHouseMessageListResponse$1.J$0;
            list3 = (java.util.List) messagesUseCase$generateInHouseMessageListResponse$1.L$4;
            l3 = (java.lang.Long) messagesUseCase$generateInHouseMessageListResponse$1.L$3;
            InHouseIMMessageEntity inHouseIMMessageEntity2 = (InHouseIMMessageEntity) messagesUseCase$generateInHouseMessageListResponse$1.L$2;
            sNH snh5 = (sNH) messagesUseCase$generateInHouseMessageListResponse$1.L$1;
            c44502sSe2 = (C44502sSe) messagesUseCase$generateInHouseMessageListResponse$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            z = true;
            z2 = false;
            inHouseIMMessageEntity = inHouseIMMessageEntity2;
            snh3 = snh5;
            java.util.List listEZpvd = (java.util.List) obj2;
            boolEZpvd = snh3.EZpvd();
            if (boolEZpvd != null) {
                if (!Intrinsics.EZpvd(boolEZpvd, C56443yFo.KWHzl(z))) {
                    if (!Intrinsics.EZpvd(boolEZpvd, C56443yFo.KWHzl(z2))) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new FragmentManager());
                } else {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new Fragment());
                }
            }
            java.lang.Long lKWHzl = inHouseIMMessageEntity == null ? C56443yFo.KWHzl(inHouseIMMessageEntity.getSeq()) : null;
            long j11 = j3;
            pUU.KWHzl("MessagesUseCase", "realChannelStartSeq is " + j2 + "\n, latestItem is " + lKWHzl + "\n, sortedList.first() is " + ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AuCTelauCTel(list3)).getImMessageEntity().getSeq() + "\n, sortedList.last() is " + ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AubY(list3)).getImMessageEntity().getSeq() + "\n, ");
            C44486sRp c44486sRp3 = c44502sSe2.DbNXlk;
            java.lang.String strCopydefault3 = snh3.copydefault();
            messagesUseCase$generateInHouseMessageListResponse$1.L$0 = c44502sSe2;
            messagesUseCase$generateInHouseMessageListResponse$1.L$1 = snh3;
            messagesUseCase$generateInHouseMessageListResponse$1.L$2 = l3;
            messagesUseCase$generateInHouseMessageListResponse$1.L$3 = list3;
            messagesUseCase$generateInHouseMessageListResponse$1.L$4 = listEZpvd;
            messagesUseCase$generateInHouseMessageListResponse$1.J$0 = j2;
            messagesUseCase$generateInHouseMessageListResponse$1.J$1 = j11;
            messagesUseCase$generateInHouseMessageListResponse$1.label = 3;
            objAhwBna = c44486sRp3.AhwBna(strCopydefault3, messagesUseCase$generateInHouseMessageListResponse$1);
            if (objAhwBna != objCopydefault) {
                return objCopydefault;
            }
            j4 = j2;
            list4 = list3;
            j5 = j11;
            list5 = listEZpvd;
            c44502sSe3 = c44502sSe2;
            obj2 = objAhwBna;
            java.lang.Long l72 = (java.lang.Long) obj2;
            if (l72 == null) {
            }
            C44486sRp c44486sRp22 = c44502sSe3.DbNXlk;
            java.lang.String strCopydefault22 = snh3.copydefault();
            messagesUseCase$generateInHouseMessageListResponse$1.L$0 = l3;
            messagesUseCase$generateInHouseMessageListResponse$1.L$1 = list4;
            messagesUseCase$generateInHouseMessageListResponse$1.L$2 = list5;
            messagesUseCase$generateInHouseMessageListResponse$1.L$3 = null;
            messagesUseCase$generateInHouseMessageListResponse$1.L$4 = null;
            messagesUseCase$generateInHouseMessageListResponse$1.J$0 = j4;
            messagesUseCase$generateInHouseMessageListResponse$1.J$1 = j5;
            messagesUseCase$generateInHouseMessageListResponse$1.J$2 = jLongValue2;
            messagesUseCase$generateInHouseMessageListResponse$1.label = 4;
            objGEmmrt = c44486sRp22.gEmmrt(strCopydefault22, messagesUseCase$generateInHouseMessageListResponse$1);
            if (objGEmmrt != objCopydefault) {
            }
        }
        InHouseIMMessageEntity inHouseIMMessageEntity3 = (InHouseIMMessageEntity) obj;
        long sendTime = inHouseIMMessageEntity3 != null ? inHouseIMMessageEntity3.getSendTime() : Long.MAX_VALUE;
        if (PendingIntent.EZpvd[snh2.AEQbTJ().ordinal()] != 1) {
            l2 = null;
        }
        if (!(!list2.isEmpty())) {
            return new sNQ(yDY.AhwBna(), false, false, l2);
        }
        java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(list2, new LoaderManager());
        C44486sRp c44486sRp4 = c44502sSe.DbNXlk;
        java.lang.String strCopydefault4 = snh2.copydefault();
        long seq = ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd2)).getImMessageEntity().getSeq();
        long seq2 = ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AubY(listEZpvd2)).getImMessageEntity().getSeq();
        messagesUseCase$generateInHouseMessageListResponse$1.L$0 = c44502sSe;
        messagesUseCase$generateInHouseMessageListResponse$1.L$1 = snh2;
        messagesUseCase$generateInHouseMessageListResponse$1.L$2 = inHouseIMMessageEntity3;
        messagesUseCase$generateInHouseMessageListResponse$1.L$3 = l2;
        messagesUseCase$generateInHouseMessageListResponse$1.L$4 = listEZpvd2;
        messagesUseCase$generateInHouseMessageListResponse$1.J$0 = j;
        long j12 = j;
        long j13 = sendTime;
        messagesUseCase$generateInHouseMessageListResponse$1.J$1 = j13;
        messagesUseCase$generateInHouseMessageListResponse$1.label = 2;
        inHouseIMMessageEntity = inHouseIMMessageEntity3;
        z = true;
        C44502sSe c44502sSe5 = c44502sSe;
        z2 = false;
        java.lang.Object objKWHzl2 = c44486sRp4.KWHzl(strCopydefault4, seq, seq2, messagesUseCase$generateInHouseMessageListResponse$1);
        if (objKWHzl2 == objCopydefault) {
            return objCopydefault;
        }
        j2 = j12;
        l3 = l2;
        list3 = listEZpvd2;
        c44502sSe2 = c44502sSe5;
        snh3 = snh2;
        obj2 = objKWHzl2;
        j3 = j13;
        java.util.List listEZpvd3 = (java.util.List) obj2;
        boolEZpvd = snh3.EZpvd();
        if (boolEZpvd != null) {
        }
        if (inHouseIMMessageEntity == null) {
        }
        long j112 = j3;
        pUU.KWHzl("MessagesUseCase", "realChannelStartSeq is " + j2 + "\n, latestItem is " + lKWHzl + "\n, sortedList.first() is " + ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AuCTelauCTel(list3)).getImMessageEntity().getSeq() + "\n, sortedList.last() is " + ((InHouseIMMessageWithReactions) CollectionsKt___CollectionsKt.AubY(list3)).getImMessageEntity().getSeq() + "\n, ");
        C44486sRp c44486sRp32 = c44502sSe2.DbNXlk;
        java.lang.String strCopydefault32 = snh3.copydefault();
        messagesUseCase$generateInHouseMessageListResponse$1.L$0 = c44502sSe2;
        messagesUseCase$generateInHouseMessageListResponse$1.L$1 = snh3;
        messagesUseCase$generateInHouseMessageListResponse$1.L$2 = l3;
        messagesUseCase$generateInHouseMessageListResponse$1.L$3 = list3;
        messagesUseCase$generateInHouseMessageListResponse$1.L$4 = listEZpvd3;
        messagesUseCase$generateInHouseMessageListResponse$1.J$0 = j2;
        messagesUseCase$generateInHouseMessageListResponse$1.J$1 = j112;
        messagesUseCase$generateInHouseMessageListResponse$1.label = 3;
        objAhwBna = c44486sRp32.AhwBna(strCopydefault32, messagesUseCase$generateInHouseMessageListResponse$1);
        if (objAhwBna != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        MessagesUseCase$getFirstUnreadMessageSeqOffline$1 messagesUseCase$getFirstUnreadMessageSeqOffline$1;
        long jLongValue;
        long j2;
        if (continuation instanceof MessagesUseCase$getFirstUnreadMessageSeqOffline$1) {
            messagesUseCase$getFirstUnreadMessageSeqOffline$1 = (MessagesUseCase$getFirstUnreadMessageSeqOffline$1) continuation;
            int i = messagesUseCase$getFirstUnreadMessageSeqOffline$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$getFirstUnreadMessageSeqOffline$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$getFirstUnreadMessageSeqOffline$1 = new MessagesUseCase$getFirstUnreadMessageSeqOffline$1(this, continuation);
            }
        }
        MessagesUseCase$getFirstUnreadMessageSeqOffline$1 messagesUseCase$getFirstUnreadMessageSeqOffline$12 = messagesUseCase$getFirstUnreadMessageSeqOffline$1;
        java.lang.Object objAEQbTJ = messagesUseCase$getFirstUnreadMessageSeqOffline$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$getFirstUnreadMessageSeqOffline$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.String strKWHzl = C44157sFk.KWHzl();
            jLongValue = -1;
            if (strKWHzl != null) {
                C44486sRp c44486sRp = this.DbNXlk;
                messagesUseCase$getFirstUnreadMessageSeqOffline$12.J$0 = -1L;
                messagesUseCase$getFirstUnreadMessageSeqOffline$12.label = 1;
                objAEQbTJ = c44486sRp.AEQbTJ(str, j + 1, strKWHzl, messagesUseCase$getFirstUnreadMessageSeqOffline$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                j2 = -1;
            }
            return C56443yFo.KWHzl(jLongValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = messagesUseCase$getFirstUnreadMessageSeqOffline$12.J$0;
        C56391yDq.AEQbTJ(objAEQbTJ);
        java.lang.Long l = (java.lang.Long) objAEQbTJ;
        if (l != null) {
            pUU.KWHzl("MessagesUseCase", "getFirstUnreadMessageSeqOffline => found unread message seq: " + j2);
            jLongValue = l.longValue();
        } else {
            jLongValue = j2;
        }
        return C56443yFo.KWHzl(jLongValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x017d, code lost:
    
        r0 = r14.getSeq();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0181, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0183, code lost:
    
        r0 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0188, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018a, code lost:
    
        o.C44124sEe.imLogSync$default("isUnreadMessage from visibleFetchedMessages => message: " + r0, null, null, 6, null);
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bc, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e1, code lost:
    
        if (r6 != (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e3, code lost:
    
        r0 = r2.getSeq();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e8, code lost:
    
        r0 = java.lang.Math.min(r6, r2.getSeq());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f0, code lost:
    
        r6 = r0;
        o.C44124sEe.imLogSync$default("isUnreadMessage from localVisibleMessages => message: " + r6, null, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021a, code lost:
    
        r20 = 1;
     */
    /* JADX WARN: Path cross not found for [B:29:0x0141, B:31:0x014c], limit reached: 90 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0131 -> B:27:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Exception {
        MessagesUseCase$getFirstUnreadMessageSeq$1 messagesUseCase$getFirstUnreadMessageSeq$1;
        java.lang.String str2;
        long j2;
        C44502sSe c44502sSe;
        int i;
        C44502sSe c44502sSe2;
        long j3;
        long j4;
        long j5;
        java.lang.String str3;
        long j6;
        java.lang.String str4;
        long jMin;
        java.lang.String str5 = str;
        if (continuation instanceof MessagesUseCase$getFirstUnreadMessageSeq$1) {
            messagesUseCase$getFirstUnreadMessageSeq$1 = (MessagesUseCase$getFirstUnreadMessageSeq$1) continuation;
            int i2 = messagesUseCase$getFirstUnreadMessageSeq$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messagesUseCase$getFirstUnreadMessageSeq$1.label = i2 - Integer.MIN_VALUE;
            } else {
                messagesUseCase$getFirstUnreadMessageSeq$1 = new MessagesUseCase$getFirstUnreadMessageSeq$1(this, continuation);
            }
        }
        java.lang.Object obj = messagesUseCase$getFirstUnreadMessageSeq$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = messagesUseCase$getFirstUnreadMessageSeq$1.label;
        java.lang.String str6 = ", max:";
        if (i3 == 0) {
            str2 = ", min:";
            C56391yDq.AEQbTJ(obj);
            messagesUseCase$getFirstUnreadMessageSeq$1.L$0 = this;
            messagesUseCase$getFirstUnreadMessageSeq$1.L$1 = str5;
            j2 = j;
            messagesUseCase$getFirstUnreadMessageSeq$1.J$0 = j2;
            messagesUseCase$getFirstUnreadMessageSeq$1.label = 1;
            java.lang.Object objCopydefault2 = copydefault(str5, (java.lang.Long) null, messagesUseCase$getFirstUnreadMessageSeq$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            c44502sSe = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = messagesUseCase$getFirstUnreadMessageSeq$1.I$0;
                str2 = ", min:";
                long j7 = messagesUseCase$getFirstUnreadMessageSeq$1.J$3;
                j5 = messagesUseCase$getFirstUnreadMessageSeq$1.J$2;
                long j8 = messagesUseCase$getFirstUnreadMessageSeq$1.J$1;
                long j9 = messagesUseCase$getFirstUnreadMessageSeq$1.J$0;
                java.lang.String str7 = (java.lang.String) messagesUseCase$getFirstUnreadMessageSeq$1.L$1;
                C44502sSe c44502sSe3 = (C44502sSe) messagesUseCase$getFirstUnreadMessageSeq$1.L$0;
                C56391yDq.AEQbTJ(obj);
                long j10 = j7;
                long j11 = j9;
                java.lang.Object obj2 = objCopydefault;
                Application application = (Application) obj;
                java.util.List<WSSendMessageDetailData> listEZpvd = application.EZpvd();
                if (listEZpvd != null || (listAhwBna = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new SharedElementCallback())) == null) {
                    java.util.List<WSSendMessageDetailData> listAhwBna = yDY.AhwBna();
                }
                java.util.List<InHouseIMMessageEntity> listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(application.AEQbTJ(), new AssistContent());
                for (WSSendMessageDetailData wSSendMessageDetailData : listAhwBna) {
                    if (!c44502sSe3.fJNWhG.copydefault(wSSendMessageDetailData)) {
                        if (c44502sSe3.copydefault(wSSendMessageDetailData)) {
                            break;
                        }
                        java.lang.String senderUid = wSSendMessageDetailData.getSenderUid();
                        InHouseIMPlatformType senderPlatformType = wSSendMessageDetailData.getSenderPlatformType();
                        if (c44502sSe3.KWHzl(senderUid, senderPlatformType != null ? C56443yFo.AEQbTJ(senderPlatformType.getApiValue()) : null)) {
                            break;
                        }
                    }
                }
                for (InHouseIMMessageEntity inHouseIMMessageEntity : listEZpvd2) {
                    if (inHouseIMMessageEntity.getSystemMessage() == null) {
                        if (c44502sSe3.AEQbTJ(inHouseIMMessageEntity)) {
                            break;
                        }
                        if (c44502sSe3.KWHzl(inHouseIMMessageEntity.getSenderUid(), C56443yFo.AEQbTJ(inHouseIMMessageEntity.getSenderPlatformType()))) {
                            break;
                        }
                    }
                }
                i = i4;
                if (i != 0) {
                    objCopydefault = obj2;
                    str3 = str7;
                    j3 = j8;
                    c44502sSe2 = c44502sSe3;
                    j4 = j11;
                    str4 = str6;
                    jMin = java.lang.Math.min(j10 + ((long) 20), j8);
                    j6 = j10 + 1;
                    if (j6 <= jMin) {
                        C44124sEe.imLogSync$default("getFirstUnreadMessageSeq => getFirstUnreadMessageSeq:in-loop => channelId:" + str3 + ", lastSeq:" + j4 + str2 + j6 + str4 + jMin + ", maxSeq:" + j3, null, null, 6, null);
                        messagesUseCase$getFirstUnreadMessageSeq$1.L$0 = c44502sSe2;
                        messagesUseCase$getFirstUnreadMessageSeq$1.L$1 = str3;
                        messagesUseCase$getFirstUnreadMessageSeq$1.J$0 = j4;
                        messagesUseCase$getFirstUnreadMessageSeq$1.J$1 = j3;
                        j5 = j5;
                        messagesUseCase$getFirstUnreadMessageSeq$1.J$2 = j5;
                        messagesUseCase$getFirstUnreadMessageSeq$1.J$3 = jMin;
                        messagesUseCase$getFirstUnreadMessageSeq$1.I$0 = i;
                        messagesUseCase$getFirstUnreadMessageSeq$1.label = 2;
                        long j12 = j3;
                        j10 = jMin;
                        j11 = j4;
                        long j13 = j6;
                        java.lang.String str8 = str4;
                        java.lang.Object objCopydefault3 = c44502sSe2.copydefault(str3, jMin, j13, messagesUseCase$getFirstUnreadMessageSeq$1);
                        obj2 = objCopydefault;
                        if (objCopydefault3 == obj2) {
                            return obj2;
                        }
                        str6 = str8;
                        str7 = str3;
                        c44502sSe3 = c44502sSe2;
                        j8 = j12;
                        obj = objCopydefault3;
                        i4 = i;
                        Application application2 = (Application) obj;
                        java.util.List<WSSendMessageDetailData> listEZpvd3 = application2.EZpvd();
                        if (listEZpvd3 != null) {
                        }
                        java.util.List<WSSendMessageDetailData> listAhwBna2 = yDY.AhwBna();
                        java.util.List<InHouseIMMessageEntity> listEZpvd22 = CollectionsKt___CollectionsKt.EZpvd(application2.AEQbTJ(), new AssistContent());
                        while (r0.hasNext()) {
                        }
                        while (r0.hasNext()) {
                        }
                        i = i4;
                        if (i != 0) {
                        }
                    }
                    return C56443yFo.KWHzl(j5);
                }
                if (j5 != -1) {
                    C44124sEe.imLogSync$default("getFirstUnreadMessageSeq => found unread message seq: " + j5, null, null, 6, null);
                } else {
                    C44124sEe.imLogSync$default("getFirstUnreadMessageSeq => no unread message found, stopped at user own message", null, null, 6, null);
                }
                return C56443yFo.KWHzl(j5);
            }
            str2 = ", min:";
            j2 = messagesUseCase$getFirstUnreadMessageSeq$1.J$0;
            str5 = (java.lang.String) messagesUseCase$getFirstUnreadMessageSeq$1.L$1;
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$getFirstUnreadMessageSeq$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c44502sSe = c44502sSe4;
        }
        long jLongValue = ((java.lang.Number) obj).longValue();
        long j14 = j2 + 1;
        long jMin2 = java.lang.Math.min(((long) 20) + j2, jLongValue);
        C44124sEe.imLogSync$default("getFirstUnreadMessageSeq => maxSeq:" + jLongValue + str2 + j14 + ", max:" + jMin2, null, null, 6, null);
        i = 0;
        c44502sSe2 = c44502sSe;
        j3 = jLongValue;
        j4 = j2;
        j5 = -1;
        str3 = str5;
        j6 = j14;
        messagesUseCase$getFirstUnreadMessageSeq$1 = messagesUseCase$getFirstUnreadMessageSeq$1;
        str4 = ", max:";
        jMin = jMin2;
        if (j6 <= jMin) {
        }
        return C56443yFo.KWHzl(j5);
    }

    public final boolean copydefault(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return this.fJNWhG.OLrzqt(wSSendMessageDetailData) && this.fJNWhG.AEQbTJ(wSSendMessageDetailData) && !Intrinsics.EZpvd((java.lang.Object) wSSendMessageDetailData.getSenderUid(), (java.lang.Object) this.ejfBZ.OLrzqt());
    }

    public final boolean AEQbTJ(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        java.lang.Boolean boolIsVisible = inHouseIMMessageEntity.isVisible();
        boolean zBooleanValue = boolIsVisible != null ? boolIsVisible.booleanValue() : false;
        java.lang.Boolean shouldIncludeInUnreadCount = inHouseIMMessageEntity.getShouldIncludeInUnreadCount();
        return zBooleanValue && (shouldIncludeInUnreadCount != null ? shouldIncludeInUnreadCount.booleanValue() : false) && !Intrinsics.EZpvd((java.lang.Object) inHouseIMMessageEntity.getSenderUid(), (java.lang.Object) this.ejfBZ.OLrzqt());
    }

    public final boolean KWHzl(java.lang.String str, java.lang.Integer num) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.ejfBZ.OLrzqt())) {
            int apiValue = InHouseIMPlatformType.Unknown.getApiValue();
            if (num == null || num.intValue() != apiValue) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, boolean z, long j2, java.lang.Boolean bool, long j3, CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new MessagesUseCase$loadMessageInBothDirections$2(z, this, str, j, j3, j2, coroutineDispatcher, bool, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, long j2, @NotNull Continuation<? super Application> continuation) {
        return CoroutineScopeKt.coroutineScope(new MessagesUseCase$loadMessagesWith$2(this, str, j2, j, null), continuation);
    }

    public final java.util.List<java.lang.Long> KWHzl(java.util.List<InHouseIMMessageEntity> list, long j, long j2) {
        java.lang.Long lValueOf;
        C56540yJd c56540yJd = new C56540yJd(j, j2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it = c56540yJd.iterator();
        while (it.hasNext()) {
            long jNextLong = ((AbstractC56422yEu) it).nextLong();
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                lValueOf = java.lang.Long.valueOf(jNextLong);
            } else {
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((InHouseIMMessageEntity) it2.next()).getSeq() == jNextLong) {
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = java.lang.Long.valueOf(jNextLong);
            }
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        return arrayList;
    }

    public final Application EZpvd(java.util.List<InHouseIMMessageEntity> list, java.util.List<java.lang.Long> list2) {
        return new Application(list, null, null, list2);
    }

    public final java.lang.Object KWHzl(java.lang.String str, java.util.List<InHouseIMMessageEntity> list, java.util.List<java.lang.Long> list2, Continuation<? super Application> continuation) {
        return CoroutineScopeKt.coroutineScope(new MessagesUseCase$createResponseWithFetchedMessages$2(this, str, list2, list, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:14:0x0036, B:54:0x016f, B:19:0x004b, B:51:0x014e, B:22:0x0060, B:38:0x00bb, B:39:0x00ce, B:41:0x00d4, B:42:0x00ef, B:44:0x00f5, B:45:0x012c, B:46:0x0133, B:48:0x013a, B:25:0x0076, B:32:0x00a1, B:34:0x00a5, B:55:0x0176, B:56:0x01a0, B:28:0x0083), top: B:64:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:14:0x0036, B:54:0x016f, B:19:0x004b, B:51:0x014e, B:22:0x0060, B:38:0x00bb, B:39:0x00ce, B:41:0x00d4, B:42:0x00ef, B:44:0x00f5, B:45:0x012c, B:46:0x0133, B:48:0x013a, B:25:0x0076, B:32:0x00a1, B:34:0x00a5, B:55:0x0176, B:56:0x01a0, B:28:0x0083), top: B:64:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull WSSendReactionResponse wSSendReactionResponse, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MessagesUseCase$handleUpdateNewReaction$1 messagesUseCase$handleUpdateNewReaction$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        WSSendReactionResponse wSSendReactionResponse2;
        java.lang.Object obj;
        C44502sSe c44502sSe;
        java.lang.String str;
        WSSendReactionResponse wSSendReactionResponse3;
        WSSendReactionResponse wSSendReactionResponse4;
        C44502sSe c44502sSe2;
        java.util.ArrayList arrayList;
        C44486sRp c44486sRp;
        java.lang.String strOLrzqt;
        long jEZpvd;
        long jKWHzl;
        WSSendReactionResponse wSSendReactionResponse5 = wSSendReactionResponse;
        if (continuation instanceof MessagesUseCase$handleUpdateNewReaction$1) {
            messagesUseCase$handleUpdateNewReaction$1 = (MessagesUseCase$handleUpdateNewReaction$1) continuation;
            int i = messagesUseCase$handleUpdateNewReaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$handleUpdateNewReaction$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$handleUpdateNewReaction$1 = new MessagesUseCase$handleUpdateNewReaction$1(this, continuation);
            }
        }
        MessagesUseCase$handleUpdateNewReaction$1 messagesUseCase$handleUpdateNewReaction$12 = messagesUseCase$handleUpdateNewReaction$1;
        java.lang.Object obj2 = messagesUseCase$handleUpdateNewReaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$handleUpdateNewReaction$12.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            Result.Application application2 = Result.Companion;
            C44486sRp c44486sRp2 = this.DbNXlk;
            java.lang.String strOLrzqt2 = wSSendReactionResponse.OLrzqt();
            long jEZpvd2 = wSSendReactionResponse.EZpvd();
            messagesUseCase$handleUpdateNewReaction$12.L$0 = wSSendReactionResponse5;
            messagesUseCase$handleUpdateNewReaction$12.L$1 = wSSendReactionResponse5;
            messagesUseCase$handleUpdateNewReaction$12.L$2 = this;
            messagesUseCase$handleUpdateNewReaction$12.label = 1;
            java.lang.Object objEZpvd = c44486sRp2.EZpvd(strOLrzqt2, jEZpvd2, messagesUseCase$handleUpdateNewReaction$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            wSSendReactionResponse2 = wSSendReactionResponse5;
            obj = objEZpvd;
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            C44124sEe.imLogSync$default("fetchMissingMessages => failed to process reaction update", thM7380exceptionOrNullimpl, null, 4, null);
                        }
                        return Unit.INSTANCE;
                    }
                    c44502sSe2 = (C44502sSe) messagesUseCase$handleUpdateNewReaction$12.L$1;
                    wSSendReactionResponse4 = (WSSendReactionResponse) messagesUseCase$handleUpdateNewReaction$12.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    c44486sRp = c44502sSe2.DbNXlk;
                    strOLrzqt = wSSendReactionResponse4.OLrzqt();
                    jEZpvd = wSSendReactionResponse4.EZpvd();
                    jKWHzl = wSSendReactionResponse4.KWHzl();
                    messagesUseCase$handleUpdateNewReaction$12.L$0 = null;
                    messagesUseCase$handleUpdateNewReaction$12.L$1 = null;
                    messagesUseCase$handleUpdateNewReaction$12.L$2 = null;
                    messagesUseCase$handleUpdateNewReaction$12.L$3 = null;
                    messagesUseCase$handleUpdateNewReaction$12.label = 4;
                    if (c44486sRp.copydefault(strOLrzqt, jEZpvd, jKWHzl, messagesUseCase$handleUpdateNewReaction$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                java.lang.String str2 = (java.lang.String) messagesUseCase$handleUpdateNewReaction$12.L$3;
                C44502sSe c44502sSe3 = (C44502sSe) messagesUseCase$handleUpdateNewReaction$12.L$2;
                wSSendReactionResponse3 = (WSSendReactionResponse) messagesUseCase$handleUpdateNewReaction$12.L$1;
                WSSendReactionResponse wSSendReactionResponse6 = (WSSendReactionResponse) messagesUseCase$handleUpdateNewReaction$12.L$0;
                C56391yDq.AEQbTJ(obj2);
                str = str2;
                c44502sSe2 = c44502sSe3;
                wSSendReactionResponse4 = wSSendReactionResponse6;
                java.lang.String strOLrzqt3 = c44502sSe2.ejfBZ.OLrzqt();
                java.util.List<Reaction> listCopydefault = wSSendReactionResponse3.copydefault();
                arrayList = new java.util.ArrayList();
                for (Reaction reaction : listCopydefault) {
                    java.util.List<UserUid> listAEQbTJ = reaction.AEQbTJ();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    for (UserUid userUid : listAEQbTJ) {
                        java.util.ArrayList arrayList3 = arrayList2;
                        arrayList3.add(new EmojiReactionEntity(0L, str, reaction.copydefault(), userUid.EZpvd(), userUid.OLrzqt(), Intrinsics.EZpvd((java.lang.Object) userUid.OLrzqt(), (java.lang.Object) strOLrzqt3), 1, null));
                        arrayList2 = arrayList3;
                    }
                    C56406yEe.KWHzl(arrayList, arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    sMF smf = c44502sSe2.AYXKKw;
                    messagesUseCase$handleUpdateNewReaction$12.L$0 = wSSendReactionResponse4;
                    messagesUseCase$handleUpdateNewReaction$12.L$1 = c44502sSe2;
                    messagesUseCase$handleUpdateNewReaction$12.L$2 = null;
                    messagesUseCase$handleUpdateNewReaction$12.L$3 = null;
                    messagesUseCase$handleUpdateNewReaction$12.label = 3;
                    if (smf.copydefault(arrayList, messagesUseCase$handleUpdateNewReaction$12) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                c44486sRp = c44502sSe2.DbNXlk;
                strOLrzqt = wSSendReactionResponse4.OLrzqt();
                jEZpvd = wSSendReactionResponse4.EZpvd();
                jKWHzl = wSSendReactionResponse4.KWHzl();
                messagesUseCase$handleUpdateNewReaction$12.L$0 = null;
                messagesUseCase$handleUpdateNewReaction$12.L$1 = null;
                messagesUseCase$handleUpdateNewReaction$12.L$2 = null;
                messagesUseCase$handleUpdateNewReaction$12.L$3 = null;
                messagesUseCase$handleUpdateNewReaction$12.label = 4;
                if (c44486sRp.copydefault(strOLrzqt, jEZpvd, jKWHzl, messagesUseCase$handleUpdateNewReaction$12) == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$handleUpdateNewReaction$12.L$2;
            wSSendReactionResponse2 = (WSSendReactionResponse) messagesUseCase$handleUpdateNewReaction$12.L$1;
            WSSendReactionResponse wSSendReactionResponse7 = (WSSendReactionResponse) messagesUseCase$handleUpdateNewReaction$12.L$0;
            C56391yDq.AEQbTJ(obj2);
            c44502sSe = c44502sSe4;
            wSSendReactionResponse5 = wSSendReactionResponse7;
            obj = obj2;
        }
        str = (java.lang.String) obj;
        if (str == null) {
            throw new java.lang.IllegalArgumentException(("Message not found for reaction update: channelId=" + wSSendReactionResponse5.OLrzqt() + ", seq=" + wSSendReactionResponse5.EZpvd()).toString());
        }
        sMF smf2 = c44502sSe.AYXKKw;
        messagesUseCase$handleUpdateNewReaction$12.L$0 = wSSendReactionResponse5;
        messagesUseCase$handleUpdateNewReaction$12.L$1 = wSSendReactionResponse2;
        messagesUseCase$handleUpdateNewReaction$12.L$2 = c44502sSe;
        messagesUseCase$handleUpdateNewReaction$12.L$3 = str;
        messagesUseCase$handleUpdateNewReaction$12.label = 2;
        if (smf2.copydefault(str, messagesUseCase$handleUpdateNewReaction$12) == objCopydefault) {
            return objCopydefault;
        }
        wSSendReactionResponse3 = wSSendReactionResponse2;
        wSSendReactionResponse4 = wSSendReactionResponse5;
        c44502sSe2 = c44502sSe;
        java.lang.String strOLrzqt32 = c44502sSe2.ejfBZ.OLrzqt();
        java.util.List<Reaction> listCopydefault2 = wSSendReactionResponse3.copydefault();
        arrayList = new java.util.ArrayList();
        while (r6.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        c44486sRp = c44502sSe2.DbNXlk;
        strOLrzqt = wSSendReactionResponse4.OLrzqt();
        jEZpvd = wSSendReactionResponse4.EZpvd();
        jKWHzl = wSSendReactionResponse4.KWHzl();
        messagesUseCase$handleUpdateNewReaction$12.L$0 = null;
        messagesUseCase$handleUpdateNewReaction$12.L$1 = null;
        messagesUseCase$handleUpdateNewReaction$12.L$2 = null;
        messagesUseCase$handleUpdateNewReaction$12.L$3 = null;
        messagesUseCase$handleUpdateNewReaction$12.label = 4;
        if (c44486sRp.copydefault(strOLrzqt, jEZpvd, jKWHzl, messagesUseCase$handleUpdateNewReaction$12) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(java.lang.String str, java.util.List<java.lang.Long> list, Continuation<? super java.util.List<WSSendMessageDetailData>> continuation) {
        return CoroutineScopeKt.coroutineScope(new MessagesUseCase$fetchMissingMessages$2(list, this, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object loadMessageWithReactionResult$default(C44502sSe c44502sSe, sNO sno, java.lang.Long l, InHouseIMConversationEntity inHouseIMConversationEntity, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            inHouseIMConversationEntity = null;
        }
        return c44502sSe.KWHzl(sno, l, inHouseIMConversationEntity, (Continuation<? super java.util.List<InHouseIMMessageWithReactions>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull sNO sno, java.lang.Long l, InHouseIMConversationEntity inHouseIMConversationEntity, @NotNull Continuation<? super java.util.List<InHouseIMMessageWithReactions>> continuation) throws java.lang.Exception {
        MessagesUseCase$loadMessageWithReactionResult$1 messagesUseCase$loadMessageWithReactionResult$1;
        C44502sSe c44502sSe;
        if (continuation instanceof MessagesUseCase$loadMessageWithReactionResult$1) {
            messagesUseCase$loadMessageWithReactionResult$1 = (MessagesUseCase$loadMessageWithReactionResult$1) continuation;
            int i = messagesUseCase$loadMessageWithReactionResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$loadMessageWithReactionResult$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$loadMessageWithReactionResult$1 = new MessagesUseCase$loadMessageWithReactionResult$1(this, continuation);
            }
        }
        MessagesUseCase$loadMessageWithReactionResult$1 messagesUseCase$loadMessageWithReactionResult$12 = messagesUseCase$loadMessageWithReactionResult$1;
        java.lang.Object objOLrzqt = messagesUseCase$loadMessageWithReactionResult$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$loadMessageWithReactionResult$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            messagesUseCase$loadMessageWithReactionResult$12.L$0 = this;
            messagesUseCase$loadMessageWithReactionResult$12.L$1 = sno;
            messagesUseCase$loadMessageWithReactionResult$12.label = 1;
            objOLrzqt = OLrzqt(sno, l, inHouseIMConversationEntity, messagesUseCase$loadMessageWithReactionResult$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : (java.lang.Iterable) objOLrzqt) {
                    if (Intrinsics.EZpvd(((InHouseIMMessageWithReactions) obj).getImMessageEntity().isVisible(), C56443yFo.KWHzl(true))) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            sno = (sNO) messagesUseCase$loadMessageWithReactionResult$12.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$loadMessageWithReactionResult$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List list = (java.util.List) objOLrzqt;
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long seq = ((InHouseIMMessageEntity) it.next()).getSeq();
        while (it.hasNext()) {
            long seq2 = ((InHouseIMMessageEntity) it.next()).getSeq();
            if (seq > seq2) {
                seq = seq2;
            }
        }
        java.util.Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        long seq3 = ((InHouseIMMessageEntity) it2.next()).getSeq();
        while (it2.hasNext()) {
            long seq4 = ((InHouseIMMessageEntity) it2.next()).getSeq();
            if (seq3 < seq4) {
                seq3 = seq4;
            }
        }
        pUU.KWHzl("loadMessageWithReactionResult", "minLocalSeq:" + seq + ", maxLocalSeq:" + seq3);
        C44486sRp c44486sRp = c44502sSe.DbNXlk;
        java.lang.String strCopydefault = sno.copydefault();
        messagesUseCase$loadMessageWithReactionResult$12.L$0 = null;
        messagesUseCase$loadMessageWithReactionResult$12.L$1 = null;
        messagesUseCase$loadMessageWithReactionResult$12.label = 2;
        objOLrzqt = c44486sRp.AEQbTJ(strCopydefault, seq, seq3, messagesUseCase$loadMessageWithReactionResult$12);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r13.hasNext()) {
        }
        return arrayList2;
    }

    public static /* synthetic */ java.lang.Object loadMessagesWith$default(C44502sSe c44502sSe, sNO sno, java.lang.Long l, InHouseIMConversationEntity inHouseIMConversationEntity, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            inHouseIMConversationEntity = null;
        }
        return c44502sSe.OLrzqt(sno, l, inHouseIMConversationEntity, (Continuation<? super java.util.List<InHouseIMMessageEntity>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull sNO sno, java.lang.Long l, InHouseIMConversationEntity inHouseIMConversationEntity, @NotNull Continuation<? super java.util.List<InHouseIMMessageEntity>> continuation) throws java.lang.Exception {
        MessagesUseCase$loadMessagesWith$3 messagesUseCase$loadMessagesWith$3;
        sNO sno2;
        java.lang.Long l2;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        C44502sSe c44502sSe;
        java.lang.Object objCopydefault;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        C44502sSe c44502sSe2;
        long j;
        sNO sno3;
        C44502sSe c44502sSe3;
        long jMin;
        long j2;
        long jLongValue;
        if (continuation instanceof MessagesUseCase$loadMessagesWith$3) {
            messagesUseCase$loadMessagesWith$3 = (MessagesUseCase$loadMessagesWith$3) continuation;
            int i = messagesUseCase$loadMessagesWith$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$loadMessagesWith$3.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$loadMessagesWith$3 = new MessagesUseCase$loadMessagesWith$3(this, continuation);
            }
        }
        MessagesUseCase$loadMessagesWith$3 messagesUseCase$loadMessagesWith$32 = messagesUseCase$loadMessagesWith$3;
        java.lang.Object objEZpvd = messagesUseCase$loadMessagesWith$32.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messagesUseCase$loadMessagesWith$32.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (inHouseIMConversationEntity == null) {
                java.lang.String strCopydefault = sno.copydefault();
                messagesUseCase$loadMessagesWith$32.L$0 = this;
                sno2 = sno;
                messagesUseCase$loadMessagesWith$32.L$1 = sno2;
                l2 = l;
                messagesUseCase$loadMessagesWith$32.L$2 = l2;
                messagesUseCase$loadMessagesWith$32.label = 1;
                objEZpvd = EZpvd(strCopydefault, messagesUseCase$loadMessagesWith$32);
                if (objEZpvd == objCopydefault2) {
                    return objCopydefault2;
                }
                c44502sSe = this;
            } else {
                sno2 = sno;
                l2 = l;
                inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                c44502sSe = this;
                long jCopydefault = c44502sSe.copydefault(inHouseIMConversationEntity2);
                java.lang.String strCopydefault2 = sno2.copydefault();
                messagesUseCase$loadMessagesWith$32.L$0 = c44502sSe;
                messagesUseCase$loadMessagesWith$32.L$1 = sno2;
                messagesUseCase$loadMessagesWith$32.L$2 = inHouseIMConversationEntity2;
                messagesUseCase$loadMessagesWith$32.J$0 = jCopydefault;
                messagesUseCase$loadMessagesWith$32.label = 2;
                objCopydefault = c44502sSe.copydefault(strCopydefault2, l2, messagesUseCase$loadMessagesWith$32);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                objEZpvd = objCopydefault;
                c44502sSe2 = c44502sSe;
                j = jCopydefault;
                sno3 = sno2;
                long jLongValue2 = ((java.lang.Number) objEZpvd).longValue();
                if (!sno3.AEQbTJ()) {
                }
                if (!sno3.AEQbTJ()) {
                }
                j2 = jLongValue;
                if (jMin < j2) {
                }
            }
        } else if (i2 == 1) {
            java.lang.Long l3 = (java.lang.Long) messagesUseCase$loadMessagesWith$32.L$2;
            sNO sno4 = (sNO) messagesUseCase$loadMessagesWith$32.L$1;
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$loadMessagesWith$32.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            l2 = l3;
            sno2 = sno4;
            c44502sSe = c44502sSe4;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    C56391yDq.AEQbTJ(objEZpvd);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = messagesUseCase$loadMessagesWith$32.J$0;
            InHouseIMConversationEntity inHouseIMConversationEntity4 = (InHouseIMConversationEntity) messagesUseCase$loadMessagesWith$32.L$2;
            sNO sno5 = (sNO) messagesUseCase$loadMessagesWith$32.L$1;
            C44502sSe c44502sSe5 = (C44502sSe) messagesUseCase$loadMessagesWith$32.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
            j = j3;
            sno3 = sno5;
            c44502sSe2 = c44502sSe5;
            long jLongValue22 = ((java.lang.Number) objEZpvd).longValue();
            if (!sno3.AEQbTJ()) {
                java.lang.Long lDjBIcL = sno3.djBIcL();
                if (lDjBIcL != null) {
                    jMin = lDjBIcL.longValue();
                    c44502sSe3 = c44502sSe2;
                } else {
                    c44502sSe3 = c44502sSe2;
                    jMin = jLongValue22;
                }
            } else {
                java.lang.Long lDjBIcL2 = sno3.djBIcL();
                c44502sSe3 = c44502sSe2;
                jMin = java.lang.Math.min(((lDjBIcL2 != null ? lDjBIcL2.longValue() : j) + sno3.AhwBna()) - 1, jLongValue22);
            }
            if (!sno3.AEQbTJ()) {
                jLongValue = java.lang.Math.max((jMin - sno3.AhwBna()) + 1, j);
            } else {
                java.lang.Long lDjBIcL3 = sno3.djBIcL();
                if (lDjBIcL3 == null) {
                    j2 = j;
                    if (jMin < j2) {
                        return c44502sSe3.EZpvd(sno3, jMin, j2, jLongValue22, inHouseIMConversationEntity3);
                    }
                    messagesUseCase$loadMessagesWith$32.L$0 = null;
                    messagesUseCase$loadMessagesWith$32.L$1 = null;
                    messagesUseCase$loadMessagesWith$32.L$2 = null;
                    messagesUseCase$loadMessagesWith$32.label = 3;
                    objEZpvd = c44502sSe3.AEQbTJ(sno3, jMin, j2, jLongValue22, j, inHouseIMConversationEntity3, messagesUseCase$loadMessagesWith$32);
                    return objEZpvd == objCopydefault2 ? objCopydefault2 : objEZpvd;
                }
                jLongValue = lDjBIcL3.longValue();
            }
            j2 = jLongValue;
            if (jMin < j2) {
            }
        }
        inHouseIMConversationEntity2 = (InHouseIMConversationEntity) objEZpvd;
        long jCopydefault2 = c44502sSe.copydefault(inHouseIMConversationEntity2);
        java.lang.String strCopydefault22 = sno2.copydefault();
        messagesUseCase$loadMessagesWith$32.L$0 = c44502sSe;
        messagesUseCase$loadMessagesWith$32.L$1 = sno2;
        messagesUseCase$loadMessagesWith$32.L$2 = inHouseIMConversationEntity2;
        messagesUseCase$loadMessagesWith$32.J$0 = jCopydefault2;
        messagesUseCase$loadMessagesWith$32.label = 2;
        objCopydefault = c44502sSe.copydefault(strCopydefault22, l2, messagesUseCase$loadMessagesWith$32);
        if (objCopydefault != objCopydefault2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, Continuation<? super InHouseIMConversationEntity> continuation) throws java.lang.Throwable {
        MessagesUseCase$validateConversation$1 messagesUseCase$validateConversation$1;
        if (continuation instanceof MessagesUseCase$validateConversation$1) {
            messagesUseCase$validateConversation$1 = (MessagesUseCase$validateConversation$1) continuation;
            int i = messagesUseCase$validateConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$validateConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$validateConversation$1 = new MessagesUseCase$validateConversation$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = messagesUseCase$validateConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$validateConversation$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C44484sRn c44484sRn = this.AEQbTJ;
            messagesUseCase$validateConversation$1.L$0 = str;
            messagesUseCase$validateConversation$1.label = 1;
            objEZpvd = c44484sRn.EZpvd(str, messagesUseCase$validateConversation$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) messagesUseCase$validateConversation$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        InHouseIMConversationEntity inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
        if (inHouseIMConversationEntity != null) {
            return inHouseIMConversationEntity;
        }
        throw new java.lang.IllegalArgumentException(("Conversation not found for channelId: " + str).toString());
    }

    public final long copydefault(InHouseIMConversationEntity inHouseIMConversationEntity) {
        java.lang.Long startMsgSeq = inHouseIMConversationEntity.getStartMsgSeq();
        if (startMsgSeq == null) {
            throw new java.lang.IllegalArgumentException("Start message sequence is null".toString());
        }
        return startMsgSeq.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Long l, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Exception {
        MessagesUseCase$determineMaxSequence$1 messagesUseCase$determineMaxSequence$1;
        long jLongValue;
        if (continuation instanceof MessagesUseCase$determineMaxSequence$1) {
            messagesUseCase$determineMaxSequence$1 = (MessagesUseCase$determineMaxSequence$1) continuation;
            int i = messagesUseCase$determineMaxSequence$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$determineMaxSequence$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$determineMaxSequence$1 = new MessagesUseCase$determineMaxSequence$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = messagesUseCase$determineMaxSequence$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$determineMaxSequence$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (!this.fARcdN.EZpvd()) {
                C44486sRp c44486sRp = this.DbNXlk;
                messagesUseCase$determineMaxSequence$1.label = 2;
                objAEQbTJ = c44486sRp.AEQbTJ(str, messagesUseCase$determineMaxSequence$1);
                return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                C44489sRs c44489sRs = this.fARcdN;
                messagesUseCase$determineMaxSequence$1.label = 1;
                objAEQbTJ = c44489sRs.EZpvd(str, messagesUseCase$determineMaxSequence$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                java.lang.Long l2 = (java.lang.Long) objAEQbTJ;
                if (l2 == null) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.Long l22 = (java.lang.Long) objAEQbTJ;
            jLongValue = l22 == null ? l22.longValue() : 0L;
        }
        return C56443yFo.KWHzl(jLongValue);
    }

    public final java.util.List<InHouseIMMessageEntity> EZpvd(@NotNull sNO sno, long j, long j2, long j3, @NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
        Intrinsics.checkNotNullParameter(sno, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        C44124sEe.imLogSync$default("loadMessagesWith => channelId:" + sno.copydefault() + ", [" + j + ".." + j2 + "] no message found, maxSeq=" + j3, null, null, 6, null);
        sRW.KWHzl.AEQbTJ(inHouseIMConversationEntity, yDY.AhwBna(), j, j2, j3, 0, java.lang.Math.abs(java.lang.System.currentTimeMillis() - jCurrentTimeMillis), 0);
        return yDY.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0214 A[PHI: r0
  0x0214: PHI (r0v15 java.lang.Object) = (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:41:0x0211, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01b2 -> B:35:0x01be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(sNO sno, long j, long j2, long j3, long j4, InHouseIMConversationEntity inHouseIMConversationEntity, Continuation<? super java.util.List<InHouseIMMessageEntity>> continuation) throws java.lang.Exception {
        MessagesUseCase$processMessageLoadingLoop$1 messagesUseCase$processMessageLoadingLoop$1;
        C44502sSe c44502sSe;
        long j5;
        long j6;
        long j7;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        ActionBar actionBar;
        MessagesUseCase$processMessageLoadingLoop$1 messagesUseCase$processMessageLoadingLoop$12;
        java.util.List<Application> arrayList;
        sNO sno2;
        long j8;
        sNO sno3;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        ActionBar actionBar2;
        long j9;
        long j10;
        long j11;
        java.util.List<Application> list;
        java.util.List<Application> list2;
        long j12;
        java.lang.Object objOLrzqt;
        java.lang.Object obj;
        java.util.List<Application> list3;
        long j13;
        long j14;
        long j15;
        InHouseIMConversationEntity inHouseIMConversationEntity4;
        sNO sno4;
        C44502sSe c44502sSe2;
        if (continuation instanceof MessagesUseCase$processMessageLoadingLoop$1) {
            messagesUseCase$processMessageLoadingLoop$1 = (MessagesUseCase$processMessageLoadingLoop$1) continuation;
            int i = messagesUseCase$processMessageLoadingLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$processMessageLoadingLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$processMessageLoadingLoop$1 = new MessagesUseCase$processMessageLoadingLoop$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messagesUseCase$processMessageLoadingLoop$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messagesUseCase$processMessageLoadingLoop$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            c44502sSe = this;
            j5 = j2;
            j6 = j3;
            j7 = j4;
            inHouseIMConversationEntity2 = inHouseIMConversationEntity;
            actionBar = new ActionBar(j, j2, false, 0, 0L, 28, null);
            messagesUseCase$processMessageLoadingLoop$12 = messagesUseCase$processMessageLoadingLoop$1;
            arrayList = new java.util.ArrayList();
            sno2 = sno;
            j8 = j;
            messagesUseCase$processMessageLoadingLoop$12.L$0 = c44502sSe;
            messagesUseCase$processMessageLoadingLoop$12.L$1 = sno2;
            messagesUseCase$processMessageLoadingLoop$12.L$2 = inHouseIMConversationEntity2;
            messagesUseCase$processMessageLoadingLoop$12.L$3 = actionBar;
            messagesUseCase$processMessageLoadingLoop$12.L$4 = arrayList;
            messagesUseCase$processMessageLoadingLoop$12.J$0 = j8;
            messagesUseCase$processMessageLoadingLoop$12.J$1 = j5;
            messagesUseCase$processMessageLoadingLoop$12.J$2 = j6;
            messagesUseCase$processMessageLoadingLoop$12.J$3 = j7;
            messagesUseCase$processMessageLoadingLoop$12.label = 1;
            if (c44502sSe.OLrzqt(actionBar, sno2, j7, messagesUseCase$processMessageLoadingLoop$12) != objCopydefault2) {
            }
        } else if (i2 == 1) {
            j11 = messagesUseCase$processMessageLoadingLoop$1.J$3;
            j6 = messagesUseCase$processMessageLoadingLoop$1.J$2;
            j10 = messagesUseCase$processMessageLoadingLoop$1.J$1;
            j9 = messagesUseCase$processMessageLoadingLoop$1.J$0;
            list = (java.util.List) messagesUseCase$processMessageLoadingLoop$1.L$4;
            actionBar2 = (ActionBar) messagesUseCase$processMessageLoadingLoop$1.L$3;
            inHouseIMConversationEntity3 = (InHouseIMConversationEntity) messagesUseCase$processMessageLoadingLoop$1.L$2;
            sno3 = (sNO) messagesUseCase$processMessageLoadingLoop$1.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$processMessageLoadingLoop$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            if (actionBar2.EZpvd() < actionBar2.copydefault()) {
            }
        } else if (i2 == 2) {
            j11 = messagesUseCase$processMessageLoadingLoop$1.J$3;
            j6 = messagesUseCase$processMessageLoadingLoop$1.J$2;
            j10 = messagesUseCase$processMessageLoadingLoop$1.J$1;
            j9 = messagesUseCase$processMessageLoadingLoop$1.J$0;
            list = (java.util.List) messagesUseCase$processMessageLoadingLoop$1.L$4;
            actionBar2 = (ActionBar) messagesUseCase$processMessageLoadingLoop$1.L$3;
            inHouseIMConversationEntity3 = (InHouseIMConversationEntity) messagesUseCase$processMessageLoadingLoop$1.L$2;
            sno3 = (sNO) messagesUseCase$processMessageLoadingLoop$1.L$1;
            c44502sSe = (C44502sSe) messagesUseCase$processMessageLoadingLoop$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            C44502sSe c44502sSe3 = c44502sSe;
            list2 = list;
            long j16 = j11;
            ActionBar actionBar3 = actionBar2;
            long j17 = j9;
            j12 = j10;
            long j18 = j6;
            Application application = (Application) objCopydefault;
            list2.add(application);
            c44502sSe3.OLrzqt(actionBar3);
            java.lang.Object obj2 = objCopydefault2;
            int iEZpvd = c44502sSe3.EZpvd(list2);
            c44502sSe3.KWHzl(sno3, actionBar3.EZpvd(), actionBar3.copydefault(), iEZpvd, application);
            long jAhwBna = sno3.AhwBna();
            messagesUseCase$processMessageLoadingLoop$1.L$0 = c44502sSe3;
            messagesUseCase$processMessageLoadingLoop$1.L$1 = sno3;
            messagesUseCase$processMessageLoadingLoop$1.L$2 = inHouseIMConversationEntity3;
            messagesUseCase$processMessageLoadingLoop$1.L$3 = actionBar3;
            messagesUseCase$processMessageLoadingLoop$1.L$4 = list2;
            messagesUseCase$processMessageLoadingLoop$1.J$0 = j17;
            messagesUseCase$processMessageLoadingLoop$1.J$1 = j12;
            messagesUseCase$processMessageLoadingLoop$1.J$2 = j18;
            messagesUseCase$processMessageLoadingLoop$1.J$3 = j16;
            messagesUseCase$processMessageLoadingLoop$1.label = 3;
            objOLrzqt = c44502sSe3.OLrzqt(iEZpvd, jAhwBna, messagesUseCase$processMessageLoadingLoop$1);
            obj = obj2;
            if (objOLrzqt != obj) {
            }
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j19 = messagesUseCase$processMessageLoadingLoop$1.J$3;
            long j20 = messagesUseCase$processMessageLoadingLoop$1.J$2;
            long j21 = messagesUseCase$processMessageLoadingLoop$1.J$1;
            long j22 = messagesUseCase$processMessageLoadingLoop$1.J$0;
            list2 = (java.util.List) messagesUseCase$processMessageLoadingLoop$1.L$4;
            ActionBar actionBar4 = (ActionBar) messagesUseCase$processMessageLoadingLoop$1.L$3;
            InHouseIMConversationEntity inHouseIMConversationEntity5 = (InHouseIMConversationEntity) messagesUseCase$processMessageLoadingLoop$1.L$2;
            sNO sno5 = (sNO) messagesUseCase$processMessageLoadingLoop$1.L$1;
            C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$processMessageLoadingLoop$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            C44502sSe c44502sSe5 = c44502sSe4;
            objOLrzqt = objCopydefault;
            MessagesUseCase$processMessageLoadingLoop$1 messagesUseCase$processMessageLoadingLoop$13 = messagesUseCase$processMessageLoadingLoop$1;
            j8 = j22;
            obj = objCopydefault2;
            ActionBar actionBar5 = actionBar4;
            inHouseIMConversationEntity3 = inHouseIMConversationEntity5;
            j6 = j20;
            long j23 = j19;
            j12 = j21;
            if (!((java.lang.Boolean) objOLrzqt).booleanValue()) {
                objCopydefault2 = obj;
                sno2 = sno5;
                long j24 = j23;
                messagesUseCase$processMessageLoadingLoop$12 = messagesUseCase$processMessageLoadingLoop$13;
                j5 = j12;
                j7 = j24;
                inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                actionBar = actionBar5;
                arrayList = list2;
                c44502sSe = c44502sSe5;
                messagesUseCase$processMessageLoadingLoop$12.L$0 = c44502sSe;
                messagesUseCase$processMessageLoadingLoop$12.L$1 = sno2;
                messagesUseCase$processMessageLoadingLoop$12.L$2 = inHouseIMConversationEntity2;
                messagesUseCase$processMessageLoadingLoop$12.L$3 = actionBar;
                messagesUseCase$processMessageLoadingLoop$12.L$4 = arrayList;
                messagesUseCase$processMessageLoadingLoop$12.J$0 = j8;
                messagesUseCase$processMessageLoadingLoop$12.J$1 = j5;
                messagesUseCase$processMessageLoadingLoop$12.J$2 = j6;
                messagesUseCase$processMessageLoadingLoop$12.J$3 = j7;
                messagesUseCase$processMessageLoadingLoop$12.label = 1;
                if (c44502sSe.OLrzqt(actionBar, sno2, j7, messagesUseCase$processMessageLoadingLoop$12) != objCopydefault2) {
                    return objCopydefault2;
                }
                sno3 = sno2;
                ActionBar actionBar6 = actionBar;
                inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                long j25 = j8;
                messagesUseCase$processMessageLoadingLoop$1 = messagesUseCase$processMessageLoadingLoop$12;
                j9 = j25;
                list = arrayList;
                actionBar2 = actionBar6;
                long j26 = j5;
                j11 = j7;
                j10 = j26;
                if (actionBar2.EZpvd() < actionBar2.copydefault()) {
                    long jEZpvd = actionBar2.EZpvd();
                    long jCopydefault = actionBar2.copydefault();
                    messagesUseCase$processMessageLoadingLoop$1.L$0 = c44502sSe;
                    messagesUseCase$processMessageLoadingLoop$1.L$1 = sno3;
                    messagesUseCase$processMessageLoadingLoop$1.L$2 = inHouseIMConversationEntity3;
                    messagesUseCase$processMessageLoadingLoop$1.L$3 = actionBar2;
                    messagesUseCase$processMessageLoadingLoop$1.L$4 = list;
                    messagesUseCase$processMessageLoadingLoop$1.J$0 = j9;
                    messagesUseCase$processMessageLoadingLoop$1.J$1 = j10;
                    messagesUseCase$processMessageLoadingLoop$1.J$2 = j6;
                    messagesUseCase$processMessageLoadingLoop$1.J$3 = j11;
                    messagesUseCase$processMessageLoadingLoop$1.label = 2;
                    objCopydefault = c44502sSe.copydefault(sno3, jEZpvd, jCopydefault, messagesUseCase$processMessageLoadingLoop$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    C44502sSe c44502sSe32 = c44502sSe;
                    list2 = list;
                    long j162 = j11;
                    ActionBar actionBar32 = actionBar2;
                    long j172 = j9;
                    j12 = j10;
                    long j182 = j6;
                    Application application2 = (Application) objCopydefault;
                    list2.add(application2);
                    c44502sSe32.OLrzqt(actionBar32);
                    java.lang.Object obj22 = objCopydefault2;
                    int iEZpvd2 = c44502sSe32.EZpvd(list2);
                    c44502sSe32.KWHzl(sno3, actionBar32.EZpvd(), actionBar32.copydefault(), iEZpvd2, application2);
                    long jAhwBna2 = sno3.AhwBna();
                    messagesUseCase$processMessageLoadingLoop$1.L$0 = c44502sSe32;
                    messagesUseCase$processMessageLoadingLoop$1.L$1 = sno3;
                    messagesUseCase$processMessageLoadingLoop$1.L$2 = inHouseIMConversationEntity3;
                    messagesUseCase$processMessageLoadingLoop$1.L$3 = actionBar32;
                    messagesUseCase$processMessageLoadingLoop$1.L$4 = list2;
                    messagesUseCase$processMessageLoadingLoop$1.J$0 = j172;
                    messagesUseCase$processMessageLoadingLoop$1.J$1 = j12;
                    messagesUseCase$processMessageLoadingLoop$1.J$2 = j182;
                    messagesUseCase$processMessageLoadingLoop$1.J$3 = j162;
                    messagesUseCase$processMessageLoadingLoop$1.label = 3;
                    objOLrzqt = c44502sSe32.OLrzqt(iEZpvd2, jAhwBna2, messagesUseCase$processMessageLoadingLoop$1);
                    obj = obj22;
                    if (objOLrzqt != obj) {
                        return obj;
                    }
                    c44502sSe5 = c44502sSe32;
                    messagesUseCase$processMessageLoadingLoop$13 = messagesUseCase$processMessageLoadingLoop$1;
                    j8 = j172;
                    j23 = j162;
                    sno5 = sno3;
                    j6 = j182;
                    actionBar5 = actionBar32;
                    if (!((java.lang.Boolean) objOLrzqt).booleanValue()) {
                    }
                } else {
                    obj = objCopydefault2;
                    messagesUseCase$processMessageLoadingLoop$13 = messagesUseCase$processMessageLoadingLoop$1;
                    list3 = list;
                    j13 = j6;
                    j14 = j10;
                    j15 = j9;
                    inHouseIMConversationEntity4 = inHouseIMConversationEntity3;
                    sno4 = sno3;
                    c44502sSe2 = c44502sSe;
                    long jOLrzqt = actionBar2.OLrzqt();
                    int iKWHzl = actionBar2.KWHzl();
                    messagesUseCase$processMessageLoadingLoop$13.L$0 = null;
                    messagesUseCase$processMessageLoadingLoop$13.L$1 = null;
                    messagesUseCase$processMessageLoadingLoop$13.L$2 = null;
                    messagesUseCase$processMessageLoadingLoop$13.L$3 = null;
                    messagesUseCase$processMessageLoadingLoop$13.L$4 = null;
                    messagesUseCase$processMessageLoadingLoop$13.label = 4;
                    objCopydefault = c44502sSe2.KWHzl(list3, sno4, j15, j14, j13, jOLrzqt, iKWHzl, inHouseIMConversationEntity4, messagesUseCase$processMessageLoadingLoop$13);
                    if (objCopydefault != obj) {
                    }
                }
            } else {
                j15 = j8;
                j13 = j6;
                sno4 = sno5;
                j14 = j12;
                inHouseIMConversationEntity4 = inHouseIMConversationEntity3;
                actionBar2 = actionBar5;
                list3 = list2;
                c44502sSe2 = c44502sSe5;
                long jOLrzqt2 = actionBar2.OLrzqt();
                int iKWHzl2 = actionBar2.KWHzl();
                messagesUseCase$processMessageLoadingLoop$13.L$0 = null;
                messagesUseCase$processMessageLoadingLoop$13.L$1 = null;
                messagesUseCase$processMessageLoadingLoop$13.L$2 = null;
                messagesUseCase$processMessageLoadingLoop$13.L$3 = null;
                messagesUseCase$processMessageLoadingLoop$13.L$4 = null;
                messagesUseCase$processMessageLoadingLoop$13.label = 4;
                objCopydefault = c44502sSe2.KWHzl(list3, sno4, j15, j14, j13, jOLrzqt2, iKWHzl2, inHouseIMConversationEntity4, messagesUseCase$processMessageLoadingLoop$13);
                return objCopydefault != obj ? obj : objCopydefault;
            }
        }
    }

    /* JADX INFO: renamed from: o.sSe$ActionBar */
    public static final class ActionBar {
        public long AEQbTJ;
        public boolean EZpvd;
        public final long KWHzl;
        public int OLrzqt;
        public long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(long j, long j2, boolean z, int i, long j3) {
            return new ActionBar(j, j2, z, i, j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(long j) {
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(long j) {
            this.copydefault = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault && this.EZpvd == actionBar.EZpvd && this.OLrzqt == actionBar.OLrzqt && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Long.hashCode(this.AEQbTJ) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LoadingLoopState(fromSeq=" + this.AEQbTJ + ", toSeq=" + this.copydefault + ", loopedOnce=" + this.EZpvd + ", loopCount=" + this.OLrzqt + ", startTime=" + this.KWHzl + ")";
        }

        public ActionBar(long j, long j2, boolean z, int i, long j3) {
            this.AEQbTJ = j;
            this.copydefault = j2;
            this.EZpvd = z;
            this.OLrzqt = i;
            this.KWHzl = j3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r12v0 long)
  (r14v0 long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:1742)) : (r18v0 long))
 A[MD:(long, long, boolean, int, long):void (m)] (LINE:1737) call: o.sSe.ActionBar.<init>(long, long, boolean, int, long):void type: THIS */
        public /* synthetic */ ActionBar(long j, long j2, boolean z, int i, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? java.lang.System.currentTimeMillis() : j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(ActionBar actionBar, sNO sno, long j, Continuation<? super Unit> continuation) throws java.lang.Exception {
        MessagesUseCase$updateSequenceRangeIfNeeded$1 messagesUseCase$updateSequenceRangeIfNeeded$1;
        C44502sSe c44502sSe;
        sNO sno2;
        C44502sSe c44502sSe2;
        if (continuation instanceof MessagesUseCase$updateSequenceRangeIfNeeded$1) {
            messagesUseCase$updateSequenceRangeIfNeeded$1 = (MessagesUseCase$updateSequenceRangeIfNeeded$1) continuation;
            int i = messagesUseCase$updateSequenceRangeIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$updateSequenceRangeIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$updateSequenceRangeIfNeeded$1 = new MessagesUseCase$updateSequenceRangeIfNeeded$1(this, continuation);
            }
        }
        MessagesUseCase$updateSequenceRangeIfNeeded$1 messagesUseCase$updateSequenceRangeIfNeeded$12 = messagesUseCase$updateSequenceRangeIfNeeded$1;
        java.lang.Object objKWHzl = messagesUseCase$updateSequenceRangeIfNeeded$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$updateSequenceRangeIfNeeded$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (actionBar.AEQbTJ()) {
                actionBar.OLrzqt(actionBar.KWHzl() + 1);
                long jEZpvd = actionBar.EZpvd();
                long jCopydefault = actionBar.copydefault();
                messagesUseCase$updateSequenceRangeIfNeeded$12.L$0 = this;
                messagesUseCase$updateSequenceRangeIfNeeded$12.L$1 = actionBar;
                messagesUseCase$updateSequenceRangeIfNeeded$12.L$2 = sno;
                messagesUseCase$updateSequenceRangeIfNeeded$12.label = 1;
                objKWHzl = KWHzl(sno, jEZpvd, jCopydefault, j, messagesUseCase$updateSequenceRangeIfNeeded$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c44502sSe2 = this;
            } else {
                c44502sSe = this;
                sno2 = sno;
                c44502sSe.KWHzl(sno2, actionBar.EZpvd(), actionBar.copydefault());
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sno = (sNO) messagesUseCase$updateSequenceRangeIfNeeded$12.L$2;
            actionBar = (ActionBar) messagesUseCase$updateSequenceRangeIfNeeded$12.L$1;
            c44502sSe2 = (C44502sSe) messagesUseCase$updateSequenceRangeIfNeeded$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        kotlin.Pair pair = (kotlin.Pair) objKWHzl;
        long jLongValue = ((java.lang.Number) pair.component1()).longValue();
        long jLongValue2 = ((java.lang.Number) pair.component2()).longValue();
        actionBar.OLrzqt(jLongValue);
        actionBar.copydefault(jLongValue2);
        sno2 = sno;
        c44502sSe = c44502sSe2;
        c44502sSe.KWHzl(sno2, actionBar.EZpvd(), actionBar.copydefault());
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(sNO sno, long j, long j2, Continuation<? super Application> continuation) {
        return copydefault(sno.copydefault(), j, j2, continuation);
    }

    public final void OLrzqt(ActionBar actionBar) {
        if (actionBar.AEQbTJ()) {
            return;
        }
        actionBar.copydefault(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull sNO sno, long j, long j2, long j3, @NotNull Continuation<? super kotlin.Pair<java.lang.Long, java.lang.Long>> continuation) throws java.lang.Exception {
        MessagesUseCase$calculateNextSequenceRange$1 messagesUseCase$calculateNextSequenceRange$1;
        if (continuation instanceof MessagesUseCase$calculateNextSequenceRange$1) {
            messagesUseCase$calculateNextSequenceRange$1 = (MessagesUseCase$calculateNextSequenceRange$1) continuation;
            int i = messagesUseCase$calculateNextSequenceRange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messagesUseCase$calculateNextSequenceRange$1.label = i - Integer.MIN_VALUE;
            } else {
                messagesUseCase$calculateNextSequenceRange$1 = new MessagesUseCase$calculateNextSequenceRange$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = messagesUseCase$calculateNextSequenceRange$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messagesUseCase$calculateNextSequenceRange$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (sno.AEQbTJ()) {
                return C56390yDp.OLrzqt(C56443yFo.KWHzl(j2 - 1), C56443yFo.KWHzl(java.lang.Math.max(j2 - ((long) sno.OLrzqt()), j3)));
            }
            C44486sRp c44486sRp = this.DbNXlk;
            java.lang.String strCopydefault = sno.copydefault();
            messagesUseCase$calculateNextSequenceRange$1.L$0 = sno;
            messagesUseCase$calculateNextSequenceRange$1.J$0 = j;
            messagesUseCase$calculateNextSequenceRange$1.label = 1;
            objAEQbTJ = c44486sRp.AEQbTJ(strCopydefault, messagesUseCase$calculateNextSequenceRange$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = messagesUseCase$calculateNextSequenceRange$1.J$0;
            sno = (sNO) messagesUseCase$calculateNextSequenceRange$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return C56390yDp.OLrzqt(C56443yFo.KWHzl(java.lang.Math.min(((long) sno.OLrzqt()) + j, ((java.lang.Number) objAEQbTJ).longValue())), C56443yFo.KWHzl(j + 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<Application> list, sNO sno, long j, long j2, long j3, long j4, int i, InHouseIMConversationEntity inHouseIMConversationEntity, Continuation<? super java.util.List<InHouseIMMessageEntity>> continuation) throws java.lang.Exception {
        MessagesUseCase$finalizeLoadingResult$1 messagesUseCase$finalizeLoadingResult$1;
        C44502sSe c44502sSe;
        long j5;
        long j6;
        long j7;
        long j8;
        int i2;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        java.util.List list2;
        java.lang.Object obj;
        java.util.List<Application> list3;
        sNO sno2;
        java.lang.Object obj2;
        int i3;
        java.util.List<InHouseIMMessageWithReactions> listAhwBna;
        sNO sno3;
        java.lang.Object obj3;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        C44502sSe c44502sSe2;
        int i4;
        java.util.List<InHouseIMMessageEntity> list4;
        int i5;
        sFA.TaskDescription taskDescription;
        long j9;
        long j10;
        long j11;
        C44502sSe c44502sSe3;
        java.lang.Object objAEQbTJ;
        java.lang.Object obj4;
        long j12;
        long j13;
        long j14;
        int i6;
        java.util.List<InHouseIMMessageEntity> list5;
        long j15;
        if (continuation instanceof MessagesUseCase$finalizeLoadingResult$1) {
            messagesUseCase$finalizeLoadingResult$1 = (MessagesUseCase$finalizeLoadingResult$1) continuation;
            int i7 = messagesUseCase$finalizeLoadingResult$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                messagesUseCase$finalizeLoadingResult$1.label = i7 - Integer.MIN_VALUE;
            } else {
                messagesUseCase$finalizeLoadingResult$1 = new MessagesUseCase$finalizeLoadingResult$1(this, continuation);
            }
        }
        java.lang.Object obj5 = messagesUseCase$finalizeLoadingResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = messagesUseCase$finalizeLoadingResult$1.label;
        if (i8 == 0) {
            C56391yDq.AEQbTJ(obj5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<WSSendMessageDetailData> listCopydefault = ((Application) it.next()).copydefault();
                if (listCopydefault == null) {
                    listCopydefault = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList, listCopydefault);
            }
            java.util.Iterator<T> it2 = list.iterator();
            int size = 0;
            while (it2.hasNext()) {
                size += ((Application) it2.next()).OLrzqt().size();
            }
            sFA sfa = sFA.KWHzl;
            C44486sRp c44486sRp = this.DbNXlk;
            C44484sRn c44484sRn = this.AEQbTJ;
            C44485sRo c44485sRo = this.copydefault;
            InHouseIMConversationService inHouseIMConversationService = this.KWHzl;
            java.lang.String channelId = inHouseIMConversationEntity.getChannelId();
            C44489sRs c44489sRs = this.fARcdN;
            sMF smf = this.AYXKKw;
            C44272sJr c44272sJr = this.valueOf;
            messagesUseCase$finalizeLoadingResult$1.L$0 = this;
            messagesUseCase$finalizeLoadingResult$1.L$1 = list;
            messagesUseCase$finalizeLoadingResult$1.L$2 = sno;
            messagesUseCase$finalizeLoadingResult$1.L$3 = inHouseIMConversationEntity;
            messagesUseCase$finalizeLoadingResult$1.L$4 = arrayList;
            messagesUseCase$finalizeLoadingResult$1.J$0 = j;
            messagesUseCase$finalizeLoadingResult$1.J$1 = j2;
            messagesUseCase$finalizeLoadingResult$1.J$2 = j3;
            messagesUseCase$finalizeLoadingResult$1.J$3 = j4;
            messagesUseCase$finalizeLoadingResult$1.I$0 = i;
            messagesUseCase$finalizeLoadingResult$1.I$1 = size;
            messagesUseCase$finalizeLoadingResult$1.label = 1;
            int i9 = size;
            java.lang.Object objKWHzl = sfa.KWHzl(c44486sRp, c44484sRn, c44485sRo, inHouseIMConversationService, channelId, arrayList, true, c44489sRs, smf, c44272sJr, messagesUseCase$finalizeLoadingResult$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c44502sSe = this;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i2 = i;
            inHouseIMConversationEntity2 = inHouseIMConversationEntity;
            list2 = arrayList;
            obj = objKWHzl;
            list3 = list;
            sno2 = sno;
            obj2 = objCopydefault;
            i3 = i9;
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i6 = messagesUseCase$finalizeLoadingResult$1.I$1;
                    int i10 = messagesUseCase$finalizeLoadingResult$1.I$0;
                    long j16 = messagesUseCase$finalizeLoadingResult$1.J$3;
                    j13 = messagesUseCase$finalizeLoadingResult$1.J$2;
                    j14 = messagesUseCase$finalizeLoadingResult$1.J$1;
                    j15 = messagesUseCase$finalizeLoadingResult$1.J$0;
                    list5 = (java.util.List) messagesUseCase$finalizeLoadingResult$1.L$2;
                    InHouseIMConversationEntity inHouseIMConversationEntity4 = (InHouseIMConversationEntity) messagesUseCase$finalizeLoadingResult$1.L$1;
                    C44502sSe c44502sSe4 = (C44502sSe) messagesUseCase$finalizeLoadingResult$1.L$0;
                    C56391yDq.AEQbTJ(obj5);
                    c44502sSe3 = c44502sSe4;
                    j12 = j16;
                    i4 = i10;
                    inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
                    c44502sSe3.copydefault(inHouseIMConversationEntity3, list5, j15, j14, j13, i4, j12, i6);
                    return list5;
                }
                int i11 = messagesUseCase$finalizeLoadingResult$1.I$1;
                int i12 = messagesUseCase$finalizeLoadingResult$1.I$0;
                long j17 = messagesUseCase$finalizeLoadingResult$1.J$3;
                long j18 = messagesUseCase$finalizeLoadingResult$1.J$2;
                long j19 = messagesUseCase$finalizeLoadingResult$1.J$1;
                long j20 = messagesUseCase$finalizeLoadingResult$1.J$0;
                java.util.List<InHouseIMMessageEntity> list6 = (java.util.List) messagesUseCase$finalizeLoadingResult$1.L$4;
                sFA.TaskDescription taskDescription2 = (sFA.TaskDescription) messagesUseCase$finalizeLoadingResult$1.L$3;
                InHouseIMConversationEntity inHouseIMConversationEntity5 = (InHouseIMConversationEntity) messagesUseCase$finalizeLoadingResult$1.L$2;
                sNO sno4 = (sNO) messagesUseCase$finalizeLoadingResult$1.L$1;
                c44502sSe2 = (C44502sSe) messagesUseCase$finalizeLoadingResult$1.L$0;
                C56391yDq.AEQbTJ(obj5);
                i5 = i11;
                sno3 = sno4;
                obj3 = objCopydefault;
                taskDescription = taskDescription2;
                inHouseIMConversationEntity3 = inHouseIMConversationEntity5;
                i4 = i12;
                list4 = list6;
                j9 = j19;
                j5 = j20;
                j10 = j18;
                j11 = j17;
                sJW sjw = c44502sSe2.djBIcL;
                java.lang.String strCopydefault = sno3.copydefault();
                java.util.Set<java.lang.String> setOLrzqt = taskDescription.OLrzqt();
                messagesUseCase$finalizeLoadingResult$1.L$0 = c44502sSe2;
                messagesUseCase$finalizeLoadingResult$1.L$1 = inHouseIMConversationEntity3;
                messagesUseCase$finalizeLoadingResult$1.L$2 = list4;
                c44502sSe3 = c44502sSe2;
                messagesUseCase$finalizeLoadingResult$1.L$3 = null;
                messagesUseCase$finalizeLoadingResult$1.L$4 = null;
                messagesUseCase$finalizeLoadingResult$1.J$0 = j5;
                messagesUseCase$finalizeLoadingResult$1.J$1 = j9;
                messagesUseCase$finalizeLoadingResult$1.J$2 = j10;
                messagesUseCase$finalizeLoadingResult$1.J$3 = j11;
                messagesUseCase$finalizeLoadingResult$1.I$0 = i4;
                messagesUseCase$finalizeLoadingResult$1.I$1 = i5;
                messagesUseCase$finalizeLoadingResult$1.label = 3;
                objAEQbTJ = sjw.AEQbTJ(strCopydefault, setOLrzqt, messagesUseCase$finalizeLoadingResult$1);
                obj4 = obj3;
                if (objAEQbTJ != obj4) {
                    return obj4;
                }
                j12 = j11;
                j13 = j10;
                j14 = j9;
                i6 = i5;
                long j21 = j5;
                list5 = list4;
                j15 = j21;
                c44502sSe3.copydefault(inHouseIMConversationEntity3, list5, j15, j14, j13, i4, j12, i6);
                return list5;
            }
            int i13 = messagesUseCase$finalizeLoadingResult$1.I$1;
            i2 = messagesUseCase$finalizeLoadingResult$1.I$0;
            j8 = messagesUseCase$finalizeLoadingResult$1.J$3;
            j7 = messagesUseCase$finalizeLoadingResult$1.J$2;
            j6 = messagesUseCase$finalizeLoadingResult$1.J$1;
            j5 = messagesUseCase$finalizeLoadingResult$1.J$0;
            java.util.List list7 = (java.util.List) messagesUseCase$finalizeLoadingResult$1.L$4;
            inHouseIMConversationEntity2 = (InHouseIMConversationEntity) messagesUseCase$finalizeLoadingResult$1.L$3;
            sNO sno5 = (sNO) messagesUseCase$finalizeLoadingResult$1.L$2;
            java.util.List<Application> list8 = (java.util.List) messagesUseCase$finalizeLoadingResult$1.L$1;
            C44502sSe c44502sSe5 = (C44502sSe) messagesUseCase$finalizeLoadingResult$1.L$0;
            C56391yDq.AEQbTJ(obj5);
            c44502sSe = c44502sSe5;
            list2 = list7;
            obj2 = objCopydefault;
            i3 = i13;
            sno2 = sno5;
            obj = obj5;
            list3 = list8;
        }
        sFA.TaskDescription taskDescription3 = (sFA.TaskDescription) obj;
        if (!list2.isEmpty()) {
            listAhwBna = taskDescription3.EZpvd();
        } else {
            listAhwBna = yDY.AhwBna();
        }
        int i14 = i3;
        java.util.List<InHouseIMMessageWithReactions> list9 = listAhwBna;
        int i15 = i2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Iterator it3 = list3.iterator(); it3.hasNext(); it3 = it3) {
            C56406yEe.KWHzl(arrayList2, ((Application) it3.next()).AEQbTJ());
        }
        long j22 = j8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list9, 10));
        java.util.Iterator<T> it4 = list9.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((InHouseIMMessageWithReactions) it4.next()).getImMessageEntity());
        }
        java.util.List<InHouseIMMessageEntity> listCopydefault2 = c44502sSe.copydefault(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList2, (java.lang.Iterable) arrayList3), sno2.KWHzl());
        sJZ sjz = c44502sSe.AkhnZx;
        java.lang.String strCopydefault2 = sno2.copydefault();
        java.util.Set<java.lang.String> setValueOf = taskDescription3.valueOf();
        messagesUseCase$finalizeLoadingResult$1.L$0 = c44502sSe;
        messagesUseCase$finalizeLoadingResult$1.L$1 = sno2;
        messagesUseCase$finalizeLoadingResult$1.L$2 = inHouseIMConversationEntity2;
        messagesUseCase$finalizeLoadingResult$1.L$3 = taskDescription3;
        messagesUseCase$finalizeLoadingResult$1.L$4 = listCopydefault2;
        messagesUseCase$finalizeLoadingResult$1.J$0 = j5;
        messagesUseCase$finalizeLoadingResult$1.J$1 = j6;
        messagesUseCase$finalizeLoadingResult$1.J$2 = j7;
        C44502sSe c44502sSe6 = c44502sSe;
        messagesUseCase$finalizeLoadingResult$1.J$3 = j22;
        messagesUseCase$finalizeLoadingResult$1.I$0 = i15;
        messagesUseCase$finalizeLoadingResult$1.I$1 = i14;
        messagesUseCase$finalizeLoadingResult$1.label = 2;
        java.lang.Object objKWHzl2 = sjz.KWHzl(strCopydefault2, setValueOf, messagesUseCase$finalizeLoadingResult$1);
        java.lang.Object obj6 = obj2;
        if (objKWHzl2 == obj6) {
            return obj6;
        }
        sno3 = sno2;
        obj3 = obj6;
        inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
        c44502sSe2 = c44502sSe6;
        i4 = i15;
        list4 = listCopydefault2;
        i5 = i14;
        taskDescription = taskDescription3;
        j9 = j6;
        j10 = j7;
        j11 = j22;
        sJW sjw2 = c44502sSe2.djBIcL;
        java.lang.String strCopydefault3 = sno3.copydefault();
        java.util.Set<java.lang.String> setOLrzqt2 = taskDescription.OLrzqt();
        messagesUseCase$finalizeLoadingResult$1.L$0 = c44502sSe2;
        messagesUseCase$finalizeLoadingResult$1.L$1 = inHouseIMConversationEntity3;
        messagesUseCase$finalizeLoadingResult$1.L$2 = list4;
        c44502sSe3 = c44502sSe2;
        messagesUseCase$finalizeLoadingResult$1.L$3 = null;
        messagesUseCase$finalizeLoadingResult$1.L$4 = null;
        messagesUseCase$finalizeLoadingResult$1.J$0 = j5;
        messagesUseCase$finalizeLoadingResult$1.J$1 = j9;
        messagesUseCase$finalizeLoadingResult$1.J$2 = j10;
        messagesUseCase$finalizeLoadingResult$1.J$3 = j11;
        messagesUseCase$finalizeLoadingResult$1.I$0 = i4;
        messagesUseCase$finalizeLoadingResult$1.I$1 = i5;
        messagesUseCase$finalizeLoadingResult$1.label = 3;
        objAEQbTJ = sjw2.AEQbTJ(strCopydefault3, setOLrzqt2, messagesUseCase$finalizeLoadingResult$1);
        obj4 = obj3;
        if (objAEQbTJ != obj4) {
        }
    }

    public final java.util.List<InHouseIMMessageEntity> copydefault(java.util.List<InHouseIMMessageEntity> list, java.lang.Boolean bool) {
        if (bool == null) {
            return list;
        }
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            if (!Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            return CollectionsKt___CollectionsKt.EZpvd(list, new VoiceInteractor());
        }
        return CollectionsKt___CollectionsKt.EZpvd(list, new TaskStackBuilder());
    }

    public final void copydefault(InHouseIMConversationEntity inHouseIMConversationEntity, java.util.List<InHouseIMMessageEntity> list, long j, long j2, long j3, int i, long j4, int i2) {
        sRW.KWHzl.AEQbTJ(inHouseIMConversationEntity, list, j, j2, j3, i, java.lang.Math.abs(java.lang.System.currentTimeMillis() - j4), i2);
    }

    public final void KWHzl(sNO sno, long j, long j2) {
        C44124sEe.imLogGetMessage$default(sno.copydefault(), "loadMessagesWith:in-loop => channelId:" + sno.copydefault() + ", requestMessageId=" + sno.djBIcL() + ", fromSeq:" + j + ", toSeq:" + j2 + ", asc:" + sno.KWHzl() + ", expectedVisibleItem:" + sno.AhwBna(), null, 4, null);
    }

    public final void KWHzl(sNO sno, long j, long j2, int i, Application application) {
        java.lang.String strCopydefault = sno.copydefault();
        java.lang.String strCopydefault2 = sno.copydefault();
        java.lang.Boolean boolKWHzl = sno.KWHzl();
        java.util.List<WSSendMessageDetailData> listCopydefault = application.copydefault();
        C44124sEe.imLogGetMessage$default(strCopydefault, "loadMessagesWith:in-loop  => channelId:" + strCopydefault2 + ", fromSeq:" + j + ", toSeq:" + j2 + ", asc:" + boolKWHzl + ", visibleMessageTotal=" + i + ", messageTotalInBatch=" + (listCopydefault != null ? listCopydefault.size() : 0), null, 4, null);
    }

    public final long OLrzqt(java.lang.String str) {
        if (C33129mqd.valueOf(str) == 0 || str == null) {
            return 1L;
        }
        return C33129mqd.valueOf(str);
    }

    public final java.util.List<InHouseIMMessageEntity> OLrzqt(java.util.List<InHouseIMMessageEntity> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd(((InHouseIMMessageEntity) obj).isVisible(), java.lang.Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List<WSSendMessageDetailData> AEQbTJ(java.util.List<WSSendMessageDetailData> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (sMS.djBIcL.AYXKKw((WSSendMessageDetailData) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.lang.Object OLrzqt(int i, long j, Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(JobKt.isActive(continuation.getContext()) && ((long) i) < j);
    }

    public final int EZpvd(java.util.List<Application> list) {
        int size = 0;
        for (Application application : list) {
            java.util.List<WSSendMessageDetailData> listEZpvd = application.EZpvd();
            size = size + (listEZpvd != null ? listEZpvd.size() : 0) + application.AEQbTJ().size();
        }
        return size;
    }
}
