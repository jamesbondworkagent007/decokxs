package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.core.util.SPUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32931mmr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32871mlk {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.mlk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mlk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            if (!C43308rmo.KWHzl(application)) {
                pUU.KWHzl("TrackInitManager", "init track cancel cause not ui process!");
                return;
            }
            C32872mll.OLrzqt.copydefault(application);
            C6860aXO.copydefault.copydefault(application);
            C32935mmv.KWHzl.put("device_type", "Android");
        }

        public final void copydefault(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            AEQbTJ(application);
            OLrzqt(application);
        }

        public final void OLrzqt(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            if (!C43308rmo.KWHzl(application)) {
                pUU.KWHzl("TrackInitManager", "addCommonInterceptor cancel cause not ui process!");
                return;
            }
            C32922mmi c32922mmi = new C32922mmi();
            c32922mmi.EZpvd(OtcExtraKeys.PARAMS_SESSION_ID, C32932mms.AEQbTJ.EZpvd(), null);
            C32872mll c32872mll = C32872mll.OLrzqt;
            c32872mll.EZpvd(c32922mmi);
            C32931mmr.TaskDescription taskDescription = C32931mmr.Companion;
            taskDescription.KWHzl("[Old] CommonEventInterceptor registered.");
            c32872mll.EZpvd(new C32934mmu());
            application.registerActivityLifecycleCallbacks(new C32936mmw(c32922mmi));
            taskDescription.KWHzl("[Old] TrackActivityLifecycleCallbacks registered.");
        }

        public final void AEQbTJ(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            java.lang.String strKWHzl = C8087awC.KWHzl(application, "inviteCode");
            java.lang.String str = strKWHzl != null ? strKWHzl : "";
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                SPUtils.put("inviteCode", str);
            }
            java.lang.String string = SPUtils.getString(RemoteMessageConst.Notification.CHANNEL_ID, null, "invite_attribution");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                C32935mmv.KWHzl.put("channel_id", string);
            }
            C32856mlV c32856mlV = C32856mlV.OLrzqt;
        }
    }
}
