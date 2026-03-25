package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPluginConfiguration;
import com.amplifyframework.predictions.aws.adapter.TextractResultTransformers;
import com.amplifyframework.predictions.models.BoundedKeyValue;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Selection;
import com.amplifyframework.predictions.models.Table;
import com.amplifyframework.predictions.models.TextFormatType;
import com.amplifyframework.predictions.result.IdentifyDocumentTextResult;
import com.amplifyframework.predictions.result.IdentifyResult;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AbstractC33846nI;
import o.AbstractC34788nj;
import o.C34384nb;
import o.C34437nc;
import o.C34735ni;
import o.C35318nt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31925mJ;
import o.InterfaceC52805wZ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSTextractService {
    private final InterfaceC52805wZ authCredentialsProvider;
    private final InterfaceC31925mJ client;
    private final ExecutorService executor;
    private final AWSPredictionsPluginConfiguration pluginConfiguration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC31925mJ getClient() {
        return this.client;
    }

    public AWSTextractService(@NotNull AWSPredictionsPluginConfiguration aWSPredictionsPluginConfiguration, @NotNull InterfaceC52805wZ interfaceC52805wZ) {
        Intrinsics.checkNotNullParameter(aWSPredictionsPluginConfiguration, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        this.pluginConfiguration = aWSPredictionsPluginConfiguration;
        this.authCredentialsProvider = interfaceC52805wZ;
        this.client = InterfaceC31925mJ.gEmmrt.copydefault(new Function1<InterfaceC31925mJ.StateListAnimator.TaskDescription, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSTextractService$client$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC31925mJ.StateListAnimator.TaskDescription taskDescription) {
                invoke2(taskDescription);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC31925mJ.StateListAnimator.TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                taskDescription.OLrzqt(this.this$0.pluginConfiguration.getDefaultRegion());
                taskDescription.KWHzl(this.this$0.authCredentialsProvider);
            }
        });
        this.executor = Executors.newCachedThreadPool();
    }

    /* JADX INFO: renamed from: com.amplifyframework.predictions.aws.service.AWSTextractService$detectDocumentText$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super IdentifyResult>, Object> {
        final /* synthetic */ ByteBuffer $imageData;
        final /* synthetic */ TextFormatType $type;
        int label;
        final /* synthetic */ AWSTextractService this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFormatType textFormatType, AWSTextractService aWSTextractService, ByteBuffer byteBuffer, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$type = textFormatType;
            this.this$0 = aWSTextractService;
            this.$imageData = byteBuffer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$type, this.this$0, this.$imageData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super IdentifyResult> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ArrayList arrayList = new ArrayList();
                TextFormatType textFormatType = TextFormatType.FORM;
                TextFormatType textFormatType2 = this.$type;
                if (textFormatType == textFormatType2 || TextFormatType.ALL == textFormatType2) {
                    arrayList.add(AbstractC33846nI.Activity.copydefault);
                }
                TextFormatType textFormatType3 = TextFormatType.TABLE;
                TextFormatType textFormatType4 = this.$type;
                if (textFormatType3 == textFormatType4 || TextFormatType.ALL == textFormatType4) {
                    arrayList.add(AbstractC33846nI.PendingIntent.KWHzl);
                }
                InterfaceC31925mJ client = this.this$0.getClient();
                final ByteBuffer byteBuffer = this.$imageData;
                C34437nc.Application application = new C34437nc.Application();
                application.KWHzl(C35318nt.copydefault.EZpvd(new Function1<C35318nt.Activity, Unit>() { // from class: com.amplifyframework.predictions.aws.service.AWSTextractService$detectDocumentText$1$result$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C35318nt.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C35318nt.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        activity.AEQbTJ(byteBuffer.array());
                    }
                }));
                application.AEQbTJ(arrayList);
                C34437nc c34437ncCopydefault = application.copydefault();
                this.label = 1;
                obj = client.OLrzqt(c34437ncCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AWSTextractService aWSTextractService = this.this$0;
            List<C34735ni> listKWHzl = ((C34384nb) obj).KWHzl();
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            return aWSTextractService.processTextractBlocks(listKWHzl);
        }
    }

    public final void detectDocumentText(@NotNull TextFormatType textFormatType, @NotNull ByteBuffer byteBuffer, @NotNull Consumer<IdentifyResult> consumer, @NotNull Consumer<PredictionsException> consumer2) {
        Intrinsics.checkNotNullParameter(textFormatType, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        execute(new AnonymousClass1(textFormatType, this, byteBuffer, null), new Function1<Throwable, PredictionsException>() { // from class: com.amplifyframework.predictions.aws.service.AWSTextractService.detectDocumentText.2
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final PredictionsException invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PredictionsException("AWS Textract encountered an error while analyzing document.", th, "See attached exception for more details.");
            }
        }, consumer, consumer2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [150=4] */
    /* JADX INFO: Access modifiers changed from: private */
    public final IdentifyDocumentTextResult processTextractBlocks(List<C34735ni> list) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashMap map = new HashMap();
        Iterator<C34735ni> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C34735ni next = it.next();
            String strAhwBna = next.AhwBna();
            map.put(strAhwBna != null ? strAhwBna : "", next);
            AbstractC34788nj abstractC34788njKWHzl = next.KWHzl();
            if (abstractC34788njKWHzl != null) {
                if (Intrinsics.EZpvd(abstractC34788njKWHzl, AbstractC34788nj.AssistContent.copydefault)) {
                    String strFetchVPNInfo = next.fetchVPNInfo();
                    if (strFetchVPNInfo != null) {
                        arrayList.add(strFetchVPNInfo);
                    }
                    IdentifiedText identifiedTextFetchIdentifiedText = TextractResultTransformers.fetchIdentifiedText(next);
                    if (identifiedTextFetchIdentifiedText != null) {
                        Intrinsics.copydefault(identifiedTextFetchIdentifiedText);
                        arrayList3.add(identifiedTextFetchIdentifiedText);
                    }
                } else if (Intrinsics.EZpvd(abstractC34788njKWHzl, AbstractC34788nj.IntentSender.copydefault)) {
                    sb.append(next.fetchVPNInfo());
                    sb.append(" ");
                    IdentifiedText identifiedTextFetchIdentifiedText2 = TextractResultTransformers.fetchIdentifiedText(next);
                    if (identifiedTextFetchIdentifiedText2 != null) {
                        Intrinsics.copydefault(identifiedTextFetchIdentifiedText2);
                        arrayList2.add(identifiedTextFetchIdentifiedText2);
                    }
                } else if (Intrinsics.EZpvd(abstractC34788njKWHzl, AbstractC34788nj.BroadcastReceiver.KWHzl)) {
                    Selection selectionFetchSelection = TextractResultTransformers.fetchSelection(next);
                    if (selectionFetchSelection != null) {
                        Intrinsics.copydefault(selectionFetchSelection);
                        arrayList4.add(selectionFetchSelection);
                    }
                } else if (Intrinsics.EZpvd(abstractC34788njKWHzl, AbstractC34788nj.Intent.KWHzl)) {
                    arrayList7.add(next);
                } else if (Intrinsics.EZpvd(abstractC34788njKWHzl, AbstractC34788nj.StateListAnimator.KWHzl)) {
                    arrayList8.add(next);
                }
            }
        }
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            Table tableFetchTable = TextractResultTransformers.fetchTable((C34735ni) it2.next(), map);
            if (tableFetchTable != null) {
                arrayList5.add(tableFetchTable);
            }
        }
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            BoundedKeyValue boundedKeyValueFetchKeyValue = TextractResultTransformers.fetchKeyValue((C34735ni) it3.next(), map);
            if (boundedKeyValueFetchKeyValue != null) {
                arrayList6.add(boundedKeyValueFetchKeyValue);
            }
        }
        IdentifyDocumentTextResult.Builder builder = IdentifyDocumentTextResult.builder();
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.copydefault((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        IdentifyDocumentTextResult identifyDocumentTextResultBuild = builder.fullText(string.subSequence(i, length + 1).toString()).rawLineText(arrayList).lines(arrayList3).words(arrayList2).selections(arrayList4).tables(arrayList5).keyValues(arrayList6).build();
        Intrinsics.checkNotNullExpressionValue(identifyDocumentTextResultBuild, "");
        return identifyDocumentTextResultBuild;
    }

    private final <T> void execute(final Function1<? super Continuation<? super T>, ? extends Object> function1, final Function1<? super Throwable, ? extends PredictionsException> function12, final Consumer<T> consumer, final Consumer<PredictionsException> consumer2) {
        this.executor.execute(new Runnable() { // from class: com.amplifyframework.predictions.aws.service.AWSTextractService$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AWSTextractService.execute$lambda$8(function12, consumer2, function1, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$8(Function1 function1, Consumer consumer, Function1 function12, Consumer consumer2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new AWSTextractService$execute$1$1(function12, consumer2, null), 1, null);
        } catch (Throwable th) {
            consumer.accept((PredictionsException) function1.invoke(th));
        }
    }
}
