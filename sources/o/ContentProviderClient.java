package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CompromisedCredentialsRiskConfigurationTypeDocumentSerializerKt$serializeCompromisedCredentialsRiskConfigurationTypeDocument$1$2$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.SuppressAutoDoc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ContentProviderClient {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final FloatArrayEvaluator floatArrayEvaluator) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(floatArrayEvaluator, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Actions"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("EventFilter"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (floatArrayEvaluator.EZpvd() != null) {
            ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CompromisedCredentialsRiskConfigurationTypeDocumentSerializerKt$serializeCompromisedCredentialsRiskConfigurationTypeDocument$1$1
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
                    Iterator<SuppressAutoDoc> it = floatArrayEvaluator.EZpvd().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().EZpvd());
                    }
                }
            });
        }
        FloatKeyframeSet floatKeyframeSetAEQbTJ = floatArrayEvaluator.AEQbTJ();
        if (floatKeyframeSetAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, floatKeyframeSetAEQbTJ, CompromisedCredentialsRiskConfigurationTypeDocumentSerializerKt$serializeCompromisedCredentialsRiskConfigurationTypeDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
