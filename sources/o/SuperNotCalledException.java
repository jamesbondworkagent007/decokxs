package o;

import aws.sdk.kotlin.services.comprehend.serde.StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$3$1;
import aws.sdk.kotlin.services.comprehend.serde.StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$7$1;
import aws.sdk.kotlin.services.comprehend.serde.StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$8$1;
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
public final class SuperNotCalledException {
    public static final byte[] EZpvd(DT dt, final PreferenceInflater preferenceInflater) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DataAccessRoleArn"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("InputDataConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("JobName"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et5 = new C5101Et(stateListAnimator, new EX("LanguageCode"));
        C5101Et c5101Et6 = new C5101Et(stateListAnimator, new EX("Mode"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("OutputDataConfig"));
        C5101Et c5101Et8 = new C5101Et(pictureInPictureParams, new EX("RedactionConfig"));
        C5101Et c5101Et9 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Tags"));
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
        activity.EZpvd(c5101Et9);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = preferenceInflater.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et, C57419yi.EZpvd(dt).KWHzl());
        }
        java.lang.String strCopydefault = preferenceInflater.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        ServiceManagerNative serviceManagerNativeOLrzqt = preferenceInflater.OLrzqt();
        if (serviceManagerNativeOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, serviceManagerNativeOLrzqt, StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strKWHzl = preferenceInflater.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        SynchronousResultReceiver synchronousResultReceiverAEQbTJ = preferenceInflater.AEQbTJ();
        if (synchronousResultReceiverAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et5, synchronousResultReceiverAEQbTJ.OLrzqt());
        }
        CleartextNetworkViolation cleartextNetworkViolationValueOf = preferenceInflater.valueOf();
        if (cleartextNetworkViolationValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et6, cleartextNetworkViolationValueOf.OLrzqt());
        }
        StorageManagerInternal storageManagerInternalDjBIcL = preferenceInflater.djBIcL();
        if (storageManagerInternalDjBIcL != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, storageManagerInternalDjBIcL, StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$7$1.INSTANCE);
        }
        ServiceConnectionLeakedViolation serviceConnectionLeakedViolationGEmmrt = preferenceInflater.gEmmrt();
        if (serviceConnectionLeakedViolationGEmmrt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et8, serviceConnectionLeakedViolationGEmmrt, StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$8$1.INSTANCE);
        }
        if (preferenceInflater.AhwBna() != null) {
            ebEZpvd.EZpvd(c5101Et9, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$9
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.comprehend.serde.StartPiiEntitiesDetectionJobOperationSerializerKt$serializeStartPiiEntitiesDetectionJobOperationBody$1$9$1, reason: invalid class name */
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
                    Iterator<PrinterDiscoverySession> it = preferenceInflater.AhwBna().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
