package com.okinc.im.usecase.chatsettings;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35767oCy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC35180nqU;
import o.InterfaceC44177sGd;
import o.sHZ;

/* JADX INFO: loaded from: classes18.dex */
public final class FetchChatSettingsUseCase$getPrivacySettings$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChatSettingsResult>, Object> {
    int label;
    final /* synthetic */ C35767oCy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchChatSettingsUseCase$getPrivacySettings$1$result$1(C35767oCy c35767oCy, Continuation<? super FetchChatSettingsUseCase$getPrivacySettings$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = c35767oCy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchChatSettingsUseCase$getPrivacySettings$1$result$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChatSettingsResult> continuation) {
        return ((FetchChatSettingsUseCase$getPrivacySettings$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sHZ shzAEQbTJ;
        InterfaceC44177sGd interfaceC44177sGdAEQbTJ;
        Boolean boolKWHzl;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = this.this$0.EZpvd;
            if (interfaceC35180nqU != null && (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) != null && (interfaceC44177sGdAEQbTJ = shzAEQbTJ.AEQbTJ()) != null) {
                this.label = 1;
                obj = interfaceC44177sGdAEQbTJ.KWHzl(false, (Continuation<? super UserInfo>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            throw new NullPointerException("User data is null");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        UserInfo userInfo = (UserInfo) obj;
        if (userInfo != null) {
            String allowContactDiscovery = userInfo.getAllowContactDiscovery();
            boolean z = (allowContactDiscovery == null || (intOrNull3 = StringsKt__StringNumberConversionsKt.toIntOrNull(allowContactDiscovery)) == null || intOrNull3.intValue() != 0) ? false : true;
            String qrSearchStatus = userInfo.getQrSearchStatus();
            boolean z2 = (qrSearchStatus == null || (intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(qrSearchStatus)) == null || intOrNull2.intValue() != 0) ? false : true;
            String groupStatus = userInfo.getGroupStatus();
            boolean z3 = (groupStatus == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(groupStatus)) == null || intOrNull.intValue() != 0) ? false : true;
            Integer allowInAppNotification = userInfo.getAllowInAppNotification();
            boolean z4 = allowInAppNotification != null && allowInAppNotification.intValue() == 1;
            Integer allowChatViaProfile = userInfo.getAllowChatViaProfile();
            if (allowChatViaProfile != null) {
                boolKWHzl = C56443yFo.KWHzl(allowChatViaProfile.intValue() == 1);
            } else {
                boolKWHzl = null;
            }
            return new ChatSettingsResult(z, z2, z3, z4, boolKWHzl);
        }
        throw new NullPointerException("User data is null");
    }
}
