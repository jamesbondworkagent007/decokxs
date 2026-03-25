package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.adapter.EntityTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.SentimentTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.SpeechTypeAdapter;
import com.amplifyframework.predictions.aws.configuration.InterpretTextConfiguration;
import com.amplifyframework.predictions.models.Entity;
import com.amplifyframework.predictions.models.EntityType;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.KeyPhrase;
import com.amplifyframework.predictions.models.Language;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.models.Sentiment;
import com.amplifyframework.predictions.models.SentimentType;
import com.amplifyframework.predictions.models.SpeechType;
import com.amplifyframework.predictions.models.Syntax;
import com.amplifyframework.predictions.result.InterpretResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AsyncResult;
import o.BatteryManager;
import o.BatteryManagerInternal;
import o.BatteryProperties;
import o.BatteryProperty;
import o.BatteryStatsInternal;
import o.BestClock;
import o.Binder;
import o.Broadcaster;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.HwBlob;
import o.IncidentReportArgs;
import o.InterfaceC52805wZ;
import o.LocalSocket;
import o.NfcF;
import o.PerformanceCollector;
import o.PrintedPdfDocument;
import o.PrinterCapabilitiesInfo;
import o.StorageManager;
import o.StrictMode;
import o.SynchronousResultReceiver;
import o.UntaggedSocketViolation;
import o.VolumeInfo;
import o.WebViewMethodCalledOnWrongThreadViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSComprehendService {
    public static final Companion Companion = new Companion(null);
    private static final int PERCENT = 100;
    private final InterfaceC52805wZ authCredentialsProvider;
    private final LocalSocket client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SentimentType.values().length];
            try {
                iArr[SentimentType.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SentimentType.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SentimentType.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SentimentType.MIXED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchEntities$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16721(Continuation<? super C16721> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchEntities(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchKeyPhrases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16731(Continuation<? super C16731> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchKeyPhrases(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchPredominantLanguage$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16741(Continuation<? super C16741> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchPredominantLanguage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchSentiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16751(Continuation<? super C16751> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchSentiment(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$fetchSyntax$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16761(Continuation<? super C16761> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSComprehendService.this.fetchSyntax(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalSocket getClient() {
        return this.client;
    }

    public AWSComprehendService(@NotNull AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, @NotNull InterfaceC52805wZ interfaceC52805wZ) {
        Intrinsics.checkNotNullParameter(aWSPredictionsPluginConfiguration, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = interfaceC52805wZ;
        this.client = LocalSocket.OLrzqt.copydefault(new Function1<LocalSocket.TaskDescription.Activity, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSComprehendService$client$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalSocket.TaskDescription.Activity activity) {
                invoke2(activity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LocalSocket.TaskDescription.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                activity.OLrzqt(this.this$0.pluginConfiguration.getDefaultRegion());
                activity.KWHzl(this.this$0.authCredentialsProvider);
            }
        });
        this.executor = Executors.newCachedThreadPool();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.service.AWSComprehendService.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSComprehendService$comprehend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super InterpretResult>, Object> {
        final /* synthetic */ String $text;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$text = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return AWSComprehendService.this.new AnonymousClass1(this.$text, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super InterpretResult> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [71=6] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LanguageType languageType;
            Language language;
            Object objFetchKeyPhrases;
            Sentiment sentiment;
            LanguageType languageType2;
            Object objFetchEntities;
            List<KeyPhrase> list;
            Sentiment sentiment2;
            Object objFetchSyntax;
            List<Entity> list2;
            Sentiment sentiment3;
            Language language2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AWSComprehendService aWSComprehendService = AWSComprehendService.this;
                String str = this.$text;
                this.label = 1;
                obj = aWSComprehendService.fetchPredominantLanguage(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
            } else if (i == 2) {
                languageType = (LanguageType) this.L$1;
                language = (Language) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Sentiment sentiment4 = (Sentiment) obj;
                AWSComprehendService aWSComprehendService2 = AWSComprehendService.this;
                String str2 = this.$text;
                this.L$0 = language;
                this.L$1 = languageType;
                this.L$2 = sentiment4;
                this.label = 3;
                objFetchKeyPhrases = aWSComprehendService2.fetchKeyPhrases(str2, languageType, this);
                if (objFetchKeyPhrases != objCopydefault) {
                    return objCopydefault;
                }
                LanguageType languageType3 = languageType;
                sentiment = sentiment4;
                obj = objFetchKeyPhrases;
                languageType2 = languageType3;
                List<KeyPhrase> list3 = (List) obj;
                AWSComprehendService aWSComprehendService3 = AWSComprehendService.this;
                String str3 = this.$text;
                this.L$0 = language;
                this.L$1 = languageType2;
                this.L$2 = sentiment;
                this.L$3 = list3;
                this.label = 4;
                objFetchEntities = aWSComprehendService3.fetchEntities(str3, languageType2, this);
                if (objFetchEntities != objCopydefault) {
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) this.L$3;
                        list = (List) this.L$2;
                        sentiment3 = (Sentiment) this.L$1;
                        language2 = (Language) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        InterpretResult interpretResultBuild = InterpretResult.builder().language(language2).sentiment(sentiment3).keyPhrases(list).entities(list2).syntax((List) obj).build();
                        Intrinsics.checkNotNullExpressionValue(interpretResultBuild, "");
                        return interpretResultBuild;
                    }
                    list = (List) this.L$3;
                    sentiment2 = (Sentiment) this.L$2;
                    languageType2 = (LanguageType) this.L$1;
                    language = (Language) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    List<Entity> list4 = (List) obj;
                    AWSComprehendService aWSComprehendService4 = AWSComprehendService.this;
                    String str4 = this.$text;
                    this.L$0 = language;
                    this.L$1 = sentiment2;
                    this.L$2 = list;
                    this.L$3 = list4;
                    this.label = 5;
                    objFetchSyntax = aWSComprehendService4.fetchSyntax(str4, languageType2, this);
                    if (objFetchSyntax != objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list4;
                    obj = objFetchSyntax;
                    sentiment3 = sentiment2;
                    language2 = language;
                    InterpretResult interpretResultBuild2 = InterpretResult.builder().language(language2).sentiment(sentiment3).keyPhrases(list).entities(list2).syntax((List) obj).build();
                    Intrinsics.checkNotNullExpressionValue(interpretResultBuild2, "");
                    return interpretResultBuild2;
                }
                sentiment = (Sentiment) this.L$2;
                languageType2 = (LanguageType) this.L$1;
                language = (Language) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List<KeyPhrase> list32 = (List) obj;
                AWSComprehendService aWSComprehendService32 = AWSComprehendService.this;
                String str32 = this.$text;
                this.L$0 = language;
                this.L$1 = languageType2;
                this.L$2 = sentiment;
                this.L$3 = list32;
                this.label = 4;
                objFetchEntities = aWSComprehendService32.fetchEntities(str32, languageType2, this);
                if (objFetchEntities != objCopydefault) {
                    return objCopydefault;
                }
                Sentiment sentiment5 = sentiment;
                list = list32;
                obj = objFetchEntities;
                sentiment2 = sentiment5;
                List<Entity> list42 = (List) obj;
                AWSComprehendService aWSComprehendService42 = AWSComprehendService.this;
                String str42 = this.$text;
                this.L$0 = language;
                this.L$1 = sentiment2;
                this.L$2 = list;
                this.L$3 = list42;
                this.label = 5;
                objFetchSyntax = aWSComprehendService42.fetchSyntax(str42, languageType2, this);
                if (objFetchSyntax != objCopydefault) {
                }
            }
            Language language3 = (Language) obj;
            LanguageType value = language3.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            languageType = value;
            AWSComprehendService aWSComprehendService5 = AWSComprehendService.this;
            String str5 = this.$text;
            this.L$0 = language3;
            this.L$1 = languageType;
            this.label = 2;
            Object objFetchSentiment = aWSComprehendService5.fetchSentiment(str5, languageType, this);
            if (objFetchSentiment == objCopydefault) {
                return objCopydefault;
            }
            language = language3;
            obj = objFetchSentiment;
            Sentiment sentiment42 = (Sentiment) obj;
            AWSComprehendService aWSComprehendService22 = AWSComprehendService.this;
            String str22 = this.$text;
            this.L$0 = language;
            this.L$1 = languageType;
            this.L$2 = sentiment42;
            this.label = 3;
            objFetchKeyPhrases = aWSComprehendService22.fetchKeyPhrases(str22, languageType, this);
            if (objFetchKeyPhrases != objCopydefault) {
            }
        }
    }

    public final void comprehend(@NotNull String str, @NotNull Consumer<InterpretResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new AnonymousClass1(str, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSComprehendService.comprehend.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("AWS Comprehend encountered an error while interpreting text.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, o.HwBlob] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPredominantLanguage(String str, Continuation<? super Language> continuation) throws Throwable {
        C16741 c16741;
        if (continuation instanceof C16741) {
            c16741 = (C16741) continuation;
            int i = c16741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16741.label = i - Integer.MIN_VALUE;
            } else {
                c16741 = new C16741(continuation);
            }
        }
        Object objKWHzl = c16741.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16741.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                isResourceConfigured(InterpretTextConfiguration.InterpretType.LANGUAGE);
                LocalSocket localSocket = this.client;
                NfcF.Activity activity = new NfcF.Activity();
                activity.copydefault(str);
                NfcF nfcFAEQbTJ = activity.AEQbTJ();
                c16741.label = 1;
                objKWHzl = localSocket.KWHzl(nfcFAEQbTJ, c16741);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            AsyncResult asyncResult = (AsyncResult) objKWHzl;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            List<HwBlob> listEZpvd = asyncResult.EZpvd();
            if (listEZpvd != null) {
                Iterator<T> it = listEZpvd.iterator();
                while (it.hasNext()) {
                    ?? r0 = (HwBlob) it.next();
                    HwBlob hwBlob = (HwBlob) objectRef.element;
                    Float fAEQbTJ = hwBlob != null ? hwBlob.AEQbTJ() : null;
                    Float fAEQbTJ2 = r0.AEQbTJ();
                    if (objectRef.element == 0) {
                        objectRef.element = r0;
                    } else if (fAEQbTJ != null && fAEQbTJ2 != null) {
                        T t = r0;
                        if (fAEQbTJ2.floatValue() <= fAEQbTJ.floatValue()) {
                            t = (HwBlob) objectRef.element;
                        }
                        objectRef.element = t;
                    }
                }
            }
            T t2 = objectRef.element;
            if (t2 == 0) {
                throw new PredictionsException("AWS Comprehend did not detect any dominant language.", "Please verify the integrity of text being analyzed.");
            }
            Intrinsics.copydefault(t2);
            LanguageType languageTypeFrom = LanguageType.from(((HwBlob) t2).EZpvd());
            T t3 = objectRef.element;
            Intrinsics.copydefault(t3);
            Float fAEQbTJ3 = ((HwBlob) t3).AEQbTJ();
            Feature.Builder builderValue = Language.builder().value(languageTypeFrom);
            Intrinsics.checkNotNullExpressionValue(builderValue, "");
            Language.Builder builder = (Language.Builder) builderValue;
            if (fAEQbTJ3 != null) {
                builder.confidence(fAEQbTJ3.floatValue() * 100);
            }
            Language languageBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(languageBuild, "");
            return languageBuild;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting dominant language.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSentiment(String str, LanguageType languageType, Continuation<? super Sentiment> continuation) throws Throwable {
        C16751 c16751;
        Float fOLrzqt;
        String strOLrzqt;
        if (continuation instanceof C16751) {
            c16751 = (C16751) continuation;
            int i = c16751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16751.label = i - Integer.MIN_VALUE;
            } else {
                c16751 = new C16751(continuation);
            }
        }
        Object objKWHzl = c16751.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16751.label;
        String str2 = "";
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.SENTIMENT)) {
                    return null;
                }
                LocalSocket localSocket = this.client;
                Broadcaster.ActionBar actionBar = new Broadcaster.ActionBar();
                actionBar.copydefault(str);
                SynchronousResultReceiver.Activity activity = SynchronousResultReceiver.EZpvd;
                String languageCode = languageType.getLanguageCode();
                Intrinsics.checkNotNullExpressionValue(languageCode, "");
                actionBar.KWHzl(activity.AEQbTJ(languageCode));
                Broadcaster broadcasterEZpvd = actionBar.EZpvd();
                c16751.label = 1;
                objKWHzl = localSocket.KWHzl(broadcasterEZpvd, c16751);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            Binder binder = (Binder) objKWHzl;
            UntaggedSocketViolation untaggedSocketViolationOLrzqt = binder.OLrzqt();
            WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolationCopydefault = binder.copydefault();
            if (untaggedSocketViolationOLrzqt != null && (strOLrzqt = untaggedSocketViolationOLrzqt.OLrzqt()) != null) {
                str2 = strOLrzqt;
            }
            SentimentType sentimentTypeFromComprehend = SentimentTypeAdapter.fromComprehend(str2);
            int i3 = WhenMappings.$EnumSwitchMapping$0[sentimentTypeFromComprehend.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            fOLrzqt = webViewMethodCalledOnWrongThreadViolationCopydefault != null ? webViewMethodCalledOnWrongThreadViolationCopydefault.EZpvd() : null;
                        } else {
                            fOLrzqt = C56443yFo.OLrzqt(0.0f);
                        }
                    } else if (webViewMethodCalledOnWrongThreadViolationCopydefault != null) {
                        fOLrzqt = webViewMethodCalledOnWrongThreadViolationCopydefault.AEQbTJ();
                    }
                } else if (webViewMethodCalledOnWrongThreadViolationCopydefault != null) {
                    fOLrzqt = webViewMethodCalledOnWrongThreadViolationCopydefault.copydefault();
                }
            } else if (webViewMethodCalledOnWrongThreadViolationCopydefault != null) {
                fOLrzqt = webViewMethodCalledOnWrongThreadViolationCopydefault.OLrzqt();
            }
            if (fOLrzqt != null) {
                return ((Sentiment.Builder) ((Sentiment.Builder) Sentiment.builder().value(sentimentTypeFromComprehend)).confidence(fOLrzqt.floatValue() * 100)).build();
            }
            return null;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting sentiment.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchKeyPhrases(String str, LanguageType languageType, Continuation<? super List<KeyPhrase>> continuation) throws Throwable {
        C16731 c16731;
        if (continuation instanceof C16731) {
            c16731 = (C16731) continuation;
            int i = c16731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16731.label = i - Integer.MIN_VALUE;
            } else {
                c16731 = new C16731(continuation);
            }
        }
        Object objKWHzl = c16731.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16731.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.KEY_PHRASES)) {
                    return null;
                }
                LocalSocket localSocket = this.client;
                BatteryManager.TaskDescription taskDescription = new BatteryManager.TaskDescription();
                taskDescription.AEQbTJ(str);
                SynchronousResultReceiver.Activity activity = SynchronousResultReceiver.EZpvd;
                String languageCode = languageType.getLanguageCode();
                Intrinsics.checkNotNullExpressionValue(languageCode, "");
                taskDescription.copydefault(activity.AEQbTJ(languageCode));
                BatteryManager batteryManagerKWHzl = taskDescription.KWHzl();
                c16731.label = 1;
                objKWHzl = localSocket.KWHzl(batteryManagerKWHzl, c16731);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            BatteryManagerInternal batteryManagerInternal = (BatteryManagerInternal) objKWHzl;
            ArrayList arrayList = new ArrayList();
            List<StrictMode> listEZpvd = batteryManagerInternal.EZpvd();
            if (listEZpvd != null) {
                for (StrictMode strictMode : listEZpvd) {
                    String strKWHzl = strictMode.KWHzl();
                    Float fEZpvd = strictMode.EZpvd();
                    Integer numOLrzqt = strictMode.OLrzqt();
                    if (strKWHzl != null && fEZpvd != null && numOLrzqt != null) {
                        KeyPhrase keyPhraseBuild = ((KeyPhrase.Builder) ((KeyPhrase.Builder) ((KeyPhrase.Builder) ((KeyPhrase.Builder) KeyPhrase.builder().value(strKWHzl)).confidence(fEZpvd.floatValue() * 100)).targetText(strKWHzl)).startIndex(numOLrzqt.intValue())).build();
                        Intrinsics.checkNotNullExpressionValue(keyPhraseBuild, "");
                        arrayList.add(keyPhraseBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting key phrases.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchEntities(String str, LanguageType languageType, Continuation<? super List<Entity>> continuation) throws Throwable {
        C16721 c16721;
        String strEZpvd;
        if (continuation instanceof C16721) {
            c16721 = (C16721) continuation;
            int i = c16721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16721.label = i - Integer.MIN_VALUE;
            } else {
                c16721 = new C16721(continuation);
            }
        }
        Object objCopydefault = c16721.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = c16721.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.ENTITIES)) {
                    return null;
                }
                LocalSocket localSocket = this.client;
                BatteryProperty.ActionBar actionBar = new BatteryProperty.ActionBar();
                actionBar.OLrzqt(str);
                SynchronousResultReceiver.Activity activity = SynchronousResultReceiver.EZpvd;
                String languageCode = languageType.getLanguageCode();
                Intrinsics.checkNotNullExpressionValue(languageCode, "");
                actionBar.EZpvd(activity.AEQbTJ(languageCode));
                BatteryProperty batteryPropertyOLrzqt = actionBar.OLrzqt();
                c16721.label = 1;
                objCopydefault = localSocket.copydefault(batteryPropertyOLrzqt, c16721);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            BatteryProperties batteryProperties = (BatteryProperties) objCopydefault;
            ArrayList arrayList = new ArrayList();
            List<IncidentReportArgs> listAEQbTJ = batteryProperties.AEQbTJ();
            if (listAEQbTJ != null) {
                for (IncidentReportArgs incidentReportArgs : listAEQbTJ) {
                    PerformanceCollector performanceCollectorGEmmrt = incidentReportArgs.gEmmrt();
                    if (performanceCollectorGEmmrt == null || (strEZpvd = performanceCollectorGEmmrt.EZpvd()) == null) {
                        strEZpvd = "";
                    }
                    EntityType entityTypeFromComprehend = EntityTypeAdapter.fromComprehend(strEZpvd);
                    Float fCopydefault = incidentReportArgs.copydefault();
                    String strOLrzqt = incidentReportArgs.OLrzqt();
                    Integer numEZpvd = incidentReportArgs.EZpvd();
                    if (fCopydefault != null && strOLrzqt != null && numEZpvd != null) {
                        Entity entityBuild = ((Entity.Builder) ((Entity.Builder) ((Entity.Builder) ((Entity.Builder) Entity.builder().value(entityTypeFromComprehend)).confidence(fCopydefault.floatValue() * 100)).targetText(strOLrzqt)).startIndex(numEZpvd.intValue())).build();
                        Intrinsics.checkNotNullExpressionValue(entityBuild, "");
                        arrayList.add(entityBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting entities.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSyntax(String str, LanguageType languageType, Continuation<? super List<Syntax>> continuation) throws Throwable {
        C16761 c16761;
        String strOLrzqt;
        VolumeInfo volumeInfoCopydefault;
        if (continuation instanceof C16761) {
            c16761 = (C16761) continuation;
            int i = c16761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16761.label = i - Integer.MIN_VALUE;
            } else {
                c16761 = new C16761(continuation);
            }
        }
        Object objAEQbTJ = c16761.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16761.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (!isResourceConfigured(InterpretTextConfiguration.InterpretType.SYNTAX)) {
                    return null;
                }
                LocalSocket localSocket = this.client;
                BestClock.Application application = new BestClock.Application();
                application.EZpvd(str);
                PrinterCapabilitiesInfo.ActionBar actionBar = PrinterCapabilitiesInfo.OLrzqt;
                String languageCode = languageType.getLanguageCode();
                Intrinsics.checkNotNullExpressionValue(languageCode, "");
                application.AEQbTJ(actionBar.EZpvd(languageCode));
                BestClock bestClockKWHzl = application.KWHzl();
                c16761.label = 1;
                objAEQbTJ = localSocket.AEQbTJ(bestClockKWHzl, c16761);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            BatteryStatsInternal batteryStatsInternal = (BatteryStatsInternal) objAEQbTJ;
            ArrayList arrayList = new ArrayList();
            List<PrintedPdfDocument> listCopydefault = batteryStatsInternal.copydefault();
            if (listCopydefault != null) {
                for (PrintedPdfDocument printedPdfDocument : listCopydefault) {
                    StorageManager storageManagerAEQbTJ = printedPdfDocument.AEQbTJ();
                    if (storageManagerAEQbTJ == null || (volumeInfoCopydefault = storageManagerAEQbTJ.copydefault()) == null || (strOLrzqt = volumeInfoCopydefault.OLrzqt()) == null) {
                        strOLrzqt = "";
                    }
                    SpeechType speechTypeFromComprehend = SpeechTypeAdapter.fromComprehend(strOLrzqt);
                    StorageManager storageManagerAEQbTJ2 = printedPdfDocument.AEQbTJ();
                    Float fOLrzqt = storageManagerAEQbTJ2 != null ? storageManagerAEQbTJ2.OLrzqt() : null;
                    String strEZpvd = printedPdfDocument.EZpvd();
                    Integer numOLrzqt = printedPdfDocument.OLrzqt();
                    if (fOLrzqt != null && strEZpvd != null && numOLrzqt != null) {
                        Syntax syntaxBuild = ((Syntax.Builder) ((Syntax.Builder) ((Syntax.Builder) ((Syntax.Builder) ((Syntax.Builder) Syntax.builder().id(String.valueOf(printedPdfDocument.KWHzl()))).value(speechTypeFromComprehend)).confidence(fOLrzqt.floatValue() * 100)).targetText(strEZpvd)).startIndex(numOLrzqt.intValue())).build();
                        Intrinsics.checkNotNullExpressionValue(syntaxBuild, "");
                        arrayList.add(syntaxBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("AWS Comprehend encountered an error while detecting syntax.", e, "See attached exception for more details.");
        }
    }

    private final boolean isResourceConfigured(InterpretTextConfiguration.InterpretType interpretType) {
        InterpretTextConfiguration.InterpretType type = this.pluginConfiguration.getInterpretTextConfiguration().getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        return InterpretTextConfiguration.InterpretType.ALL == type || type == interpretType;
    }

    private final <T> void execute(final Function1<? super Continuation<? super T>, ? extends Object> function1, final Function1<? super Throwable, ? extends PredictionsException> function12, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.service.AWSComprehendService$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AWSComprehendService.execute$lambda$9(function12, consumer2, function1, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$9(Function1 function1, Consumer consumer, Function1 function12, Consumer consumer2) {
        PredictionsException predictionsException;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new AWSComprehendService$execute$1$1(function12, consumer2, null), 1, null);
        } catch (Throwable th) {
            if (th instanceof PredictionsException) {
                predictionsException = th;
            } else {
                predictionsException = (PredictionsException) function1.invoke(th);
            }
            consumer.accept(predictionsException);
        }
    }
}
