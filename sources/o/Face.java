package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetRiskConfigurationOperationSerializerKt$serializeSetRiskConfigurationOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetRiskConfigurationOperationSerializerKt$serializeSetRiskConfigurationOperationBody$1$3$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetRiskConfigurationOperationSerializerKt$serializeSetRiskConfigurationOperationBody$1$4$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class Face {
    public static final byte[] OLrzqt(DT dt, SynchronousUserSwitchObserver synchronousUserSwitchObserver) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AccountTakeoverRiskConfiguration"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("CompromisedCredentialsRiskConfiguration"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("RiskExceptionConfiguration"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        LongStream longStreamCopydefault = synchronousUserSwitchObserver.copydefault();
        if (longStreamCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, longStreamCopydefault, SetRiskConfigurationOperationSerializerKt$serializeSetRiskConfigurationOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strEZpvd = synchronousUserSwitchObserver.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        FloatArrayEvaluator floatArrayEvaluatorOLrzqt = synchronousUserSwitchObserver.OLrzqt();
        if (floatArrayEvaluatorOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, floatArrayEvaluatorOLrzqt, SetRiskConfigurationOperationSerializerKt$serializeSetRiskConfigurationOperationBody$1$3$1.INSTANCE);
        }
        ServiceStartArgs serviceStartArgsAEQbTJ = synchronousUserSwitchObserver.AEQbTJ();
        if (serviceStartArgsAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, serviceStartArgsAEQbTJ, SetRiskConfigurationOperationSerializerKt$serializeSetRiskConfigurationOperationBody$1$4$1.INSTANCE);
        }
        java.lang.String strKWHzl = synchronousUserSwitchObserver.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
