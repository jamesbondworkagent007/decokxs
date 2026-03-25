package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$3$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$6$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$7$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5097Ep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13348dI {
    public static final byte[] copydefault(DT dt, final CompoundButton compoundButton) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("FeatureConfig"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("KmsKeyId"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("OutputConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("ProjectArn"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("TestingData"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("TrainingData"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("VersionDescription"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("VersionName"));
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
        DatePickerController datePickerControllerOLrzqt = compoundButton.OLrzqt();
        if (datePickerControllerOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, datePickerControllerOLrzqt, CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strKWHzl = compoundButton.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        C7609an c7609anAEQbTJ = compoundButton.AEQbTJ();
        if (c7609anAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c7609anAEQbTJ, CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strEZpvd = compoundButton.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        if (compoundButton.copydefault() != null) {
            ebEZpvd.OLrzqt(c5101Et5, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5097Ep interfaceC5097Ep) {
                    invoke2(interfaceC5097Ep);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5097Ep interfaceC5097Ep) {
                    Intrinsics.checkNotNullParameter(interfaceC5097Ep, "");
                    for (Map.Entry<String, String> entry : compoundButton.copydefault().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        C11808cb c11808cbValueOf = compoundButton.valueOf();
        if (c11808cbValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c11808cbValueOf, CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$6$1.INSTANCE);
        }
        C12126ch c12126chGEmmrt = compoundButton.gEmmrt();
        if (c12126chGEmmrt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, c12126chGEmmrt, CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$7$1.INSTANCE);
        }
        java.lang.String strDjBIcL = compoundButton.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strDjBIcL);
        }
        java.lang.String strAYXKKw = compoundButton.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et9, strAYXKKw);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
