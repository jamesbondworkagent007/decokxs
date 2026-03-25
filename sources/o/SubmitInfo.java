package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$7$1;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.BluetoothDeviceFilterUtils;
import o.C5098Eq;
import o.C5104Ew;
import o.ChooseAccountActivity;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SubmitInfo {
    public static final byte[] copydefault(DT dt, final VrManager vrManager) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AnalyticsMetadata"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("ClientMetadata"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Password"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("SecretHash"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("UserAttributes"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("UserContextData"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("Username"));
        C5101Et c5101Et9 = new C5101Et(fragment, new EX("ValidationData"));
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
        AccountManagerResponse accountManagerResponseOLrzqt = vrManager.OLrzqt();
        if (accountManagerResponseOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, accountManagerResponseOLrzqt, SignUpOperationSerializerKt$serializeSignUpOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strEZpvd = vrManager.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        if (vrManager.KWHzl() != null) {
            ebEZpvd.OLrzqt(c5101Et3, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$3
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
                    for (Map.Entry<String, String> entry : vrManager.KWHzl().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        java.lang.String strAEQbTJ = vrManager.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        java.lang.String strCopydefault = vrManager.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strCopydefault);
        }
        if (vrManager.AYXKKw() != null) {
            ebEZpvd.EZpvd(c5101Et6, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$6
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$6$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ChooseAccountActivity, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, BluetoothDeviceFilterUtils.class, "serializeAttributeTypeDocument", "serializeAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AttributeType;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ChooseAccountActivity chooseAccountActivity) {
                        invoke2(interfaceC5106Ey, chooseAccountActivity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ChooseAccountActivity chooseAccountActivity) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(chooseAccountActivity, "");
                        BluetoothDeviceFilterUtils.copydefault(interfaceC5106Ey, chooseAccountActivity);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<ChooseAccountActivity> it = vrManager.AYXKKw().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        RestoreDescription restoreDescriptionGEmmrt = vrManager.gEmmrt();
        if (restoreDescriptionGEmmrt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, restoreDescriptionGEmmrt, SignUpOperationSerializerKt$serializeSignUpOperationBody$1$7$1.INSTANCE);
        }
        java.lang.String strDjBIcL = vrManager.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strDjBIcL);
        }
        if (vrManager.AhwBna() != null) {
            ebEZpvd.EZpvd(c5101Et9, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$9
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationSerializerKt$serializeSignUpOperationBody$1$9$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ChooseAccountActivity, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, BluetoothDeviceFilterUtils.class, "serializeAttributeTypeDocument", "serializeAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AttributeType;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ChooseAccountActivity chooseAccountActivity) {
                        invoke2(interfaceC5106Ey, chooseAccountActivity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ChooseAccountActivity chooseAccountActivity) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(chooseAccountActivity, "");
                        BluetoothDeviceFilterUtils.copydefault(interfaceC5106Ey, chooseAccountActivity);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<ChooseAccountActivity> it = vrManager.AhwBna().iterator();
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
