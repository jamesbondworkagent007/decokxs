package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$20$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$5$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.NotificationManager;
import o.TransitionRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UriPermission {
    public static final byte[] OLrzqt(DT dt, RectEvaluator rectEvaluator) {
        final RectEvaluator rectEvaluator2;
        EW ew = new EW();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("AccessTokenValidity"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("AllowedOAuthFlows"));
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et3 = new C5101Et(taskDescription, new EX("AllowedOAuthFlowsUserPoolClient"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("AllowedOAuthScopes"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("AnalyticsConfiguration"));
        C5101Et c5101Et6 = new C5101Et(fragmentManager, new EX("AuthSessionValidity"));
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("CallbackURLs"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("ClientName"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("DefaultRedirectURI"));
        C5101Et c5101Et10 = new C5101Et(taskDescription, new EX("EnablePropagateAdditionalUserContextData"));
        C5101Et c5101Et11 = new C5101Et(taskDescription, new EX("EnableTokenRevocation"));
        C5101Et c5101Et12 = new C5101Et(fragment, new EX("ExplicitAuthFlows"));
        C5101Et c5101Et13 = new C5101Et(taskDescription, new EX("GenerateSecret"));
        C5101Et c5101Et14 = new C5101Et(fragmentManager, new EX("IdTokenValidity"));
        C5101Et c5101Et15 = new C5101Et(fragment, new EX("LogoutURLs"));
        C5101Et c5101Et16 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("PreventUserExistenceErrors"));
        C5101Et c5101Et17 = new C5101Et(fragment, new EX("ReadAttributes"));
        C5101Et c5101Et18 = new C5101Et(fragmentManager, new EX("RefreshTokenValidity"));
        C5101Et c5101Et19 = new C5101Et(fragment, new EX("SupportedIdentityProviders"));
        C5101Et c5101Et20 = new C5101Et(pictureInPictureParams, new EX("TokenValidityUnits"));
        C5101Et c5101Et21 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et22 = new C5101Et(fragment, new EX("WriteAttributes"));
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
        activity.EZpvd(c5101Et11);
        activity.EZpvd(c5101Et12);
        activity.EZpvd(c5101Et13);
        activity.EZpvd(c5101Et14);
        activity.EZpvd(c5101Et15);
        activity.EZpvd(c5101Et16);
        activity.EZpvd(c5101Et17);
        activity.EZpvd(c5101Et18);
        activity.EZpvd(c5101Et19);
        activity.EZpvd(c5101Et20);
        activity.EZpvd(c5101Et21);
        activity.EZpvd(c5101Et22);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Integer numEZpvd = rectEvaluator.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et, numEZpvd.intValue());
        }
        if (rectEvaluator.copydefault() != null) {
            rectEvaluator2 = rectEvaluator;
            ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$2
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
                    Iterator<NotificationManager> it = rectEvaluator2.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().AEQbTJ());
                    }
                }
            });
        } else {
            rectEvaluator2 = rectEvaluator;
        }
        java.lang.Boolean boolOLrzqt = rectEvaluator.OLrzqt();
        if (boolOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et3, boolOLrzqt.booleanValue());
        }
        if (rectEvaluator.AEQbTJ() != null) {
            ebEZpvd.EZpvd(c5101Et4, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$4
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
                    Iterator<String> it = rectEvaluator2.AEQbTJ().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        AccountsException accountsExceptionKWHzl = rectEvaluator.KWHzl();
        if (accountsExceptionKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, accountsExceptionKWHzl, CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$5$1.INSTANCE);
        }
        java.lang.Integer numDjBIcL = rectEvaluator.djBIcL();
        if (numDjBIcL != null) {
            ebEZpvd.OLrzqt(c5101Et6, numDjBIcL.intValue());
        }
        if (rectEvaluator.valueOf() != null) {
            ebEZpvd.EZpvd(c5101Et7, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$7
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
                    Iterator<String> it = rectEvaluator2.valueOf().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        java.lang.String strAYXKKw = rectEvaluator.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strAYXKKw);
        }
        java.lang.String strGEmmrt = rectEvaluator.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et9, strGEmmrt);
        }
        java.lang.Boolean boolAhwBna = rectEvaluator.AhwBna();
        if (boolAhwBna != null) {
            ebEZpvd.OLrzqt(c5101Et10, boolAhwBna.booleanValue());
        }
        java.lang.Boolean boolDbNXlk = rectEvaluator.DbNXlk();
        if (boolDbNXlk != null) {
            ebEZpvd.OLrzqt(c5101Et11, boolDbNXlk.booleanValue());
        }
        if (rectEvaluator.values() != null) {
            ebEZpvd.EZpvd(c5101Et12, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$12
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
                    Iterator<TransitionRes> it = rectEvaluator2.values().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().EZpvd());
                    }
                }
            });
        }
        java.lang.Boolean boolIsConnected = rectEvaluator.isConnected();
        if (boolIsConnected != null) {
            ebEZpvd.OLrzqt(c5101Et13, boolIsConnected.booleanValue());
        }
        java.lang.Integer numAkhnZx = rectEvaluator.AkhnZx();
        if (numAkhnZx != null) {
            ebEZpvd.OLrzqt(c5101Et14, numAkhnZx.intValue());
        }
        if (rectEvaluator.fetchVPNInfo() != null) {
            ebEZpvd.EZpvd(c5101Et15, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$15
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
                    Iterator<String> it = rectEvaluator2.fetchVPNInfo().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        PictureInPictureArgs pictureInPictureArgsFJNWhG = rectEvaluator.fJNWhG();
        if (pictureInPictureArgsFJNWhG != null) {
            ebEZpvd.AEQbTJ(c5101Et16, pictureInPictureArgsFJNWhG.copydefault());
        }
        if (rectEvaluator.AuCTel() != null) {
            ebEZpvd.EZpvd(c5101Et17, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$17
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
                    Iterator<String> it = rectEvaluator2.AuCTel().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        java.lang.Integer numEjfBZ = rectEvaluator.ejfBZ();
        if (numEjfBZ != null) {
            ebEZpvd.OLrzqt(c5101Et18, numEjfBZ.intValue());
        }
        if (rectEvaluator.fIwbmz() != null) {
            ebEZpvd.EZpvd(c5101Et19, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$19
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
                    Iterator<String> it = rectEvaluator2.fIwbmz().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        DevicePolicyManagerInternal devicePolicyManagerInternalFARcdN = rectEvaluator.fARcdN();
        if (devicePolicyManagerInternalFARcdN != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et20, devicePolicyManagerInternalFARcdN, CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$20$1.INSTANCE);
        }
        java.lang.String strIwGUEr = rectEvaluator.iwGUEr();
        if (strIwGUEr != null) {
            ebEZpvd.AEQbTJ(c5101Et21, strIwGUEr);
        }
        if (rectEvaluator.getNewProxyInstance() != null) {
            ebEZpvd.EZpvd(c5101Et22, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolClientOperationSerializerKt$serializeCreateUserPoolClientOperationBody$1$22
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
                    Iterator<String> it = rectEvaluator2.getNewProxyInstance().iterator();
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
