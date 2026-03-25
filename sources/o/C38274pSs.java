package o;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.AmplifyConfiguration;
import com.amplifyframework.log.AwsOKLogUtil;
import com.amplifyframework.util.UserAgent;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.pSs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38274pSs {
    public static boolean AEQbTJ;
    public static final C38274pSs KWHzl = new C38274pSs();
    public static java.lang.String OLrzqt = "";
    public static java.lang.String EZpvd = "";
    public static final int copydefault = 8;

    private C38274pSs() {
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) throws AmplifyException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        pUU.KWHzl("kyc_in_house", "initAwsSdk isAwsInit=" + AEQbTJ + " poolId=" + str + " region=" + str2 + " lastPoolId=" + OLrzqt + " lastRegion=" + EZpvd);
        if (AEQbTJ && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OLrzqt) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) EZpvd)) {
            return true;
        }
        if (AEQbTJ) {
            pUU.KWHzl("kyc_in_house", "initAwsSdk config changed, resetting Amplify");
            copydefault();
        }
        AwsOKLogUtil.INSTANCE.setReport(new Function1() { // from class: o.pSp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38274pSs.copydefault(str3, str4, str5, (java.lang.String) obj);
            }
        });
        Amplify.addPlugin(new AWSCognitoAuthPlugin());
        try {
            AmplifyConfiguration amplifyConfigurationFromJson = AmplifyConfiguration.fromJson(new JSONObject(C59442zhC.fJNWhG("\n            {\n              \"auth\": {\n                \"plugins\": {\n                  \"awsCognitoAuthPlugin\": {\n                    \"CredentialsProvider\": {\n                      \"CognitoIdentity\": {\n                        \"Default\": {\n                          \"PoolId\": \"" + str + "\",\n                          \"Region\": \"" + str2 + "\"\n                        }\n                      }\n                    }\n                  }\n                }\n              }\n            }\n        ")));
            Intrinsics.checkNotNullExpressionValue(amplifyConfigurationFromJson, "");
            Amplify.configure(amplifyConfigurationFromJson, C43246rlf.OLrzqt.valueOf());
            AEQbTJ = true;
            OLrzqt = str;
            EZpvd = str2;
            return true;
        } catch (java.lang.Exception e) {
            pUU.KWHzl("kyc_in_house", "initAwsSdk error=" + e);
            return false;
        }
    }

    public static final Unit copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        pUU.KWHzl("kyc_in_house", "AwsOKLogUtil report=" + str4);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWS_SDK_ERROR_LOG", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38274pSs.KWHzl(str4, str, str2, str3, (EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        UserAgent.reset();
        Amplify.resetConfigLock(false);
        Amplify.resetAllCategories();
        AEQbTJ = false;
        OLrzqt = "";
        EZpvd = "";
    }
}
