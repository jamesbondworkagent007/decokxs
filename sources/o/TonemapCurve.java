package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$2$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$3$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class TonemapCurve {
    public static final byte[] EZpvd(DT dt, TaskStackListener taskStackListener) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("MfaConfiguration"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("SmsMfaConfiguration"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("SoftwareTokenMfaConfiguration"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        RestoreSession restoreSessionAEQbTJ = taskStackListener.AEQbTJ();
        if (restoreSessionAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, restoreSessionAEQbTJ.KWHzl());
        }
        UiModeManager uiModeManagerEZpvd = taskStackListener.EZpvd();
        if (uiModeManagerEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, uiModeManagerEZpvd, SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$2$1.INSTANCE);
        }
        WallpaperInfo wallpaperInfoKWHzl = taskStackListener.KWHzl();
        if (wallpaperInfoKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, wallpaperInfoKWHzl, SetUserPoolMfaConfigOperationSerializerKt$serializeSetUserPoolMfaConfigOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strOLrzqt = taskStackListener.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
