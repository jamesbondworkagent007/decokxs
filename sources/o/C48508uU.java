package o;

import aws.sdk.kotlin.services.translate.serde.ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$2$1;
import aws.sdk.kotlin.services.translate.serde.ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$6$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C46240tN;
import o.C5098Eq;
import o.C5104Ew;
import o.C52832wa;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48508uU {
    public static final byte[] KWHzl(DT dt, final C47227tm c47227tm) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Description"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("EncryptionKey"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("MergeStrategy"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Tags"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("TerminologyData"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c47227tm.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        C46697tc c46697tcAEQbTJ = c47227tm.AEQbTJ();
        if (c46697tcAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c46697tcAEQbTJ, ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$2$1.INSTANCE);
        }
        AbstractC45997tE abstractC45997tECopydefault = c47227tm.copydefault();
        if (abstractC45997tECopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, abstractC45997tECopydefault.copydefault());
        }
        java.lang.String strOLrzqt = c47227tm.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        if (c47227tm.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et5, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.translate.serde.ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$5
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.translate.serde.ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$5$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C46240tN, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, C52832wa.class, "serializeTagDocument", "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/Tag;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C46240tN c46240tN) {
                        invoke2(interfaceC5106Ey, c46240tN);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46240tN c46240tN) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(c46240tN, "");
                        C52832wa.OLrzqt(interfaceC5106Ey, c46240tN);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<C46240tN> it = c47227tm.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        C46402tT c46402tTDjBIcL = c47227tm.djBIcL();
        if (c46402tTDjBIcL != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c46402tTDjBIcL, ImportTerminologyOperationSerializerKt$serializeImportTerminologyOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
