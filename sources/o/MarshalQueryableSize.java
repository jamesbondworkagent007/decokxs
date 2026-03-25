package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$6$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$7$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MarshalQueryableSize {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull SearchManager searchManager) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(searchManager, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("AttributeDataType"));
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("DeveloperOnlyAttribute"));
        C5101Et c5101Et3 = new C5101Et(taskDescription, new EX("Mutable"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Name"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("NumberAttributeConstraints"));
        C5101Et c5101Et6 = new C5101Et(taskDescription, new EX("Required"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("StringAttributeConstraints"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = searchManager.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        AuthenticatorException authenticatorExceptionAEQbTJ = searchManager.AEQbTJ();
        if (authenticatorExceptionAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, authenticatorExceptionAEQbTJ.copydefault());
        }
        java.lang.Boolean boolOLrzqt = searchManager.OLrzqt();
        if (boolOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et2, boolOLrzqt.booleanValue());
        }
        java.lang.Boolean boolEZpvd = searchManager.EZpvd();
        if (boolEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et3, boolEZpvd.booleanValue());
        }
        java.lang.Boolean boolDjBIcL = searchManager.djBIcL();
        if (boolDjBIcL != null) {
            ebEZpvd.OLrzqt(c5101Et6, boolDjBIcL.booleanValue());
        }
        NativeActivity nativeActivityCopydefault = searchManager.copydefault();
        if (nativeActivityCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, nativeActivityCopydefault, SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$6$1.INSTANCE);
        }
        DevicePolicyCache devicePolicyCacheValueOf = searchManager.valueOf();
        if (devicePolicyCacheValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, devicePolicyCacheValueOf, SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$7$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
