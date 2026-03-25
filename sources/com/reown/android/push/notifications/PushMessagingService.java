package com.reown.android.push.notifications;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.reown.android.Core;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.C56444yFp;
import o.C56524yIo;
import o.C59449zhJ;
import o.C60022zty;
import o.C60058zuh;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.bouncycastle.util.encoders.Base64;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public abstract class PushMessagingService extends FirebaseMessagingService {
    public static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_BLOB = "blob";

    @Deprecated
    public static final String KEY_BODY = "body";

    @Deprecated
    public static final String KEY_FLAGS = "flags";

    @Deprecated
    public static final String KEY_MESSAGE = "message";

    @Deprecated
    public static final String KEY_TAG = "tag";

    @Deprecated
    public static final String KEY_TITLE = "title";

    @Deprecated
    public static final String KEY_TOPIC = "topic";
    public final InterfaceC56387yDm decryptMessageUseCases$delegate = C56392yDr.copydefault(new Function0<Map<String, ? extends DecryptMessageUseCaseInterface>>() { // from class: com.reown.android.push.notifications.PushMessagingService$decryptMessageUseCases$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'java.util.Map<java.lang.String, com.reown.android.push.notifications.DecryptMessageUseCaseInterface>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends DecryptMessageUseCaseInterface> invoke() {
            C60022zty c60022ztyOLrzqt = KoinApplicationKt.getWcKoinApp().OLrzqt();
            return C56424yEw.values((Map) c60022ztyOLrzqt.EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Map.class), C60058zuh.OLrzqt(AndroidCommonDITags.DECRYPT_USE_CASES), null));
        }
    });
    public final InterfaceC56387yDm pushMessagesRepository$delegate = C56392yDr.copydefault(new Function0<PushMessagesRepository>() { // from class: com.reown.android.push.notifications.PushMessagingService$pushMessagesRepository$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PushMessagesRepository invoke() {
            return (PushMessagesRepository) KoinApplicationKt.getWcKoinApp().OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(PushMessagesRepository.class), null, null);
        }
    });

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessageFlags.values().length];
            try {
                iArr[MessageFlags.ENCRYPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageFlags.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageFlags.NOTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageFlags.SIGN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageFlags.AUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract void newToken(@NotNull String str);

    public abstract void onDefaultBehavior(@NotNull RemoteMessage remoteMessage);

    public abstract void onError(@NotNull Throwable th, @NotNull RemoteMessage remoteMessage);

    public abstract void onMessage(@NotNull Core.Model.Message message, @NotNull RemoteMessage remoteMessage);

    public abstract void registeringFailed(@NotNull String str, @NotNull Throwable th);

    public final Map<String, DecryptMessageUseCaseInterface> getDecryptMessageUseCases() {
        return (Map) this.decryptMessageUseCases$delegate.getValue();
    }

    public final PushMessagesRepository getPushMessagesRepository() {
        return (PushMessagesRepository) this.pushMessagesRepository$delegate.getValue();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        super.onNewToken(str);
        newToken(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "");
        super.onMessageReceived(remoteMessage);
        try {
            if (isLegacyNotification(remoteMessage)) {
                MessageFlags.Companion companion = MessageFlags.Companion;
                Map<String, String> data = remoteMessage.getData();
                Intrinsics.checkNotNullExpressionValue(data, "");
                Object objEZpvd = C56424yEw.EZpvd((Map<String, ? extends Object>) ((Map<Object, ? extends V>) data), KEY_FLAGS);
                Intrinsics.checkNotNullExpressionValue(objEZpvd, "");
                int i = WhenMappings.$EnumSwitchMapping$0[companion.findMessageFlag((String) objEZpvd).ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    prepareSimpleNotification(remoteMessage);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                int id = Tags.NOTIFY_MESSAGE.getId();
                Map<String, String> data2 = remoteMessage.getData();
                Intrinsics.checkNotNullExpressionValue(data2, "");
                Object objEZpvd2 = C56424yEw.EZpvd((Map<String, ? extends Object>) ((Map<Object, ? extends V>) data2), KEY_BLOB);
                Intrinsics.checkNotNullExpressionValue(objEZpvd2, "");
                decryptNotification(remoteMessage, String.valueOf(id), (String) objEZpvd2);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            if (isEncryptedNotification(remoteMessage)) {
                List<Integer> notificationTags = getPushMessagesRepository().getNotificationTags();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(notificationTags, 10));
                Iterator<T> it = notificationTags.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                }
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Map<String, String> data3 = remoteMessage.getData();
                    Intrinsics.checkNotNullExpressionValue(data3, "");
                    if (Intrinsics.EZpvd((String) obj, C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) data3), "tag"))) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList<String> arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                for (String strValueOf : arrayList2) {
                    if (Intrinsics.EZpvd((Object) strValueOf, (Object) String.valueOf(Tags.SESSION_REQUEST.getId()))) {
                        strValueOf = String.valueOf(Tags.SESSION_PROPOSE.getId());
                    }
                    arrayList3.add(strValueOf);
                }
                for (String str : arrayList3) {
                    Map<String, String> data4 = remoteMessage.getData();
                    Intrinsics.checkNotNullExpressionValue(data4, "");
                    Object objEZpvd3 = C56424yEw.EZpvd((Map<String, ? extends Object>) ((Map<Object, ? extends V>) data4), "message");
                    Intrinsics.checkNotNullExpressionValue(objEZpvd3, "");
                    decryptNotification(remoteMessage, str, (String) objEZpvd3);
                }
                return;
            }
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            if (notification != null && isValid(notification)) {
                RemoteMessage.Notification notification2 = remoteMessage.getNotification();
                if (notification2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String title = notification2.getTitle();
                Intrinsics.copydefault((Object) title);
                String body = notification2.getBody();
                Intrinsics.copydefault((Object) body);
                onMessage(new Core.Model.Message.Simple(title, body), remoteMessage);
                Unit unit3 = Unit.INSTANCE;
                return;
            }
            onDefaultBehavior(remoteMessage);
            Unit unit4 = Unit.INSTANCE;
        } catch (Exception e) {
            onError(e, remoteMessage);
            Unit unit5 = Unit.INSTANCE;
        }
    }

    public final boolean isLegacyNotification(RemoteMessage remoteMessage) {
        return remoteMessage.getData().containsKey(KEY_TOPIC) && remoteMessage.getData().containsKey(KEY_BLOB) && remoteMessage.getData().containsKey(KEY_FLAGS);
    }

    public final boolean isEncryptedNotification(RemoteMessage remoteMessage) {
        return remoteMessage.getData().containsKey(KEY_TOPIC) && remoteMessage.getData().containsKey("tag") && remoteMessage.getData().containsKey("message");
    }

    /* JADX INFO: renamed from: com.reown.android.push.notifications.PushMessagingService$decryptNotification$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $encryptedMessage;
        public final /* synthetic */ String $tag;
        public final /* synthetic */ RemoteMessage $this_decryptNotification;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, RemoteMessage remoteMessage, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$tag = str;
            this.$this_decryptNotification = remoteMessage;
            this.$encryptedMessage = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PushMessagingService.this.new AnonymousClass1(this.$tag, this.$this_decryptNotification, this.$encryptedMessage, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.push.notifications.PushMessagingService$decryptNotification$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $encryptedMessage;
            public final /* synthetic */ String $tag;
            public final /* synthetic */ RemoteMessage $this_decryptNotification;
            public int label;
            public final /* synthetic */ PushMessagingService this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07151(PushMessagingService pushMessagingService, String str, RemoteMessage remoteMessage, String str2, Continuation<? super C07151> continuation) {
                super(2, continuation);
                this.this$0 = pushMessagingService;
                this.$tag = str;
                this.$this_decryptNotification = remoteMessage;
                this.$encryptedMessage = str2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07151(this.this$0, this.$tag, this.$this_decryptNotification, this.$encryptedMessage, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    DecryptMessageUseCaseInterface decryptMessageUseCaseInterface = (DecryptMessageUseCaseInterface) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) this.this$0.getDecryptMessageUseCases()), this.$tag);
                    Map<String, String> data = this.$this_decryptNotification.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "");
                    Object objEZpvd = C56424yEw.EZpvd((Map<String, ? extends Object>) ((Map<Object, ? extends V>) data), PushMessagingService.KEY_TOPIC);
                    Intrinsics.checkNotNullExpressionValue(objEZpvd, "");
                    String str = (String) objEZpvd;
                    String str2 = this.$encryptedMessage;
                    final PushMessagingService pushMessagingService = this.this$0;
                    final RemoteMessage remoteMessage = this.$this_decryptNotification;
                    Function1<Core.Model.Message, Unit> function1 = new Function1<Core.Model.Message, Unit>() { // from class: com.reown.android.push.notifications.PushMessagingService.decryptNotification.1.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Message message) {
                            invoke2(message);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Core.Model.Message message) {
                            Intrinsics.checkNotNullParameter(message, "");
                            pushMessagingService.onMessage(message, remoteMessage);
                        }
                    };
                    final PushMessagingService pushMessagingService2 = this.this$0;
                    final RemoteMessage remoteMessage2 = this.$this_decryptNotification;
                    Function1<Throwable, Unit> function12 = new Function1<Throwable, Unit>() { // from class: com.reown.android.push.notifications.PushMessagingService.decryptNotification.1.1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th) {
                            Intrinsics.checkNotNullParameter(th, "");
                            pushMessagingService2.onError(th, remoteMessage2);
                        }
                    };
                    this.label = 1;
                    if (decryptMessageUseCaseInterface.decryptNotification(str, str2, function1, function12, this) == objCopydefault) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07151 c07151 = new C07151(PushMessagingService.this, this.$tag, this.$this_decryptNotification, this.$encryptedMessage, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07151, this) == objCopydefault) {
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

    public final void decryptNotification(RemoteMessage remoteMessage, String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(str, remoteMessage, str2, null), 3, null);
    }

    public final void prepareSimpleNotification(RemoteMessage remoteMessage) {
        try {
            Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "");
            byte[] bArrDecode = Base64.decode((String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) data), KEY_BLOB));
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            JSONObject jSONObject = new JSONObject(C59449zhJ.copydefault(bArrDecode));
            if (!jSONObject.has("title") || !jSONObject.has("body")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String string = jSONObject.getString("title");
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jSONObject.getString("body");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                onMessage(new Core.Model.Message.Simple(string, string2), remoteMessage);
                return;
            }
            throw new IllegalArgumentException("Invalid message format");
        } catch (Exception e) {
            onError(e, remoteMessage);
        }
    }

    public final boolean isValid(RemoteMessage.Notification notification) {
        return (notification == null || notification.getTitle() == null || notification.getBody() == null) ? false : true;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MessageFlags {
        public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        public static final /* synthetic */ MessageFlags[] $VALUES;
        public static final Companion Companion;
        public static final MessageFlags ENCRYPTED;
        public static final MessageFlags NOTIFY;
        public final int value;
        public static final MessageFlags SIGN = new MessageFlags("SIGN", 0, 2);
        public static final MessageFlags AUTH = new MessageFlags("AUTH", 1, 4);
        public static final MessageFlags CHAT = new MessageFlags("CHAT", 2, 8);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ MessageFlags[] $values() {
            return new MessageFlags[]{SIGN, AUTH, CHAT, NOTIFY, ENCRYPTED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MessageFlags> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static MessageFlags valueOf(String str) {
            return (MessageFlags) Enum.valueOf(MessageFlags.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static MessageFlags[] values() {
            return (MessageFlags[]) $VALUES.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        public MessageFlags(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            MessageFlags messageFlags = new MessageFlags("NOTIFY", 3, 16);
            NOTIFY = messageFlags;
            ENCRYPTED = new MessageFlags("ENCRYPTED", 4, messageFlags.value + 1);
            MessageFlags[] messageFlagsArr$values = $values();
            $VALUES = messageFlagsArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(messageFlagsArr$values);
            Companion = new Companion(null);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.push.notifications.PushMessagingService.MessageFlags.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final MessageFlags findMessageFlag(@NotNull String str) {
                MessageFlags messageFlags;
                Intrinsics.checkNotNullParameter(str, "");
                MessageFlags[] messageFlagsArrValues = MessageFlags.values();
                int length = messageFlagsArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        messageFlags = null;
                        break;
                    }
                    messageFlags = messageFlagsArrValues[i];
                    if (messageFlags.getValue() == Integer.parseInt(str)) {
                        break;
                    }
                    i++;
                }
                if (messageFlags != null) {
                    return messageFlags;
                }
                throw new IllegalArgumentException("Invalid value for MessageFlags");
            }
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.push.notifications.PushMessagingService.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
