package com.okinc.im.imui.group.join;

import android.content.Context;
import com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C33764nEz;
import o.C34168nTy;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nTQ;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupEntryHelper$check$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ String $channelId;
    final /* synthetic */ boolean $checkHavePayMode;
    final /* synthetic */ CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus $checkStatus;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $invitationId;
    int label;
    final /* synthetic */ C34168nTy this$0;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.values().length];
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.COR_RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.MISSING_PAY_FUNCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.GROUP_DISBANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.BEING_KICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.PENDING_APPROVAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.JOIN_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.VIEW_GROUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus.Status.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupEntryHelper$check$4$1(CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus checkIsAllGroupInvitationStatus, C34168nTy c34168nTy, Context context, boolean z, String str, String str2, Function0<Unit> function0, Continuation<? super JoinGroupEntryHelper$check$4$1> continuation) {
        super(2, continuation);
        this.$checkStatus = checkIsAllGroupInvitationStatus;
        this.this$0 = c34168nTy;
        this.$context = context;
        this.$checkHavePayMode = z;
        this.$invitationId = str;
        this.$channelId = str2;
        this.$callback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupEntryHelper$check$4$1(this.$checkStatus, this.this$0, this.$context, this.$checkHavePayMode, this.$invitationId, this.$channelId, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupEntryHelper$check$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Long lKWHzl = null;
            switch (ActionBar.EZpvd[this.$checkStatus.copydefault().ordinal()]) {
                case 1:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Show COR restricted dialog", null, 2, null);
                    this.this$0.KWHzl(this.$context);
                    break;
                case 2:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Missing pay function, checkHavePayMode=" + this.$checkHavePayMode, null, 2, null);
                    if (this.$checkHavePayMode) {
                        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Missing pay function dialog", null, 2, null);
                        this.this$0.copydefault(this.$context);
                    }
                    break;
                case 3:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Group disbanded, showing dialog", null, 2, null);
                    this.this$0.EZpvd(this.$context);
                    break;
                case 4:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: User being kicked, showing dialog", null, 2, null);
                    this.this$0.AEQbTJ(this.$context);
                    break;
                case 5:
                case 6:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Opening JoinGroupActivity for status=" + this.$checkStatus.copydefault(), null, 2, null);
                    nTQ.Application application = nTQ.Companion;
                    Context context = this.$context;
                    String str = this.$invitationId;
                    Long lKWHzl2 = this.$checkStatus.KWHzl();
                    if (lKWHzl2 == null) {
                        String str2 = this.$channelId;
                        if (str2 != null) {
                            lKWHzl = C56443yFo.KWHzl(C33129mqd.valueOf(str2));
                        }
                    } else {
                        lKWHzl = lKWHzl2;
                    }
                    this.$context.startActivity(application.AEQbTJ(context, str, lKWHzl));
                    break;
                case 7:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Jumping to group conversation", null, 2, null);
                    OKConversation.Companion companion = OKConversation.Companion;
                    OKConversationType oKConversationType = OKConversationType.GROUP;
                    Long lKWHzl3 = this.$checkStatus.KWHzl();
                    if ((lKWHzl3 == null || (string = lKWHzl3.toString()) == null) && (string = this.$channelId) == null) {
                        string = "";
                    }
                    C33764nEz.OLrzqt.copydefault(companion.AEQbTJ(oKConversationType, string, ""), this.$context, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : null, (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
                    break;
                case 8:
                    C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Unknown status, no action taken", null, 2, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Function0<Unit> function0 = this.$callback;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
