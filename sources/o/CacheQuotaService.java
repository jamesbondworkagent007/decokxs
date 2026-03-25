package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminDisableProviderForUserOperationSerializerKt$serializeAdminDisableProviderForUserOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes20.dex */
public final class CacheQuotaService {
    public static final byte[] EZpvd(DT dt, ExemptionMechanismException exemptionMechanismException) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("User"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        PackageInstallObserver packageInstallObserverCopydefault = exemptionMechanismException.copydefault();
        if (packageInstallObserverCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, packageInstallObserverCopydefault, AdminDisableProviderForUserOperationSerializerKt$serializeAdminDisableProviderForUserOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strKWHzl = exemptionMechanismException.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
