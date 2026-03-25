package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.RespondToAuthChallengeOperationSerializerKt$serializeRespondToAuthChallengeOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.RespondToAuthChallengeOperationSerializerKt$serializeRespondToAuthChallengeOperationBody$1$7$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5097Ep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MarshalQueryableEnum {
    public static final byte[] EZpvd(DT dt, final RemoteAction remoteAction) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AnalyticsMetadata"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("ChallengeName"));
        AbstractC5105Ex.Dialog dialog = AbstractC5105Ex.Dialog.KWHzl;
        C5101Et c5101Et3 = new C5101Et(dialog, new EX("ChallengeResponses"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et5 = new C5101Et(dialog, new EX("ClientMetadata"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("Session"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("UserContextData"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AccountManagerResponse accountManagerResponseKWHzl = remoteAction.KWHzl();
        if (accountManagerResponseKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, accountManagerResponseKWHzl, RespondToAuthChallengeOperationSerializerKt$serializeRespondToAuthChallengeOperationBody$1$1$1.INSTANCE);
        }
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivityOLrzqt = remoteAction.OLrzqt();
        if (grantCredentialsPermissionActivityOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, grantCredentialsPermissionActivityOLrzqt.copydefault());
        }
        if (remoteAction.AEQbTJ() != null) {
            ebEZpvd.OLrzqt(c5101Et3, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.RespondToAuthChallengeOperationSerializerKt$serializeRespondToAuthChallengeOperationBody$1$3
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
                    for (Map.Entry<String, String> entry : remoteAction.AEQbTJ().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        java.lang.String strCopydefault = remoteAction.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strCopydefault);
        }
        if (remoteAction.EZpvd() != null) {
            ebEZpvd.OLrzqt(c5101Et5, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.RespondToAuthChallengeOperationSerializerKt$serializeRespondToAuthChallengeOperationBody$1$5
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
                    for (Map.Entry<String, String> entry : remoteAction.EZpvd().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        java.lang.String strGEmmrt = remoteAction.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strGEmmrt);
        }
        RestoreDescription restoreDescriptionAhwBna = remoteAction.AhwBna();
        if (restoreDescriptionAhwBna != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, restoreDescriptionAhwBna, RespondToAuthChallengeOperationSerializerKt$serializeRespondToAuthChallengeOperationBody$1$7$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
