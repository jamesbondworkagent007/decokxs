package o;

import aws.sdk.kotlin.services.comprehend.serde.DatasetInputDataConfigDocumentSerializerKt$serializeDatasetInputDataConfigDocument$1$3$1;
import aws.sdk.kotlin.services.comprehend.serde.DatasetInputDataConfigDocumentSerializerKt$serializeDatasetInputDataConfigDocument$1$4$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C5104Ew;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import o.ResourceCertificateSource;
import o.X509TrustManagerExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TrustedCertificateStoreAdapter {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final IpConnectivityLog ipConnectivityLog) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(ipConnectivityLog, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AugmentedManifests"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DataFormat"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("DocumentClassifierInputDataConfig"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("EntityRecognizerInputDataConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (ipConnectivityLog.EZpvd() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.DatasetInputDataConfigDocumentSerializerKt$serializeDatasetInputDataConfigDocument$1$1
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.comprehend.serde.DatasetInputDataConfigDocumentSerializerKt$serializeDatasetInputDataConfigDocument$1$1$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, X509TrustManagerExtensions, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, ResourceCertificateSource.class, "serializeDatasetAugmentedManifestsListItemDocument", "serializeDatasetAugmentedManifestsListItemDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/DatasetAugmentedManifestsListItem;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, X509TrustManagerExtensions x509TrustManagerExtensions) {
                        invoke2(interfaceC5106Ey, x509TrustManagerExtensions);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "");
                        ResourceCertificateSource.AEQbTJ(interfaceC5106Ey, x509TrustManagerExtensions);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<X509TrustManagerExtensions> it = ipConnectivityLog.EZpvd().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        DhcpClientEvent dhcpClientEventOLrzqt = ipConnectivityLog.OLrzqt();
        if (dhcpClientEventOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, dhcpClientEventOLrzqt.copydefault());
        }
        DhcpErrorEvent dhcpErrorEventCopydefault = ipConnectivityLog.copydefault();
        if (dhcpErrorEventCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, dhcpErrorEventCopydefault, DatasetInputDataConfigDocumentSerializerKt$serializeDatasetInputDataConfigDocument$1$3$1.INSTANCE);
        }
        IpReachabilityEvent ipReachabilityEventAEQbTJ = ipConnectivityLog.AEQbTJ();
        if (ipReachabilityEventAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, ipReachabilityEventAEQbTJ, DatasetInputDataConfigDocumentSerializerKt$serializeDatasetInputDataConfigDocument$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
