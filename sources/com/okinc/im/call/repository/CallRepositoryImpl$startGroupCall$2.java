package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallRequest;
import com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C33129mqd;
import o.C35235nrW;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$startGroupCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ List<String> $targetUids;
    Object L$0;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$startGroupCall$2(C35235nrW c35235nrW, String str, List<String> list, Continuation<? super CallRepositoryImpl$startGroupCall$2> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
        this.$groupId = str;
        this.$targetUids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$startGroupCall$2(this.this$0, this.$groupId, this.$targetUids, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC35226nrN<CallSessionV2>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return ((CallRepositoryImpl$startGroupCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String appId;
        String channelName;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strKWHzl = C44157sFk.KWHzl();
                if (strKWHzl != null) {
                    InHouseIMGroupService inHouseIMGroupService = this.this$0.gEmmrt;
                    StartGroupVoiceCallRequest startGroupVoiceCallRequest = new StartGroupVoiceCallRequest(this.$groupId, this.$targetUids);
                    this.L$0 = strKWHzl;
                    this.label = 1;
                    Object objStartGroupVoiceCall = inHouseIMGroupService.startGroupVoiceCall(startGroupVoiceCallRequest, this);
                    if (objStartGroupVoiceCall == objCopydefault) {
                        return objCopydefault;
                    }
                    str = strKWHzl;
                    obj = objStartGroupVoiceCall;
                } else {
                    return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor("User not logged in", null, 2, null));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str2;
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 5001) {
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.Activity.AEQbTJ);
            }
            StartGroupVoiceCallResponse startGroupVoiceCallResponse = (StartGroupVoiceCallResponse) responseData.getData();
            String token = startGroupVoiceCallResponse != null ? startGroupVoiceCallResponse.getToken() : null;
            if (token != null && !StringsKt__StringsKt.fARcdN((CharSequence) token) && (appId = startGroupVoiceCallResponse.getAppId()) != null && !StringsKt__StringsKt.fARcdN((CharSequence) appId) && (channelName = startGroupVoiceCallResponse.getChannelName()) != null && !StringsKt__StringsKt.fARcdN((CharSequence) channelName)) {
                CallSessionV2.Companion companion = CallSessionV2.Companion;
                String str3 = this.$groupId;
                String token2 = startGroupVoiceCallResponse.getToken();
                Intrinsics.copydefault((Object) token2);
                String appId2 = startGroupVoiceCallResponse.getAppId();
                Intrinsics.copydefault((Object) appId2);
                String channelName2 = startGroupVoiceCallResponse.getChannelName();
                Intrinsics.copydefault((Object) channelName2);
                Long agoraUid = startGroupVoiceCallResponse.getAgoraUid();
                return AbstractC35226nrN.Companion.copydefault(companion.copydefault(str3, str, token2, appId2, channelName2, agoraUid != null ? C33129mqd.AhwBna(agoraUid) : 1));
            }
            return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Invalid response"));
        } catch (OKServerException e) {
            if (e.getCode() == 403) {
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.TaskStackBuilder.EZpvd);
            }
            AbstractC35226nrN.TaskDescription taskDescription = AbstractC35226nrN.Companion;
            String message = e.getMessage();
            return taskDescription.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor(message != null ? message : "Failed", e));
        } catch (Exception e2) {
            AbstractC35226nrN.TaskDescription taskDescription2 = AbstractC35226nrN.Companion;
            String message2 = e2.getMessage();
            return taskDescription2.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor(message2 != null ? message2 : "Failed", e2));
        }
    }
}
