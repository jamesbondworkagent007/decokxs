package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.LambdaConfigTypeDocumentSerializerKt$serializeLambdaConfigTypeDocument$1$10$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.LambdaConfigTypeDocumentSerializerKt$serializeLambdaConfigTypeDocument$1$12$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.LambdaConfigTypeDocumentSerializerKt$serializeLambdaConfigTypeDocument$1$13$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Instance {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ContextImpl contextImpl) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(contextImpl, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("CreateAuthChallenge"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("CustomEmailSender"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("CustomMessage"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("CustomSMSSender"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("DefineAuthChallenge"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("KMSKeyID"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("PostAuthentication"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("PostConfirmation"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("PreAuthentication"));
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("PreSignUp"));
        C5101Et c5101Et11 = new C5101Et(loaderManager, new EX("PreTokenGeneration"));
        C5101Et c5101Et12 = new C5101Et(pictureInPictureParams, new EX("PreTokenGenerationConfig"));
        C5101Et c5101Et13 = new C5101Et(loaderManager, new EX("UserMigration"));
        C5101Et c5101Et14 = new C5101Et(loaderManager, new EX("VerifyAuthChallengeResponse"));
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
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strAhwBna = contextImpl.AhwBna();
        if (strAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et10, strAhwBna);
        }
        java.lang.String strKWHzl = contextImpl.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        java.lang.String strAYXKKw = contextImpl.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strAYXKKw);
        }
        java.lang.String strValueOf = contextImpl.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et9, strValueOf);
        }
        java.lang.String strGEmmrt = contextImpl.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strGEmmrt);
        }
        java.lang.String strEZpvd = contextImpl.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strEZpvd);
        }
        java.lang.String strCopydefault = contextImpl.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strDbNXlk = contextImpl.DbNXlk();
        if (strDbNXlk != null) {
            ebEZpvd.AEQbTJ(c5101Et14, strDbNXlk);
        }
        java.lang.String strValues = contextImpl.values();
        if (strValues != null) {
            ebEZpvd.AEQbTJ(c5101Et11, strValues);
        }
        PackageDeleteObserver packageDeleteObserverFetchVPNInfo = contextImpl.fetchVPNInfo();
        if (packageDeleteObserverFetchVPNInfo != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et12, packageDeleteObserverFetchVPNInfo, LambdaConfigTypeDocumentSerializerKt$serializeLambdaConfigTypeDocument$1$10$1.INSTANCE);
        }
        java.lang.String strIsConnected = contextImpl.isConnected();
        if (strIsConnected != null) {
            ebEZpvd.AEQbTJ(c5101Et13, strIsConnected);
        }
        AnyRes anyResOLrzqt = contextImpl.OLrzqt();
        if (anyResOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, anyResOLrzqt, LambdaConfigTypeDocumentSerializerKt$serializeLambdaConfigTypeDocument$1$12$1.INSTANCE);
        }
        AppIdInt appIdIntAEQbTJ = contextImpl.AEQbTJ();
        if (appIdIntAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, appIdIntAEQbTJ, LambdaConfigTypeDocumentSerializerKt$serializeLambdaConfigTypeDocument$1$13$1.INSTANCE);
        }
        java.lang.String strDjBIcL = contextImpl.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strDjBIcL);
        }
        ebEZpvd.AEQbTJ();
    }
}
