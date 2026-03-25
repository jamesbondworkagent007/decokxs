package com.reown.android.push.client;

import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import com.reown.android.push.PushInterface;
import com.reown.android.push.network.PushService;
import com.reown.android.push.network.model.PushBody;
import com.reown.android.push.network.model.PushResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C60022zty;
import o.C60058zuh;
import o.InterfaceC56387yDm;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class PushClient implements PushInterface {
    public static final String SUCCESS_STATUS = "SUCCESS";
    public static final PushClient INSTANCE = new PushClient();
    public static final InterfaceC56387yDm pushService$delegate = C56392yDr.copydefault(new Function0<PushService>() { // from class: com.reown.android.push.client.PushClient$pushService$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PushService invoke() {
            return (PushService) KoinApplicationKt.getWcKoinApp().OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(PushService.class), null, null);
        }
    });
    public static final InterfaceC56387yDm clientId$delegate = C56392yDr.copydefault(new Function0<String>() { // from class: com.reown.android.push.client.PushClient$clientId$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            C60022zty c60022ztyOLrzqt = KoinApplicationKt.getWcKoinApp().OLrzqt();
            return (String) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID), null);
        }
    });
    public static final InterfaceC56387yDm projectId$delegate = C56392yDr.copydefault(new Function0<ProjectId>() { // from class: com.reown.android.push.client.PushClient$projectId$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ProjectId invoke() {
            return (ProjectId) KoinApplicationKt.getWcKoinApp().OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(ProjectId.class), null, null);
        }
    });
    public static final InterfaceC56387yDm pushMessagesRepository$delegate = C56392yDr.copydefault(new Function0<PushMessagesRepository>() { // from class: com.reown.android.push.client.PushClient$pushMessagesRepository$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PushMessagesRepository invoke() {
            return (PushMessagesRepository) KoinApplicationKt.getWcKoinApp().OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(PushMessagesRepository.class), null, null);
        }
    });

    public final PushService getPushService() {
        return (PushService) pushService$delegate.getValue();
    }

    @Override // com.reown.android.push.PushInterface
    public String getClientId() {
        return (String) clientId$delegate.getValue();
    }

    public final ProjectId getProjectId() {
        return (ProjectId) projectId$delegate.getValue();
    }

    public final PushMessagesRepository getPushMessagesRepository() {
        return (PushMessagesRepository) pushMessagesRepository$delegate.getValue();
    }

    @Override // com.reown.android.push.PushInterface
    public void register(@NotNull String str, boolean z, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            getPushMessagesRepository().enablePushNotifications();
        }
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), Dispatchers.getIO(), null, new AnonymousClass1(new PushBody(getClientId(), str, null, Boolean.valueOf(z), 4, null), function0, function1, null), 2, null);
    }

    /* JADX INFO: renamed from: com.reown.android.push.client.PushClient$register$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PushBody $body;
        public final /* synthetic */ Function1<Throwable, Unit> $onError;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PushBody pushBody, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$body = pushBody;
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$body, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.push.client.PushClient$register$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PushBody $body;
            public final /* synthetic */ Function1<Throwable, Unit> $onError;
            public final /* synthetic */ Function0<Unit> $onSuccess;
            public int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07131(PushBody pushBody, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Continuation<? super C07131> continuation) {
                super(2, continuation);
                this.$body = pushBody;
                this.$onSuccess = function0;
                this.$onError = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07131(this.$body, this.$onSuccess, this.$onError, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                PushResponse.Error error;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        PushClient pushClient = PushClient.INSTANCE;
                        PushService pushService = pushClient.getPushService();
                        String value = pushClient.getProjectId().getValue();
                        String clientId = pushClient.getClientId();
                        PushBody pushBody = this.$body;
                        this.label = 1;
                        obj = pushService.register(value, clientId, pushBody, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    Response response = (Response) obj;
                    if (response.isSuccessful() && response.body() != null) {
                        Object objBody = response.body();
                        Intrinsics.copydefault(objBody);
                        if (Intrinsics.EZpvd((Object) ((PushResponse) objBody).getStatus(), (Object) "SUCCESS")) {
                            this.$onSuccess.invoke();
                        } else {
                            Function1<Throwable, Unit> function1 = this.$onError;
                            Object objBody2 = response.body();
                            Intrinsics.copydefault(objBody2);
                            List<PushResponse.Error> errors = ((PushResponse) objBody2).getErrors();
                            if (errors != null && (error = (PushResponse.Error) CollectionsKt___CollectionsKt.AuCTelauCTel(errors)) != null) {
                                message = error.getMessage();
                            }
                            function1.invoke(new IllegalArgumentException(message));
                        }
                    } else {
                        Function1<Throwable, Unit> function12 = this.$onError;
                        ResponseBody responseBodyErrorBody = response.errorBody();
                        function12.invoke(new IllegalArgumentException(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null));
                    }
                } catch (Exception e) {
                    this.$onError.invoke(e);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07131 c07131 = new C07131(this.$body, this.$onSuccess, this.$onError, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07131, this) == objCopydefault) {
                    return objCopydefault;
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

    /* JADX INFO: renamed from: com.reown.android.push.client.PushClient$unregister$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C18371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onError;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18371(Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Continuation<? super C18371> continuation) {
            super(2, continuation);
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C18371(this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.push.client.PushClient$unregister$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Throwable, Unit> $onError;
            public final /* synthetic */ Function0<Unit> $onSuccess;
            public int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07141(Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Continuation<? super C07141> continuation) {
                super(2, continuation);
                this.$onSuccess = function0;
                this.$onError = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07141(this.$onSuccess, this.$onError, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                PushResponse.Error error;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        PushClient pushClient = PushClient.INSTANCE;
                        PushService pushService = pushClient.getPushService();
                        String value = pushClient.getProjectId().getValue();
                        String clientId = pushClient.getClientId();
                        this.label = 1;
                        obj = pushService.unregister(value, clientId, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    Response response = (Response) obj;
                    if (response.isSuccessful() && response.body() != null) {
                        Object objBody = response.body();
                        Intrinsics.copydefault(objBody);
                        if (Intrinsics.EZpvd((Object) ((PushResponse) objBody).getStatus(), (Object) "SUCCESS")) {
                            this.$onSuccess.invoke();
                        } else {
                            Function1<Throwable, Unit> function1 = this.$onError;
                            Object objBody2 = response.body();
                            Intrinsics.copydefault(objBody2);
                            List<PushResponse.Error> errors = ((PushResponse) objBody2).getErrors();
                            if (errors != null && (error = (PushResponse.Error) CollectionsKt___CollectionsKt.AuCTelauCTel(errors)) != null) {
                                message = error.getMessage();
                            }
                            function1.invoke(new IllegalArgumentException(message));
                        }
                    } else {
                        Function1<Throwable, Unit> function12 = this.$onError;
                        ResponseBody responseBodyErrorBody = response.errorBody();
                        function12.invoke(new IllegalArgumentException(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null));
                    }
                } catch (Exception e) {
                    this.$onError.invoke(e);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07141 c07141 = new C07141(this.$onSuccess, this.$onError, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07141, this) == objCopydefault) {
                    return objCopydefault;
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

    @Override // com.reown.android.push.PushInterface
    public void unregister(@NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), Dispatchers.getIO(), null, new C18371(function0, function1, null), 2, null);
    }
}
