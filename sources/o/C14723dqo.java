package o;

import com.okinc.business.defi.biz.net.bean.UnBindBackendReferralCodeCacheBean;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14723dqo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final ConcurrentHashMap<java.lang.String, UnBindBackendReferralCodeCacheBean> EZpvd = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.dqo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C14716dqh getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.EZpvd(context);
        }

        public final C14716dqh EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).iwGUEr();
        }
    }

    public final UnBindBackendReferralCodeCacheBean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean = this.EZpvd.get(str);
        return unBindBackendReferralCodeCacheBean != null ? unBindBackendReferralCodeCacheBean : KWHzl(str);
    }

    public final UnBindBackendReferralCodeCacheBean KWHzl(java.lang.String str) {
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean;
        try {
            java.lang.String string = SPUtils.getString(AEQbTJ(str), "", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            Intrinsics.copydefault((java.lang.Object) string);
            if (string.length() > 0) {
                Json.Default r2 = Json.Default;
                r2.getSerializersModule();
                unBindBackendReferralCodeCacheBean = (UnBindBackendReferralCodeCacheBean) r2.decodeFromString(UnBindBackendReferralCodeCacheBean.Companion.serializer(), string);
            } else {
                unBindBackendReferralCodeCacheBean = null;
            }
            if (unBindBackendReferralCodeCacheBean != null) {
                this.EZpvd.put(str, unBindBackendReferralCodeCacheBean);
            }
            return unBindBackendReferralCodeCacheBean;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralUnbindBackendCodeManager", "Failed to get unbind_backend_code from SP for accountId: " + str, e);
            return null;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(unBindBackendReferralCodeCacheBean, "");
        try {
            java.lang.String strAEQbTJ = AEQbTJ(str);
            Json.Default r2 = Json.Default;
            r2.getSerializersModule();
            SPUtils.put(strAEQbTJ, r2.encodeToString(UnBindBackendReferralCodeCacheBean.Companion.serializer(), unBindBackendReferralCodeCacheBean), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            this.EZpvd.put(str, unBindBackendReferralCodeCacheBean);
            pUU.EZpvd("ReferralUnbindBackendCodeManager", "Saved unbind_backend_code to SP for accountId: " + str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralUnbindBackendCodeManager", "Failed to save unbind_backend_code to SP for accountId: " + str, e);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SPUtils.remove(AEQbTJ(str), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            this.EZpvd.remove(str);
            pUU.EZpvd("ReferralUnbindBackendCodeManager", "Removed unbind_backend_code from SP for accountId: " + str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralUnbindBackendCodeManager", "Failed to remove unbind_backend_code from SP for accountId: " + str, e);
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return "dex_referral_unbind_backend_code_info_" + str;
    }
}
