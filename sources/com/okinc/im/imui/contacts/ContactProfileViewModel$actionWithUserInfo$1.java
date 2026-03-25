package com.okinc.im.imui.contacts;

import com.okinc.im.imui.contacts.ContactProfileViewModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$actionWithUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContactProfileViewModel.UserInfoAction $userInfoAction;
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContactProfileViewModel.UserInfoAction.values().length];
            try {
                iArr[ContactProfileViewModel.UserInfoAction.SHOW_AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactProfileViewModel.UserInfoAction.REMOVE_CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactProfileViewModel.UserInfoAction.BLOCK_CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContactProfileViewModel.UserInfoAction.EDIT_ALIAS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContactProfileViewModel.UserInfoAction.REPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContactProfileViewModel.UserInfoAction.USER_VIP_PROFILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$actionWithUserInfo$1(ContactProfileViewModel contactProfileViewModel, ContactProfileViewModel.UserInfoAction userInfoAction, Continuation<? super ContactProfileViewModel$actionWithUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileViewModel;
        this.$userInfoAction = userInfoAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactProfileViewModel$actionWithUserInfo$1(this.this$0, this.$userInfoAction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileViewModel$actionWithUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object pendingIntent;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            RelationInfo relationInfoAhwBna = this.this$0.AhwBna();
            if (relationInfoAhwBna != null) {
                ContactProfileViewModel.UserInfoAction userInfoAction = this.$userInfoAction;
                ContactProfileViewModel contactProfileViewModel = this.this$0;
                switch (Activity.AEQbTJ[userInfoAction.ordinal()]) {
                    case 1:
                        pendingIntent = new ContactProfileViewModel.Activity.PendingIntent(relationInfoAhwBna);
                        break;
                    case 2:
                        pendingIntent = new ContactProfileViewModel.Activity.StateListAnimator(relationInfoAhwBna);
                        break;
                    case 3:
                        pendingIntent = new ContactProfileViewModel.Activity.C0402Activity(relationInfoAhwBna);
                        break;
                    case 4:
                        pendingIntent = new ContactProfileViewModel.Activity.Application(relationInfoAhwBna);
                        break;
                    case 5:
                        pendingIntent = new ContactProfileViewModel.Activity.Dialog(relationInfoAhwBna);
                        break;
                    case 6:
                        pendingIntent = new ContactProfileViewModel.Activity.VoiceInteractor(relationInfoAhwBna);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                MutableSharedFlow mutableSharedFlow = contactProfileViewModel.AEQbTJ;
                this.label = 1;
                if (mutableSharedFlow.emit(pendingIntent, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
