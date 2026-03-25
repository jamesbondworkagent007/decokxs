package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$20$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$5$1;
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
public final class UsbAccessory {
    public static final byte[] copydefault(DT dt, BackupManager backupManager) {
        final BackupManager backupManager2;
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
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("ClientName"));
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("DefaultRedirectURI"));
        C5101Et c5101Et11 = new C5101Et(taskDescription, new EX("EnablePropagateAdditionalUserContextData"));
        C5101Et c5101Et12 = new C5101Et(taskDescription, new EX("EnableTokenRevocation"));
        C5101Et c5101Et13 = new C5101Et(fragment, new EX("ExplicitAuthFlows"));
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
        java.lang.Integer numEZpvd = backupManager.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et, numEZpvd.intValue());
        }
        if (backupManager.copydefault() != null) {
            backupManager2 = backupManager;
            ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$2
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
                    Iterator<NotificationManager> it = backupManager2.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().AEQbTJ());
                    }
                }
            });
        } else {
            backupManager2 = backupManager;
        }
        java.lang.Boolean boolAEQbTJ = backupManager.AEQbTJ();
        if (boolAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et3, boolAEQbTJ.booleanValue());
        }
        if (backupManager.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et4, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$4
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
                    Iterator<String> it = backupManager2.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        AccountsException accountsExceptionOLrzqt = backupManager.OLrzqt();
        if (accountsExceptionOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, accountsExceptionOLrzqt, UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$5$1.INSTANCE);
        }
        java.lang.Integer numAYXKKw = backupManager.AYXKKw();
        if (numAYXKKw != null) {
            ebEZpvd.OLrzqt(c5101Et6, numAYXKKw.intValue());
        }
        if (backupManager.AhwBna() != null) {
            ebEZpvd.EZpvd(c5101Et7, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$7
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
                    Iterator<String> it = backupManager2.AhwBna().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        java.lang.String strGEmmrt = backupManager.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strGEmmrt);
        }
        java.lang.String strValueOf = backupManager.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et9, strValueOf);
        }
        java.lang.String strDjBIcL = backupManager.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et10, strDjBIcL);
        }
        java.lang.Boolean boolDbNXlk = backupManager.DbNXlk();
        if (boolDbNXlk != null) {
            ebEZpvd.OLrzqt(c5101Et11, boolDbNXlk.booleanValue());
        }
        java.lang.Boolean boolIsConnected = backupManager.isConnected();
        if (boolIsConnected != null) {
            ebEZpvd.OLrzqt(c5101Et12, boolIsConnected.booleanValue());
        }
        if (backupManager.fetchVPNInfo() != null) {
            ebEZpvd.EZpvd(c5101Et13, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$13
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
                    Iterator<TransitionRes> it = backupManager2.fetchVPNInfo().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().EZpvd());
                    }
                }
            });
        }
        java.lang.Integer numValues = backupManager.values();
        if (numValues != null) {
            ebEZpvd.OLrzqt(c5101Et14, numValues.intValue());
        }
        if (backupManager.AkhnZx() != null) {
            ebEZpvd.EZpvd(c5101Et15, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$15
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
                    Iterator<String> it = backupManager2.AkhnZx().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        PictureInPictureArgs pictureInPictureArgsEjfBZ = backupManager.ejfBZ();
        if (pictureInPictureArgsEjfBZ != null) {
            ebEZpvd.AEQbTJ(c5101Et16, pictureInPictureArgsEjfBZ.copydefault());
        }
        if (backupManager.fARcdN() != null) {
            ebEZpvd.EZpvd(c5101Et17, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$17
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
                    Iterator<String> it = backupManager2.fARcdN().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        java.lang.Integer numAuCTel = backupManager.AuCTel();
        if (numAuCTel != null) {
            ebEZpvd.OLrzqt(c5101Et18, numAuCTel.intValue());
        }
        if (backupManager.fJNWhG() != null) {
            ebEZpvd.EZpvd(c5101Et19, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$19
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
                    Iterator<String> it = backupManager2.fJNWhG().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        DevicePolicyManagerInternal devicePolicyManagerInternalFIwbmz = backupManager.fIwbmz();
        if (devicePolicyManagerInternalFIwbmz != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et20, devicePolicyManagerInternalFIwbmz, UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$20$1.INSTANCE);
        }
        java.lang.String newProxyInstance = backupManager.getNewProxyInstance();
        if (newProxyInstance != null) {
            ebEZpvd.AEQbTJ(c5101Et21, newProxyInstance);
        }
        if (backupManager.uzCIH() != null) {
            ebEZpvd.EZpvd(c5101Et22, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolClientOperationSerializerKt$serializeUpdateUserPoolClientOperationBody$1$22
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
                    Iterator<String> it = backupManager2.uzCIH().iterator();
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
