package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$10$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$12$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$16$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$18$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$19$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$2$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$22$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$23$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$6$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$7$1;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AccountManagerCallback;
import o.C5098Eq;
import o.C5104Ew;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import o.InterfaceC5106Ey;
import o.JobScheduler;
import o.JobWorkItem;
import o.MarshalQueryableSize;
import o.SearchManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ComponentInfo {
    public static final byte[] KWHzl(DT dt, AnimatorRes animatorRes) {
        final AnimatorRes animatorRes2;
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AccountRecoverySetting"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("AdminCreateUserConfig"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("AliasAttributes"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("AutoVerifiedAttributes"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et5 = new C5101Et(stateListAnimator, new EX("DeletionProtection"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("DeviceConfiguration"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("EmailConfiguration"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("EmailVerificationMessage"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("EmailVerificationSubject"));
        C5101Et c5101Et10 = new C5101Et(pictureInPictureParams, new EX("LambdaConfig"));
        C5101Et c5101Et11 = new C5101Et(stateListAnimator, new EX("MfaConfiguration"));
        C5101Et c5101Et12 = new C5101Et(pictureInPictureParams, new EX("Policies"));
        C5101Et c5101Et13 = new C5101Et(loaderManager, new EX("PoolName"));
        C5101Et c5101Et14 = new C5101Et(fragment, new EX("Schema"));
        C5101Et c5101Et15 = new C5101Et(loaderManager, new EX("SmsAuthenticationMessage"));
        C5101Et c5101Et16 = new C5101Et(pictureInPictureParams, new EX("SmsConfiguration"));
        C5101Et c5101Et17 = new C5101Et(loaderManager, new EX("SmsVerificationMessage"));
        C5101Et c5101Et18 = new C5101Et(pictureInPictureParams, new EX("UserAttributeUpdateSettings"));
        C5101Et c5101Et19 = new C5101Et(pictureInPictureParams, new EX("UserPoolAddOns"));
        C5101Et c5101Et20 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("UserPoolTags"));
        C5101Et c5101Et21 = new C5101Et(fragment, new EX("UsernameAttributes"));
        C5101Et c5101Et22 = new C5101Et(pictureInPictureParams, new EX("UsernameConfiguration"));
        C5101Et c5101Et23 = new C5101Et(pictureInPictureParams, new EX("VerificationMessageTemplate"));
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
        activity.EZpvd(c5101Et23);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        DoubleStream doubleStreamEZpvd = animatorRes.EZpvd();
        if (doubleStreamEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, doubleStreamEZpvd, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$1$1.INSTANCE);
        }
        CipherOutputStream cipherOutputStreamAEQbTJ = animatorRes.AEQbTJ();
        if (cipherOutputStreamAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, cipherOutputStreamAEQbTJ, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$2$1.INSTANCE);
        }
        if (animatorRes.copydefault() != null) {
            animatorRes2 = animatorRes;
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$3
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
                    Iterator<AccountManagerCallback> it = animatorRes2.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().KWHzl());
                    }
                }
            });
        } else {
            animatorRes2 = animatorRes;
        }
        if (animatorRes.OLrzqt() != null) {
            ebEZpvd.EZpvd(c5101Et4, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$4
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
                    Iterator<JobWorkItem> it = animatorRes2.OLrzqt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().AEQbTJ());
                    }
                }
            });
        }
        FloatRange floatRangeKWHzl = animatorRes.KWHzl();
        if (floatRangeKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et5, floatRangeKWHzl.AEQbTJ());
        }
        NavigationRes navigationResDjBIcL = animatorRes.djBIcL();
        if (navigationResDjBIcL != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, navigationResDjBIcL, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$6$1.INSTANCE);
        }
        StringDef stringDefValueOf = animatorRes.valueOf();
        if (stringDefValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, stringDefValueOf, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$7$1.INSTANCE);
        }
        java.lang.String strAYXKKw = animatorRes.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strAYXKKw);
        }
        java.lang.String strGEmmrt = animatorRes.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et9, strGEmmrt);
        }
        ContextImpl contextImplAhwBna = animatorRes.AhwBna();
        if (contextImplAhwBna != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et10, contextImplAhwBna, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$10$1.INSTANCE);
        }
        RestoreSession restoreSessionIsConnected = animatorRes.isConnected();
        if (restoreSessionIsConnected != null) {
            ebEZpvd.AEQbTJ(c5101Et11, restoreSessionIsConnected.KWHzl());
        }
        SharedPreferencesBackupHelper sharedPreferencesBackupHelperDbNXlk = animatorRes.DbNXlk();
        if (sharedPreferencesBackupHelperDbNXlk != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et12, sharedPreferencesBackupHelperDbNXlk, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$12$1.INSTANCE);
        }
        java.lang.String strValues = animatorRes.values();
        if (strValues != null) {
            ebEZpvd.AEQbTJ(c5101Et13, strValues);
        }
        if (animatorRes.AkhnZx() != null) {
            ebEZpvd.EZpvd(c5101Et14, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$14
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$14$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, SearchManager, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, MarshalQueryableSize.class, "serializeSchemaAttributeTypeDocument", "serializeSchemaAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SchemaAttributeType;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, SearchManager searchManager) {
                        invoke2(interfaceC5106Ey, searchManager);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull SearchManager searchManager) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(searchManager, "");
                        MarshalQueryableSize.OLrzqt(interfaceC5106Ey, searchManager);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<SearchManager> it = animatorRes2.AkhnZx().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strFetchVPNInfo = animatorRes.fetchVPNInfo();
        if (strFetchVPNInfo != null) {
            ebEZpvd.AEQbTJ(c5101Et15, strFetchVPNInfo);
        }
        Vr2dDisplayProperties vr2dDisplayPropertiesFARcdN = animatorRes.fARcdN();
        if (vr2dDisplayPropertiesFARcdN != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et16, vr2dDisplayPropertiesFARcdN, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$16$1.INSTANCE);
        }
        java.lang.String strAuCTel = animatorRes.AuCTel();
        if (strAuCTel != null) {
            ebEZpvd.AEQbTJ(c5101Et17, strAuCTel);
        }
        BackupTransport backupTransportFJNWhG = animatorRes.fJNWhG();
        if (backupTransportFJNWhG != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et18, backupTransportFJNWhG, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$18$1.INSTANCE);
        }
        FullBackup fullBackupFIwbmz = animatorRes.fIwbmz();
        if (fullBackupFIwbmz != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et19, fullBackupFIwbmz, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$19$1.INSTANCE);
        }
        if (animatorRes.ejfBZ() != null) {
            ebEZpvd.OLrzqt(c5101Et20, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$20
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
                    for (Map.Entry<String, String> entry : animatorRes2.ejfBZ().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        if (animatorRes.uzCIH() != null) {
            ebEZpvd.EZpvd(c5101Et21, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$21
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
                    Iterator<JobScheduler> it = animatorRes2.uzCIH().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        JobInfo fieldNames = animatorRes.getFieldNames();
        if (fieldNames != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et22, fieldNames, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$22$1.INSTANCE);
        }
        WallpaperBackupHelper newProxyInstance = animatorRes.getNewProxyInstance();
        if (newProxyInstance != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et23, newProxyInstance, CreateUserPoolOperationSerializerKt$serializeCreateUserPoolOperationBody$1$23$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
