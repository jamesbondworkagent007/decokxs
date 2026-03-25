package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$11$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$13$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$15$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$16$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$19$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$2$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$5$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$6$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$9$1;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import o.JobWorkItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UsbEndpoint {
    public static final byte[] OLrzqt(DT dt, BlobBackupHelper blobBackupHelper) {
        final BlobBackupHelper blobBackupHelper2;
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AccountRecoverySetting"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("AdminCreateUserConfig"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AutoVerifiedAttributes"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("DeletionProtection"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("DeviceConfiguration"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("EmailConfiguration"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("EmailVerificationMessage"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("EmailVerificationSubject"));
        C5101Et c5101Et9 = new C5101Et(pictureInPictureParams, new EX("LambdaConfig"));
        C5101Et c5101Et10 = new C5101Et(stateListAnimator, new EX("MfaConfiguration"));
        C5101Et c5101Et11 = new C5101Et(pictureInPictureParams, new EX("Policies"));
        C5101Et c5101Et12 = new C5101Et(loaderManager, new EX("SmsAuthenticationMessage"));
        C5101Et c5101Et13 = new C5101Et(pictureInPictureParams, new EX("SmsConfiguration"));
        C5101Et c5101Et14 = new C5101Et(loaderManager, new EX("SmsVerificationMessage"));
        C5101Et c5101Et15 = new C5101Et(pictureInPictureParams, new EX("UserAttributeUpdateSettings"));
        C5101Et c5101Et16 = new C5101Et(pictureInPictureParams, new EX("UserPoolAddOns"));
        C5101Et c5101Et17 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et18 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("UserPoolTags"));
        C5101Et c5101Et19 = new C5101Et(pictureInPictureParams, new EX("VerificationMessageTemplate"));
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
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        DoubleStream doubleStreamKWHzl = blobBackupHelper.KWHzl();
        if (doubleStreamKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, doubleStreamKWHzl, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$1$1.INSTANCE);
        }
        CipherOutputStream cipherOutputStreamEZpvd = blobBackupHelper.EZpvd();
        if (cipherOutputStreamEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, cipherOutputStreamEZpvd, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$2$1.INSTANCE);
        }
        if (blobBackupHelper.copydefault() != null) {
            blobBackupHelper2 = blobBackupHelper;
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$3
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
                    Iterator<JobWorkItem> it = blobBackupHelper2.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().AEQbTJ());
                    }
                }
            });
        } else {
            blobBackupHelper2 = blobBackupHelper;
        }
        FloatRange floatRangeOLrzqt = blobBackupHelper.OLrzqt();
        if (floatRangeOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, floatRangeOLrzqt.AEQbTJ());
        }
        NavigationRes navigationResAEQbTJ = blobBackupHelper.AEQbTJ();
        if (navigationResAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, navigationResAEQbTJ, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$5$1.INSTANCE);
        }
        StringDef stringDefGEmmrt = blobBackupHelper.gEmmrt();
        if (stringDefGEmmrt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, stringDefGEmmrt, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$6$1.INSTANCE);
        }
        java.lang.String strAYXKKw = blobBackupHelper.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strAYXKKw);
        }
        java.lang.String strValueOf = blobBackupHelper.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strValueOf);
        }
        ContextImpl contextImplDjBIcL = blobBackupHelper.djBIcL();
        if (contextImplDjBIcL != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et9, contextImplDjBIcL, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$9$1.INSTANCE);
        }
        RestoreSession restoreSessionAhwBna = blobBackupHelper.AhwBna();
        if (restoreSessionAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et10, restoreSessionAhwBna.KWHzl());
        }
        SharedPreferencesBackupHelper sharedPreferencesBackupHelperValues = blobBackupHelper.values();
        if (sharedPreferencesBackupHelperValues != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et11, sharedPreferencesBackupHelperValues, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$11$1.INSTANCE);
        }
        java.lang.String strDbNXlk = blobBackupHelper.DbNXlk();
        if (strDbNXlk != null) {
            ebEZpvd.AEQbTJ(c5101Et12, strDbNXlk);
        }
        Vr2dDisplayProperties vr2dDisplayPropertiesAkhnZx = blobBackupHelper.AkhnZx();
        if (vr2dDisplayPropertiesAkhnZx != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et13, vr2dDisplayPropertiesAkhnZx, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$13$1.INSTANCE);
        }
        java.lang.String strIsConnected = blobBackupHelper.isConnected();
        if (strIsConnected != null) {
            ebEZpvd.AEQbTJ(c5101Et14, strIsConnected);
        }
        BackupTransport backupTransportFetchVPNInfo = blobBackupHelper.fetchVPNInfo();
        if (backupTransportFetchVPNInfo != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et15, backupTransportFetchVPNInfo, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$15$1.INSTANCE);
        }
        FullBackup fullBackupEjfBZ = blobBackupHelper.ejfBZ();
        if (fullBackupEjfBZ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et16, fullBackupEjfBZ, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$16$1.INSTANCE);
        }
        java.lang.String strFJNWhG = blobBackupHelper.fJNWhG();
        if (strFJNWhG != null) {
            ebEZpvd.AEQbTJ(c5101Et17, strFJNWhG);
        }
        if (blobBackupHelper.fIwbmz() != null) {
            ebEZpvd.OLrzqt(c5101Et18, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$18
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
                    for (Map.Entry<String, String> entry : blobBackupHelper2.fIwbmz().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        WallpaperBackupHelper wallpaperBackupHelperFARcdN = blobBackupHelper.fARcdN();
        if (wallpaperBackupHelperFARcdN != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et19, wallpaperBackupHelperFARcdN, UpdateUserPoolOperationSerializerKt$serializeUpdateUserPoolOperationBody$1$19$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
