package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C5104Ew;
import o.ClassFormatError;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import o.InterfaceC5106Ey;
import o.Short;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class TimeUnit {
    public static final byte[] AEQbTJ(DT dt, final SafeVarargs safeVarargs) {
        EW ew = new EW();
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et = new C5101Et(taskDescription, new EX("AllowClassicFlow"));
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("AllowUnauthenticatedIdentities"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("CognitoIdentityProviders"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("DeveloperProviderName"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("IdentityPoolId"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("IdentityPoolName"));
        AbstractC5105Ex.Dialog dialog = AbstractC5105Ex.Dialog.KWHzl;
        C5101Et c5101Et7 = new C5101Et(dialog, new EX("IdentityPoolTags"));
        C5101Et c5101Et8 = new C5101Et(fragment, new EX("OpenIdConnectProviderARNs"));
        C5101Et c5101Et9 = new C5101Et(fragment, new EX("SamlProviderARNs"));
        C5101Et c5101Et10 = new C5101Et(dialog, new EX("SupportedLoginProviders"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
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
        java.lang.Boolean boolAEQbTJ = safeVarargs.AEQbTJ();
        if (boolAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et, boolAEQbTJ.booleanValue());
        }
        ebEZpvd.OLrzqt(c5101Et2, safeVarargs.copydefault());
        if (safeVarargs.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.UpdateIdentityPoolOperationSerializerKt$serializeUpdateIdentityPoolOperationBody$1$2
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentity.serde.UpdateIdentityPoolOperationSerializerKt$serializeUpdateIdentityPoolOperationBody$1$2$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ClassFormatError, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, Short.class, "serializeCognitoIdentityProviderDocument", "serializeCognitoIdentityProviderDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentity/model/CognitoIdentityProvider;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ClassFormatError classFormatError) {
                        invoke2(interfaceC5106Ey, classFormatError);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ClassFormatError classFormatError) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(classFormatError, "");
                        Short.EZpvd(interfaceC5106Ey, classFormatError);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<ClassFormatError> it = safeVarargs.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strOLrzqt = safeVarargs.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        ebEZpvd.AEQbTJ(c5101Et5, safeVarargs.EZpvd());
        ebEZpvd.AEQbTJ(c5101Et6, safeVarargs.valueOf());
        if (safeVarargs.AhwBna() != null) {
            ebEZpvd.OLrzqt(c5101Et7, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.UpdateIdentityPoolOperationSerializerKt$serializeUpdateIdentityPoolOperationBody$1$4
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
                    for (Map.Entry<String, String> entry : safeVarargs.AhwBna().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        if (safeVarargs.AYXKKw() != null) {
            ebEZpvd.EZpvd(c5101Et8, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.UpdateIdentityPoolOperationSerializerKt$serializeUpdateIdentityPoolOperationBody$1$5
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
                    Iterator<String> it = safeVarargs.AYXKKw().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        if (safeVarargs.gEmmrt() != null) {
            ebEZpvd.EZpvd(c5101Et9, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.UpdateIdentityPoolOperationSerializerKt$serializeUpdateIdentityPoolOperationBody$1$6
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
                    Iterator<String> it = safeVarargs.gEmmrt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        if (safeVarargs.djBIcL() != null) {
            ebEZpvd.OLrzqt(c5101Et10, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.UpdateIdentityPoolOperationSerializerKt$serializeUpdateIdentityPoolOperationBody$1$7
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
                    for (Map.Entry<String, String> entry : safeVarargs.djBIcL().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
