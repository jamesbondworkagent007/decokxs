package com.amplifyframework.predictions.aws.service;

import android.graphics.RectF;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.adapter.EmotionTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.GenderBinaryTypeAdapter;
import com.amplifyframework.predictions.aws.adapter.RekognitionResultTransformers;
import com.amplifyframework.predictions.aws.configuration.IdentifyEntitiesConfiguration;
import com.amplifyframework.predictions.models.AgeRange;
import com.amplifyframework.predictions.models.BinaryFeature;
import com.amplifyframework.predictions.models.Celebrity;
import com.amplifyframework.predictions.models.CelebrityDetails;
import com.amplifyframework.predictions.models.Emotion;
import com.amplifyframework.predictions.models.EmotionType;
import com.amplifyframework.predictions.models.EntityDetails;
import com.amplifyframework.predictions.models.EntityMatch;
import com.amplifyframework.predictions.models.Gender;
import com.amplifyframework.predictions.models.Label;
import com.amplifyframework.predictions.models.LabelType;
import com.amplifyframework.predictions.models.Landmark;
import com.amplifyframework.predictions.models.Pose;
import com.amplifyframework.predictions.result.IdentifyCelebritiesResult;
import com.amplifyframework.predictions.result.IdentifyEntitiesResult;
import com.amplifyframework.predictions.result.IdentifyEntityMatchesResult;
import com.amplifyframework.predictions.result.IdentifyLabelsResult;
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.IdentifyTextResult;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AbstractC12020cf;
import o.ActionMenuView;
import o.C11967ce;
import o.C25615j;
import o.C37768p;
import o.C45887t;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.C6264aM;
import o.C6317aN;
import o.C6423aP;
import o.C6476aQ;
import o.C7397aj;
import o.C7927at;
import o.InterfaceC52805wZ;
import o.MediaControlView2;
import o.MenuItemHoverListener;
import o.QuickContactBadge;
import o.RadioGroup;
import o.RatingBar;
import o.RelativeLayout;
import o.RemoteViewsAdapter;
import o.ResourceCursorAdapter;
import o.SeekBar;
import o.SimpleCursorAdapter;
import o.SmartSelectSprite;
import o.SpellChecker;
import o.SuggestionsAdapter;
import o.TabWidget;
import o.TableLayout;
import o.UrlInterceptRegistry;
import o.WebViewProvider;
import o.WebViewUpdateService;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSRekognitionService {
    private final InterfaceC52805wZ authCredentialsProvider;
    private final UrlInterceptRegistry client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectCelebrities$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectCelebrities(null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$3, reason: invalid class name */
    public static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectEntities(null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntityMatches$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16781(Continuation<? super C16781> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectEntityMatches(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$3, reason: invalid class name and case insensitive filesystem */
    public static final class C16813 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16813(Continuation<? super C16813> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectLabels(null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectModerationLabels$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16821(Continuation<? super C16821> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectModerationLabels(null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$3, reason: invalid class name and case insensitive filesystem */
    public static final class C16853 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16853(Continuation<? super C16853> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSRekognitionService.this.detectPlainText(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UrlInterceptRegistry getClient() {
        return this.client;
    }

    public AWSRekognitionService(@NotNull AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, @NotNull InterfaceC52805wZ interfaceC52805wZ) {
        Intrinsics.checkNotNullParameter(aWSPredictionsPluginConfiguration, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = interfaceC52805wZ;
        this.client = UrlInterceptRegistry.gEmmrt.copydefault(new Function1<UrlInterceptRegistry.TaskDescription.C0806TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$client$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UrlInterceptRegistry.TaskDescription.C0806TaskDescription c0806TaskDescription) {
                invoke2(c0806TaskDescription);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull UrlInterceptRegistry.TaskDescription.C0806TaskDescription c0806TaskDescription) {
                Intrinsics.checkNotNullParameter(c0806TaskDescription, "");
                c0806TaskDescription.OLrzqt(this.this$0.pluginConfiguration.getDefaultRegion());
                c0806TaskDescription.EZpvd(this.this$0.authCredentialsProvider);
            }
        });
        this.executor = Executors.newCachedThreadPool();
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16791 extends SuspendLambda implements Function1<Continuation<? super IdentifyResult>, Object> {
        final /* synthetic */ ByteBuffer $imageData;
        final /* synthetic */ LabelType $type;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AWSRekognitionService this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16791(LabelType labelType, AWSRekognitionService aWSRekognitionService, ByteBuffer byteBuffer, Continuation<? super C16791> continuation) {
            super(1, continuation);
            this.$type = labelType;
            this.this$0 = aWSRekognitionService;
            this.$imageData = byteBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C16791(this.$type, this.this$0, this.$imageData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super IdentifyResult> continuation) {
            return ((C16791) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List<Label> arrayList;
            List<Label> list;
            int i;
            LabelType labelType;
            LabelType labelType2;
            Object objDetectLabels;
            int i2;
            List<Label> list2;
            Object objCopydefault = C56442yFn.copydefault();
            int i3 = this.label;
            if (i3 == 0) {
                C56391yDq.AEQbTJ(obj);
                arrayList = new ArrayList<>();
                LabelType labelType3 = LabelType.ALL;
                LabelType labelType4 = this.$type;
                if (labelType3 == labelType4 || LabelType.MODERATION_LABELS == labelType4) {
                    AWSRekognitionService aWSRekognitionService = this.this$0;
                    ByteBuffer byteBuffer = this.$imageData;
                    this.L$0 = arrayList;
                    this.L$1 = arrayList;
                    this.label = 1;
                    obj = aWSRekognitionService.detectModerationLabels(byteBuffer, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    list = arrayList;
                } else {
                    i = 0;
                    labelType = LabelType.ALL;
                    labelType2 = this.$type;
                    if (labelType != labelType2 || LabelType.LABELS == labelType2) {
                        AWSRekognitionService aWSRekognitionService2 = this.this$0;
                        ByteBuffer byteBuffer2 = this.$imageData;
                        this.L$0 = arrayList;
                        this.L$1 = arrayList;
                        this.I$0 = i;
                        this.label = 2;
                        objDetectLabels = aWSRekognitionService2.detectLabels(byteBuffer2, this);
                        if (objDetectLabels != objCopydefault) {
                            return objCopydefault;
                        }
                        i2 = i;
                        obj = objDetectLabels;
                        list2 = arrayList;
                        arrayList.addAll((Collection) obj);
                        i = i2;
                        arrayList = list2;
                    }
                    IdentifyLabelsResult identifyLabelsResultBuild = IdentifyLabelsResult.builder().labels(arrayList).unsafeContent(i != 0).build();
                    Intrinsics.checkNotNullExpressionValue(identifyLabelsResultBuild, "");
                    return identifyLabelsResultBuild;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$0;
                    arrayList = (List) this.L$1;
                    list2 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    arrayList.addAll((Collection) obj);
                    i = i2;
                    arrayList = list2;
                    IdentifyLabelsResult identifyLabelsResultBuild2 = IdentifyLabelsResult.builder().labels(arrayList).unsafeContent(i != 0).build();
                    Intrinsics.checkNotNullExpressionValue(identifyLabelsResultBuild2, "");
                    return identifyLabelsResultBuild2;
                }
                arrayList = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            arrayList.addAll((Collection) obj);
            i = !list.isEmpty() ? 1 : 0;
            arrayList = list;
            labelType = LabelType.ALL;
            labelType2 = this.$type;
            if (labelType != labelType2) {
            }
            AWSRekognitionService aWSRekognitionService22 = this.this$0;
            ByteBuffer byteBuffer22 = this.$imageData;
            this.L$0 = arrayList;
            this.L$1 = arrayList;
            this.I$0 = i;
            this.label = 2;
            objDetectLabels = aWSRekognitionService22.detectLabels(byteBuffer22, this);
            if (objDetectLabels != objCopydefault) {
            }
        }
    }

    public final void detectLabels(@NotNull LabelType labelType, @NotNull ByteBuffer byteBuffer, @NotNull Consumer<IdentifyResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(labelType, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new C16791(labelType, this, byteBuffer, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService.detectLabels.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("Amazon Rekognition encountered an error while detecting labels.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    public final void recognizeCelebrities(@NotNull ByteBuffer byteBuffer, @NotNull Consumer<IdentifyResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        IdentifyEntitiesConfiguration identifyEntitiesConfiguration = this.pluginConfiguration.getIdentifyEntitiesConfiguration();
        Intrinsics.checkNotNullExpressionValue(identifyEntitiesConfiguration, "");
        if (!identifyEntitiesConfiguration.isCelebrityDetectionEnabled()) {
            consumer2.accept(new PredictionsException("Celebrity detection is disabled.", "Please enable celebrity detection via Amplify CLI. This feature should be accessible by running `amplify update predictions` in the console and updating entities detection resource with advanced configuration setting."));
        } else {
            execute(new C16861(byteBuffer, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService.recognizeCelebrities.2
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final PredictionsException invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    return new PredictionsException("Amazon Rekognition encountered an error while recognizing celebrities.", th, "See attached exception for more details.");
                }
            }, consumer, consumer2);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$recognizeCelebrities$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16861 extends SuspendLambda implements Function1<Continuation<? super IdentifyResult>, Object> {
        final /* synthetic */ ByteBuffer $imageData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16861(ByteBuffer byteBuffer, Continuation<? super C16861> continuation) {
            super(1, continuation);
            this.$imageData = byteBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return AWSRekognitionService.this.new C16861(this.$imageData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super IdentifyResult> continuation) {
            return ((C16861) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AWSRekognitionService aWSRekognitionService = AWSRekognitionService.this;
                ByteBuffer byteBuffer = this.$imageData;
                this.label = 1;
                obj = aWSRekognitionService.detectCelebrities(byteBuffer, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            IdentifyCelebritiesResult identifyCelebritiesResultFromCelebrities = IdentifyCelebritiesResult.fromCelebrities((List) obj);
            Intrinsics.checkNotNullExpressionValue(identifyCelebritiesResultFromCelebrities, "");
            return identifyCelebritiesResultFromCelebrities;
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16771 extends SuspendLambda implements Function1<Continuation<? super IdentifyResult>, Object> {
        final /* synthetic */ ByteBuffer $imageData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16771(ByteBuffer byteBuffer, Continuation<? super C16771> continuation) {
            super(1, continuation);
            this.$imageData = byteBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return AWSRekognitionService.this.new C16771(this.$imageData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super IdentifyResult> continuation) {
            return ((C16771) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C56391yDq.AEQbTJ(obj);
                    IdentifyEntitiesResult identifyEntitiesResultFromEntityDetails = IdentifyEntitiesResult.fromEntityDetails((List) obj);
                    Intrinsics.copydefault(identifyEntitiesResultFromEntityDetails);
                    return identifyEntitiesResultFromEntityDetails;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                IdentifyEntityMatchesResult identifyEntityMatchesResultFromEntityMatches = IdentifyEntityMatchesResult.fromEntityMatches((List) obj);
                Intrinsics.copydefault(identifyEntityMatchesResultFromEntityMatches);
                return identifyEntityMatchesResultFromEntityMatches;
            }
            C56391yDq.AEQbTJ(obj);
            IdentifyEntitiesConfiguration identifyEntitiesConfiguration = AWSRekognitionService.this.pluginConfiguration.getIdentifyEntitiesConfiguration();
            Intrinsics.checkNotNullExpressionValue(identifyEntitiesConfiguration, "");
            if (identifyEntitiesConfiguration.isGeneralEntityDetection()) {
                AWSRekognitionService aWSRekognitionService = AWSRekognitionService.this;
                ByteBuffer byteBuffer = this.$imageData;
                this.label = 1;
                obj = aWSRekognitionService.detectEntities(byteBuffer, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                IdentifyEntitiesResult identifyEntitiesResultFromEntityDetails2 = IdentifyEntitiesResult.fromEntityDetails((List) obj);
                Intrinsics.copydefault(identifyEntitiesResultFromEntityDetails2);
                return identifyEntitiesResultFromEntityDetails2;
            }
            int maxEntities = identifyEntitiesConfiguration.getMaxEntities();
            String collectionId = identifyEntitiesConfiguration.getCollectionId();
            Intrinsics.checkNotNullExpressionValue(collectionId, "");
            AWSRekognitionService aWSRekognitionService2 = AWSRekognitionService.this;
            ByteBuffer byteBuffer2 = this.$imageData;
            this.label = 2;
            obj = aWSRekognitionService2.detectEntityMatches(byteBuffer2, maxEntities, collectionId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            IdentifyEntityMatchesResult identifyEntityMatchesResultFromEntityMatches2 = IdentifyEntityMatchesResult.fromEntityMatches((List) obj);
            Intrinsics.copydefault(identifyEntityMatchesResultFromEntityMatches2);
            return identifyEntityMatchesResultFromEntityMatches2;
        }
    }

    public final void detectEntities(@NotNull ByteBuffer byteBuffer, @NotNull Consumer<IdentifyResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new C16771(byteBuffer, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService.detectEntities.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("Amazon Rekognition encountered an error while either detecting or searching for faces.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16831 extends SuspendLambda implements Function1<Continuation<? super IdentifyResult>, Object> {
        final /* synthetic */ ByteBuffer $imageData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16831(ByteBuffer byteBuffer, Continuation<? super C16831> continuation) {
            super(1, continuation);
            this.$imageData = byteBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return AWSRekognitionService.this.new C16831(this.$imageData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super IdentifyResult> continuation) {
            return ((C16831) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AWSRekognitionService aWSRekognitionService = AWSRekognitionService.this;
                ByteBuffer byteBuffer = this.$imageData;
                this.label = 1;
                obj = aWSRekognitionService.detectPlainText(byteBuffer, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    public final void detectPlainText(@NotNull ByteBuffer byteBuffer, @NotNull Consumer<IdentifyResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new C16831(byteBuffer, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService.detectPlainText.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("Amazon Rekognition encountered an error while detecting text.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectLabels(final ByteBuffer byteBuffer, Continuation<? super List<Label>> continuation) throws Throwable {
        C16813 c16813;
        Float fEZpvd;
        if (continuation instanceof C16813) {
            c16813 = (C16813) continuation;
            int i = c16813.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16813.label = i - Integer.MIN_VALUE;
            } else {
                c16813 = new C16813(continuation);
            }
        }
        Object objEZpvd = c16813.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16813.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                UrlInterceptRegistry urlInterceptRegistry = this.client;
                RatingBar.StateListAnimator stateListAnimator = new RatingBar.StateListAnimator();
                stateListAnimator.copydefault(C25615j.AEQbTJ.copydefault(new Function1<C25615j.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectLabels$result$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C25615j.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                        taskDescription.KWHzl(byteBuffer.array());
                    }
                }));
                RatingBar ratingBarEZpvd = stateListAnimator.EZpvd();
                c16813.label = 1;
                objEZpvd = urlInterceptRegistry.EZpvd(ratingBarEZpvd, c16813);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            RadioGroup radioGroup = (RadioGroup) objEZpvd;
            ArrayList arrayList = new ArrayList();
            List<C45887t> listAEQbTJ = radioGroup.AEQbTJ();
            if (listAEQbTJ != null) {
                for (C45887t c45887t : listAEQbTJ) {
                    ArrayList arrayList2 = new ArrayList();
                    List<C7927at> listAYXKKw = c45887t.AYXKKw();
                    if (listAYXKKw != null) {
                        Iterator<T> it = listAYXKKw.iterator();
                        while (it.hasNext()) {
                            String strCopydefault = ((C7927at) it.next()).copydefault();
                            if (strCopydefault != null) {
                                arrayList2.add(strCopydefault);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    List<C37768p> listKWHzl = c45887t.KWHzl();
                    if (listKWHzl != null) {
                        Iterator<T> it2 = listKWHzl.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(RekognitionResultTransformers.fromBoundingBox(((C37768p) it2.next()).EZpvd()));
                        }
                    }
                    String strAEQbTJ = c45887t.AEQbTJ();
                    if (strAEQbTJ != null && (fEZpvd = c45887t.EZpvd()) != null) {
                        Label labelBuild = ((Label.Builder) ((Label.Builder) Label.builder().value(strAEQbTJ)).confidence(fEZpvd.floatValue())).parentLabels(arrayList2).boxes(arrayList3).build();
                        Intrinsics.checkNotNullExpressionValue(labelBuild, "");
                        arrayList.add(labelBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while detecting labels.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectModerationLabels(final ByteBuffer byteBuffer, Continuation<? super List<Label>> continuation) throws Throwable {
        C16821 c16821;
        Float fAEQbTJ;
        if (continuation instanceof C16821) {
            c16821 = (C16821) continuation;
            int i = c16821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16821.label = i - Integer.MIN_VALUE;
            } else {
                c16821 = new C16821(continuation);
            }
        }
        Object objKWHzl = c16821.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16821.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                UrlInterceptRegistry urlInterceptRegistry = this.client;
                QuickContactBadge.ActionBar actionBar = new QuickContactBadge.ActionBar();
                actionBar.AEQbTJ(C25615j.AEQbTJ.copydefault(new Function1<C25615j.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectModerationLabels$result$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C25615j.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                        taskDescription.KWHzl(byteBuffer.array());
                    }
                }));
                QuickContactBadge quickContactBadgeOLrzqt = actionBar.OLrzqt();
                c16821.label = 1;
                objKWHzl = urlInterceptRegistry.KWHzl(quickContactBadgeOLrzqt, c16821);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            RelativeLayout relativeLayout = (RelativeLayout) objKWHzl;
            ArrayList arrayList = new ArrayList();
            List<C7397aj> listAEQbTJ = relativeLayout.AEQbTJ();
            if (listAEQbTJ != null) {
                for (C7397aj c7397aj : listAEQbTJ) {
                    String strEZpvd = c7397aj.EZpvd();
                    if (strEZpvd != null && (fAEQbTJ = c7397aj.AEQbTJ()) != null) {
                        Label labelBuild = ((Label.Builder) ((Label.Builder) Label.builder().value(strEZpvd)).confidence(fAEQbTJ.floatValue())).parentLabels(C56402yEa.EZpvd(c7397aj.KWHzl())).build();
                        Intrinsics.checkNotNullExpressionValue(labelBuild, "");
                        arrayList.add(labelBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while detecting moderation labels.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectCelebrities(final ByteBuffer byteBuffer, Continuation<? super List<CelebrityDetails>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String strCopydefault;
        Float fEZpvd;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objAEQbTJ = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            UrlInterceptRegistry urlInterceptRegistry = this.client;
            C6317aN.ActionBar actionBar = new C6317aN.ActionBar();
            actionBar.AEQbTJ(C25615j.AEQbTJ.copydefault(new Function1<C25615j.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectCelebrities$result$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C25615j.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    taskDescription.KWHzl(byteBuffer.array());
                }
            }));
            C6317aN c6317aNKWHzl = actionBar.KWHzl();
            anonymousClass1.label = 1;
            objAEQbTJ = urlInterceptRegistry.AEQbTJ(c6317aNKWHzl, anonymousClass1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        ArrayList arrayList = new ArrayList();
        List<WebViewUpdateService> listAEQbTJ = ((C6264aM) objAEQbTJ).AEQbTJ();
        if (listAEQbTJ != null) {
            for (WebViewUpdateService webViewUpdateService : listAEQbTJ) {
                String strKWHzl = webViewUpdateService.KWHzl();
                Celebrity celebrityBuild = (strKWHzl == null || (strCopydefault = webViewUpdateService.copydefault()) == null || (fEZpvd = webViewUpdateService.EZpvd()) == null) ? null : ((Celebrity.Builder) ((Celebrity.Builder) ((Celebrity.Builder) Celebrity.builder().id(strKWHzl)).value(strCopydefault)).confidence(fEZpvd.floatValue())).build();
                ActionMenuView actionMenuViewAEQbTJ = webViewUpdateService.AEQbTJ();
                RectF rectFFromBoundingBox = RekognitionResultTransformers.fromBoundingBox(actionMenuViewAEQbTJ != null ? actionMenuViewAEQbTJ.EZpvd() : null);
                Pose poseFromRekognitionPose = RekognitionResultTransformers.fromRekognitionPose(actionMenuViewAEQbTJ != null ? actionMenuViewAEQbTJ.copydefault() : null);
                List<Landmark> listFromLandmarks = RekognitionResultTransformers.fromLandmarks(actionMenuViewAEQbTJ != null ? actionMenuViewAEQbTJ.KWHzl() : null);
                Intrinsics.checkNotNullExpressionValue(listFromLandmarks, "");
                ArrayList arrayList2 = new ArrayList();
                List<String> listGEmmrt = webViewUpdateService.gEmmrt();
                if (listGEmmrt != null) {
                    Iterator<T> it = listGEmmrt.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(new URL((String) it.next()));
                        } catch (MalformedURLException unused) {
                        }
                    }
                }
                if (celebrityBuild != null) {
                    CelebrityDetails celebrityDetailsBuild = CelebrityDetails.builder().celebrity(celebrityBuild).box(rectFFromBoundingBox).pose(poseFromRekognitionPose).landmarks(listFromLandmarks).urls(arrayList2).build();
                    Intrinsics.checkNotNullExpressionValue(celebrityDetailsBuild, "");
                    arrayList.add(celebrityDetailsBuild);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectEntities(final ByteBuffer byteBuffer, Continuation<? super List<EntityDetails>> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        Gender genderBuild;
        String strAEQbTJ;
        Float fKWHzl;
        String strOLrzqt;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        }
        Object objKWHzl = anonymousClass3.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass3.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                UrlInterceptRegistry urlInterceptRegistry = this.client;
                MediaControlView2.TaskDescription taskDescription = new MediaControlView2.TaskDescription();
                taskDescription.KWHzl(C25615j.AEQbTJ.copydefault(new Function1<C25615j.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntities$result$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription2) {
                        invoke2(taskDescription2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C25615j.TaskDescription taskDescription2) {
                        Intrinsics.checkNotNullParameter(taskDescription2, "");
                        taskDescription2.KWHzl(byteBuffer.array());
                    }
                }));
                taskDescription.copydefault(yDY.AhwBna(WebViewProvider.Activity.AEQbTJ));
                MediaControlView2 mediaControlView2KWHzl = taskDescription.KWHzl();
                anonymousClass3.label = 1;
                objKWHzl = urlInterceptRegistry.KWHzl(mediaControlView2KWHzl, anonymousClass3);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            MenuItemHoverListener menuItemHoverListener = (MenuItemHoverListener) objKWHzl;
            ArrayList arrayList = new ArrayList();
            List<SmartSelectSprite> listAEQbTJ = menuItemHoverListener.AEQbTJ();
            if (listAEQbTJ != null) {
                for (SmartSelectSprite smartSelectSprite : listAEQbTJ) {
                    RectF rectFFromBoundingBox = RekognitionResultTransformers.fromBoundingBox(smartSelectSprite.copydefault());
                    AgeRange ageRangeFromRekognitionAgeRange = RekognitionResultTransformers.fromRekognitionAgeRange(smartSelectSprite.KWHzl());
                    Pose poseFromRekognitionPose = RekognitionResultTransformers.fromRekognitionPose(smartSelectSprite.DbNXlk());
                    List<Landmark> listFromLandmarks = RekognitionResultTransformers.fromLandmarks(smartSelectSprite.fetchVPNInfo());
                    Intrinsics.checkNotNullExpressionValue(listFromLandmarks, "");
                    List<BinaryFeature> listFromFaceDetail = RekognitionResultTransformers.fromFaceDetail(smartSelectSprite);
                    TableLayout tableLayoutGEmmrt = smartSelectSprite.gEmmrt();
                    if (tableLayoutGEmmrt == null || (fKWHzl = tableLayoutGEmmrt.KWHzl()) == null) {
                        genderBuild = null;
                    } else {
                        float fFloatValue = fKWHzl.floatValue();
                        Gender.Builder builder = Gender.builder();
                        TabWidget tabWidgetEZpvd = tableLayoutGEmmrt.EZpvd();
                        if (tabWidgetEZpvd == null || (strOLrzqt = tabWidgetEZpvd.OLrzqt()) == null) {
                            strOLrzqt = "";
                        }
                        genderBuild = ((Gender.Builder) ((Gender.Builder) builder.value(GenderBinaryTypeAdapter.fromRekognition(strOLrzqt))).confidence(fFloatValue)).build();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<SeekBar> listOLrzqt = smartSelectSprite.OLrzqt();
                    if (listOLrzqt != null) {
                        for (SeekBar seekBar : listOLrzqt) {
                            SimpleCursorAdapter simpleCursorAdapterCopydefault = seekBar.copydefault();
                            if (simpleCursorAdapterCopydefault == null || (strAEQbTJ = simpleCursorAdapterCopydefault.AEQbTJ()) == null) {
                                strAEQbTJ = "";
                            }
                            EmotionType emotionTypeFromRekognition = EmotionTypeAdapter.fromRekognition(strAEQbTJ);
                            Float fOLrzqt = seekBar.OLrzqt();
                            if (fOLrzqt != null) {
                                Emotion emotionBuild = ((Emotion.Builder) ((Emotion.Builder) Emotion.builder().value(emotionTypeFromRekognition)).confidence(fOLrzqt.floatValue())).build();
                                Intrinsics.checkNotNullExpressionValue(emotionBuild, "");
                                arrayList2.add(emotionBuild);
                            }
                        }
                    }
                    Collections.sort(arrayList2, Collections.reverseOrder());
                    EntityDetails entityDetailsBuild = EntityDetails.builder().box(rectFFromBoundingBox).ageRange(ageRangeFromRekognitionAgeRange).pose(poseFromRekognitionPose).gender(genderBuild).landmarks(listFromLandmarks).emotions(arrayList2).features(listFromFaceDetail).build();
                    Intrinsics.checkNotNullExpressionValue(entityDetailsBuild, "");
                    arrayList.add(entityDetailsBuild);
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while detecting faces.", e, "See attached exception for more details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectEntityMatches(final ByteBuffer byteBuffer, int i, String str, Continuation<? super List<EntityMatch>> continuation) throws Throwable {
        C16781 c16781;
        String strEZpvd;
        Float fCopydefault;
        if (continuation instanceof C16781) {
            c16781 = (C16781) continuation;
            int i2 = c16781.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16781.label = i2 - Integer.MIN_VALUE;
            } else {
                c16781 = new C16781(continuation);
            }
        }
        Object objEZpvd = c16781.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = c16781.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                UrlInterceptRegistry urlInterceptRegistry = this.client;
                C6423aP.ActionBar actionBar = new C6423aP.ActionBar();
                actionBar.OLrzqt(C25615j.AEQbTJ.copydefault(new Function1<C25615j.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectEntityMatches$result$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C25615j.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                        taskDescription.KWHzl(byteBuffer.array());
                    }
                }));
                actionBar.KWHzl(C56443yFo.AEQbTJ(i));
                actionBar.copydefault(str);
                C6423aP c6423aPCopydefault = actionBar.copydefault();
                c16781.label = 1;
                objEZpvd = urlInterceptRegistry.EZpvd(c6423aPCopydefault, c16781);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            C6476aQ c6476aQ = (C6476aQ) objEZpvd;
            ArrayList arrayList = new ArrayList();
            List<SuggestionsAdapter> listCopydefault = c6476aQ.copydefault();
            if (listCopydefault != null) {
                for (SuggestionsAdapter suggestionsAdapter : listCopydefault) {
                    SpellChecker spellCheckerOLrzqt = suggestionsAdapter.OLrzqt();
                    RectF rectFFromBoundingBox = RekognitionResultTransformers.fromBoundingBox(spellCheckerOLrzqt != null ? spellCheckerOLrzqt.OLrzqt() : null);
                    SpellChecker spellCheckerOLrzqt2 = suggestionsAdapter.OLrzqt();
                    if (spellCheckerOLrzqt2 != null && (strEZpvd = spellCheckerOLrzqt2.EZpvd()) != null && (fCopydefault = suggestionsAdapter.copydefault()) != null) {
                        EntityMatch entityMatchBuild = ((EntityMatch.Builder) ((EntityMatch.Builder) EntityMatch.builder().externalImageId(strEZpvd).confidence(fCopydefault.floatValue())).box(rectFFromBoundingBox)).build();
                        Intrinsics.checkNotNullExpressionValue(entityMatchBuild, "");
                        arrayList.add(entityMatchBuild);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new PredictionsException("Amazon Rekognition encountered an error while searching for known faces.", e, "See attached exception for more details.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [440=4] */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectPlainText(final ByteBuffer byteBuffer, Continuation<? super IdentifyTextResult> continuation) throws Throwable {
        C16853 c16853;
        String strCopydefault;
        if (continuation instanceof C16853) {
            c16853 = (C16853) continuation;
            int i = c16853.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16853.label = i - Integer.MIN_VALUE;
            } else {
                c16853 = new C16853(continuation);
            }
        }
        Object objCopydefault = c16853.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = c16853.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            UrlInterceptRegistry urlInterceptRegistry = this.client;
            RemoteViewsAdapter.ActionBar actionBar = new RemoteViewsAdapter.ActionBar();
            actionBar.AEQbTJ(C25615j.AEQbTJ.copydefault(new Function1<C25615j.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$detectPlainText$result$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C25615j.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    taskDescription.KWHzl(byteBuffer.array());
                }
            }));
            RemoteViewsAdapter remoteViewsAdapterEZpvd = actionBar.EZpvd();
            c16853.label = 1;
            objCopydefault = urlInterceptRegistry.copydefault(remoteViewsAdapterEZpvd, c16853);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<C11967ce> listCopydefault = ((ResourceCursorAdapter) objCopydefault).copydefault();
        if (listCopydefault != null) {
            for (C11967ce c11967ce : listCopydefault) {
                AbstractC12020cf.TaskDescription taskDescription = AbstractC12020cf.copydefault;
                AbstractC12020cf abstractC12020cfAhwBna = c11967ce.AhwBna();
                if (abstractC12020cfAhwBna == null || (strCopydefault = abstractC12020cfAhwBna.copydefault()) == null) {
                    strCopydefault = "";
                }
                AbstractC12020cf abstractC12020cfKWHzl = taskDescription.KWHzl(strCopydefault);
                if (Intrinsics.EZpvd(abstractC12020cfKWHzl, AbstractC12020cf.StateListAnimator.KWHzl)) {
                    String strCopydefault2 = c11967ce.copydefault();
                    if (strCopydefault2 != null) {
                        C56443yFo.KWHzl(arrayList.add(strCopydefault2));
                    }
                    arrayList3.add(RekognitionResultTransformers.fromTextDetection(c11967ce));
                } else if (Intrinsics.EZpvd(abstractC12020cfKWHzl, AbstractC12020cf.Application.OLrzqt)) {
                    sb.append(c11967ce.copydefault());
                    sb.append(" ");
                    arrayList2.add(RekognitionResultTransformers.fromTextDetection(c11967ce));
                }
            }
        }
        IdentifyTextResult.Builder builder = IdentifyTextResult.builder();
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int length = string.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = Intrinsics.copydefault((int) string.charAt(!z ? i3 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i3++;
            } else {
                z = true;
            }
        }
        IdentifyTextResult identifyTextResultBuild = builder.fullText(string.subSequence(i3, length + 1).toString()).rawLineText(arrayList).lines(arrayList3).words(arrayList2).build();
        Intrinsics.checkNotNullExpressionValue(identifyTextResultBuild, "");
        return identifyTextResultBuild;
    }

    private final <T> void execute(final Function1<? super Continuation<? super T>, ? extends Object> function1, final Function1<? super Throwable, ? extends PredictionsException> function12, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.service.AWSRekognitionService$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AWSRekognitionService.execute$lambda$32(function12, consumer2, function1, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$32(Function1 function1, Consumer consumer, Function1 function12, Consumer consumer2) {
        PredictionsException predictionsException;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new AWSRekognitionService$execute$1$1(function12, consumer2, null), 1, null);
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
