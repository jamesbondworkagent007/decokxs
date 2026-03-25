package com.okinc.im.imui.managerV2;

import android.net.Uri;
import com.okinc.im.imui.managerV2.DownloadAudioManager$download$1;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.concurrent.CountDownLatch;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C36517ocU;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44372sNj;
import o.sDZ;

/* JADX INFO: loaded from: classes18.dex */
public final class DownloadAudioManager$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36517ocU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadAudioManager$download$1(C36517ocU c36517ocU, OKMessage oKMessage, Continuation<? super DownloadAudioManager$download$1> continuation) {
        super(2, continuation);
        this.this$0 = c36517ocU;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DownloadAudioManager$download$1 downloadAudioManager$download$1 = new DownloadAudioManager$download$1(this.this$0, this.$message, continuation);
        downloadAudioManager$download$1.L$0 = obj;
        return downloadAudioManager$download$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DownloadAudioManager$download$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C36517ocU.StateListAnimator stateListAnimator = (C36517ocU.StateListAnimator) this.this$0.AEQbTJ.get(this.this$0.AEQbTJ(this.$message));
            if (stateListAnimator != null && stateListAnimator.OLrzqt() == 1) {
                return Unit.INSTANCE;
            }
            C36517ocU.StateListAnimator stateListAnimatorAEQbTJ = C36517ocU.StateListAnimator.Companion.AEQbTJ();
            OKHQVoiceMessage oKHQVoiceMessageKWHzl = this.this$0.KWHzl(this.$message);
            this.this$0.AEQbTJ.put(this.this$0.AEQbTJ(this.$message), C36517ocU.StateListAnimator.copy$default(stateListAnimatorAEQbTJ, 0, 0.0f, null, oKHQVoiceMessageKWHzl != null ? oKHQVoiceMessageKWHzl.getRemoteUri() : null, 7, null));
            OKMessage oKMessage = this.$message;
            OKMessage oKMessageCopy = oKMessage.copy((262143 & 1) != 0 ? oKMessage.seq : 0L, (262143 & 2) != 0 ? oKMessage.clientMessageId : null, (262143 & 4) != 0 ? oKMessage.targetId : null, (262143 & 8) != 0 ? oKMessage.senderUserId : null, (262143 & 16) != 0 ? oKMessage.messageType : null, (262143 & 32) != 0 ? oKMessage.conversationType : null, (262143 & 64) != 0 ? oKMessage.sentTime : 0L, (262143 & 128) != 0 ? oKMessage.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage.extra : null, (262143 & 512) != 0 ? oKMessage.objectName : null, (262143 & 1024) != 0 ? oKMessage.messageDirection : null, (262143 & 2048) != 0 ? oKMessage.sentStatus : null, (262143 & 4096) != 0 ? oKMessage.content : this.this$0.KWHzl(oKMessage), (262143 & 8192) != 0 ? oKMessage.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage.isVisible : false, (262143 & 65536) != 0 ? oKMessage.error : null, (262143 & 131072) != 0 ? oKMessage.reactionDisplay : null);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C36517ocU c36517ocU = this.this$0;
            OKMessage oKMessage2 = this.$message;
            try {
                Result.Application application = Result.Companion;
                sDZ.AEQbTJ.fARcdN().AuCTel().EZpvd().EZpvd(oKMessageCopy, new ActionBar(c36517ocU, oKMessage2, countDownLatch));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                countDownLatch.countDown();
            }
            try {
                Result.Application application3 = Result.Companion;
                countDownLatch.await();
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl != null) {
                thM7380exceptionOrNullimpl.printStackTrace();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class ActionBar implements InterfaceC44372sNj {
        public final /* synthetic */ CountDownLatch AEQbTJ;
        public final /* synthetic */ OKMessage EZpvd;
        public final /* synthetic */ C36517ocU OLrzqt;

        public ActionBar(C36517ocU c36517ocU, OKMessage oKMessage, CountDownLatch countDownLatch) {
            this.OLrzqt = c36517ocU;
            this.EZpvd = oKMessage;
            this.AEQbTJ = countDownLatch;
        }

        @Override // o.InterfaceC44372sNj
        public void copydefault(final OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            final C36517ocU c36517ocU = this.OLrzqt;
            c36517ocU.AEQbTJ(this.EZpvd, (Function1<? super C36517ocU.StateListAnimator, C36517ocU.StateListAnimator>) new Function1() { // from class: o.ocX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DownloadAudioManager$download$1.ActionBar.EZpvd(c36517ocU, oKMessage, (C36517ocU.StateListAnimator) obj);
                }
            });
            this.AEQbTJ.countDown();
        }

        public static final C36517ocU.StateListAnimator EZpvd(C36517ocU c36517ocU, OKMessage oKMessage, C36517ocU.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            OKHQVoiceMessage oKHQVoiceMessageKWHzl = c36517ocU.KWHzl(oKMessage);
            Uri localUri = oKHQVoiceMessageKWHzl != null ? oKHQVoiceMessageKWHzl.getLocalUri() : null;
            OKHQVoiceMessage oKHQVoiceMessageKWHzl2 = c36517ocU.KWHzl(oKMessage);
            return C36517ocU.StateListAnimator.copy$default(stateListAnimator, 0, 0.0f, localUri, oKHQVoiceMessageKWHzl2 != null ? oKHQVoiceMessageKWHzl2.getRemoteUri() : null, 2, null);
        }

        @Override // o.InterfaceC44372sNj
        public void OLrzqt(OKMessage oKMessage, final int i) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            this.OLrzqt.AEQbTJ(this.EZpvd, (Function1<? super C36517ocU.StateListAnimator, C36517ocU.StateListAnimator>) new Function1() { // from class: o.ocW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DownloadAudioManager$download$1.ActionBar.copydefault(i, (C36517ocU.StateListAnimator) obj);
                }
            });
        }

        public static final C36517ocU.StateListAnimator copydefault(int i, C36517ocU.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return C36517ocU.StateListAnimator.copy$default(stateListAnimator, 1, i / 100, null, null, 12, null);
        }

        @Override // o.InterfaceC44372sNj
        public void AEQbTJ(OKMessage oKMessage, Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt.AEQbTJ(this.EZpvd, (Function1<? super C36517ocU.StateListAnimator, C36517ocU.StateListAnimator>) new Function1() { // from class: o.ocT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DownloadAudioManager$download$1.ActionBar.copydefault((C36517ocU.StateListAnimator) obj);
                }
            });
            this.AEQbTJ.countDown();
        }

        public static final C36517ocU.StateListAnimator copydefault(C36517ocU.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return C36517ocU.StateListAnimator.copy$default(stateListAnimator, 2, 0.0f, null, null, 12, null);
        }

        @Override // o.InterfaceC44372sNj
        public void EZpvd(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            this.OLrzqt.AEQbTJ(oKMessage, (Function1<? super C36517ocU.StateListAnimator, C36517ocU.StateListAnimator>) new Function1() { // from class: o.ocV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DownloadAudioManager$download$1.ActionBar.EZpvd((C36517ocU.StateListAnimator) obj);
                }
            });
            this.AEQbTJ.countDown();
        }

        public static final C36517ocU.StateListAnimator EZpvd(C36517ocU.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return C36517ocU.StateListAnimator.copy$default(stateListAnimator, 4, 0.0f, null, null, 12, null);
        }
    }
}
