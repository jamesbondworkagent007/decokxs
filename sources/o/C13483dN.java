package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$2$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$5$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$6$1;
import aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$9$1;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C25778jG;
import o.C5098Eq;
import o.C5104Ew;
import o.C6158aK;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13483dN {
    public static final byte[] copydefault(DT dt, final CheckedTextView checkedTextView) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("DataSharingPreference"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Input"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("KmsKeyId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("Output"));
        C5101Et c5101Et7 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("RegionsOfInterest"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("RoleArn"));
        C5101Et c5101Et9 = new C5101Et(pictureInPictureParams, new EX("Settings"));
        C5101Et c5101Et10 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
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
        activity.EZpvd(c5101Et10);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C9145bQ c9145bQEZpvd = checkedTextView.EZpvd();
        if (c9145bQEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c9145bQEZpvd, CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$1$1.INSTANCE);
        }
        C8986bN c8986bNKWHzl = checkedTextView.KWHzl();
        if (c8986bNKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c8986bNKWHzl, CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strAEQbTJ = checkedTextView.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        java.lang.String strCopydefault = checkedTextView.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strCopydefault);
        }
        C9092bP c9092bPOLrzqt = checkedTextView.OLrzqt();
        if (c9092bPOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c9092bPOLrzqt, CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$5$1.INSTANCE);
        }
        C8933bM c8933bMAYXKKw = checkedTextView.AYXKKw();
        if (c8933bMAYXKKw != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c8933bMAYXKKw, CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$6$1.INSTANCE);
        }
        if (checkedTextView.valueOf() != null) {
            ebEZpvd.EZpvd(c5101Et7, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$7
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$7$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C6158aK, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, C25778jG.class, "serializeRegionOfInterestDocument", "serializeRegionOfInterestDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/RegionOfInterest;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C6158aK c6158aK) {
                        invoke2(interfaceC5106Ey, c6158aK);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C6158aK c6158aK) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(c6158aK, "");
                        C25778jG.EZpvd(interfaceC5106Ey, c6158aK);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<C6158aK> it = checkedTextView.valueOf().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strAhwBna = checkedTextView.AhwBna();
        if (strAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strAhwBna);
        }
        C9304bT c9304bTGEmmrt = checkedTextView.gEmmrt();
        if (c9304bTGEmmrt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et9, c9304bTGEmmrt, CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$9$1.INSTANCE);
        }
        if (checkedTextView.djBIcL() != null) {
            ebEZpvd.OLrzqt(c5101Et10, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.CreateStreamProcessorOperationSerializerKt$serializeCreateStreamProcessorOperationBody$1$10
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
                    for (Map.Entry<String, String> entry : checkedTextView.djBIcL().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
