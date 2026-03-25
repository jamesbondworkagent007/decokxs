package o;

import aws.sdk.kotlin.services.comprehend.serde.StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$3$1;
import aws.sdk.kotlin.services.comprehend.serde.StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$6$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C5104Ew;
import o.FrameStats;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import o.PrinterDiscoverySession;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PrintStreamPrinter {
    public static final byte[] KWHzl(DT dt, final MultiCheckPreference multiCheckPreference) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DataAccessRoleArn"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("InputDataConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("JobName"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LanguageCode"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("OutputDataConfig"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("Tags"));
        C5101Et c5101Et8 = new C5101Et(fragment, new EX("TargetEventTypes"));
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
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = multiCheckPreference.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et, C57419yi.EZpvd(dt).KWHzl());
        }
        java.lang.String strOLrzqt = multiCheckPreference.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ServiceManagerNative serviceManagerNativeKWHzl = multiCheckPreference.KWHzl();
        if (serviceManagerNativeKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, serviceManagerNativeKWHzl, StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strCopydefault = multiCheckPreference.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strCopydefault);
        }
        SynchronousResultReceiver synchronousResultReceiverEZpvd = multiCheckPreference.EZpvd();
        if (synchronousResultReceiverEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et5, synchronousResultReceiverEZpvd.OLrzqt());
        }
        StorageManagerInternal storageManagerInternalAYXKKw = multiCheckPreference.AYXKKw();
        if (storageManagerInternalAYXKKw != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, storageManagerInternalAYXKKw, StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$6$1.INSTANCE);
        }
        if (multiCheckPreference.djBIcL() != null) {
            ebEZpvd.EZpvd(c5101Et7, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$7
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.comprehend.serde.StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$7$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, PrinterDiscoverySession, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, FrameStats.class, "serializeTagDocument", "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/Tag;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, PrinterDiscoverySession printerDiscoverySession) {
                        invoke2(interfaceC5106Ey, printerDiscoverySession);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull PrinterDiscoverySession printerDiscoverySession) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(printerDiscoverySession, "");
                        FrameStats.AEQbTJ(interfaceC5106Ey, printerDiscoverySession);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<PrinterDiscoverySession> it = multiCheckPreference.djBIcL().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        if (multiCheckPreference.gEmmrt() != null) {
            ebEZpvd.EZpvd(c5101Et8, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.StartEventsDetectionJobOperationSerializerKt$serializeStartEventsDetectionJobOperationBody$1$8
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

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<String> it = multiCheckPreference.gEmmrt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
