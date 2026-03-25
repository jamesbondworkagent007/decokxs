package o;

import aws.sdk.kotlin.services.comprehend.serde.DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$7$1;
import aws.sdk.kotlin.services.comprehend.serde.DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$8$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C5104Ew;
import o.ContactsInternal;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import o.NetworkConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PackedIntVector {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final DeviceIdleManager deviceIdleManager) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(deviceIdleManager, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AugmentedManifests"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("DataFormat"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("DocumentReaderConfig"));
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("DocumentType"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("Documents"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("LabelDelimiter"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("S3Uri"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("TestS3Uri"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ConfigUpdate configUpdateAEQbTJ = deviceIdleManager.AEQbTJ();
        if (configUpdateAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, configUpdateAEQbTJ.OLrzqt());
        }
        java.lang.String strAYXKKw = deviceIdleManager.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strAYXKKw);
        }
        java.lang.String strValueOf = deviceIdleManager.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strValueOf);
        }
        java.lang.String strAhwBna = deviceIdleManager.AhwBna();
        if (strAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strAhwBna);
        }
        if (deviceIdleManager.EZpvd() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.comprehend.serde.DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$5$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, NetworkConfig, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, ContactsInternal.class, "serializeAugmentedManifestsListItemDocument", "serializeAugmentedManifestsListItemDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/AugmentedManifestsListItem;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, NetworkConfig networkConfig) {
                        invoke2(interfaceC5106Ey, networkConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NetworkConfig networkConfig) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(networkConfig, "");
                        ContactsInternal.EZpvd(interfaceC5106Ey, networkConfig);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<NetworkConfig> it = deviceIdleManager.EZpvd().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        ConditionVariable conditionVariableKWHzl = deviceIdleManager.KWHzl();
        if (conditionVariableKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, conditionVariableKWHzl.KWHzl());
        }
        DeadObjectException deadObjectExceptionCopydefault = deviceIdleManager.copydefault();
        if (deadObjectExceptionCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, deadObjectExceptionCopydefault, DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$7$1.INSTANCE);
        }
        HandlerThread handlerThreadOLrzqt = deviceIdleManager.OLrzqt();
        if (handlerThreadOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, handlerThreadOLrzqt, DocumentClassifierInputDataConfigDocumentSerializerKt$serializeDocumentClassifierInputDataConfigDocument$1$8$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
