package o;

import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14644dpO {
    public volatile DeviceRefCodeCacheBean EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final Json copydefault = JsonKt.Json$default(null, new Function1() { // from class: o.dpM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C14644dpO.EZpvd((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: renamed from: o.dpO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dpO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C14644dpO getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.KWHzl(context);
        }

        public final C14644dpO KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).ejfBZ();
        }
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final DeviceRefCodeCacheBean OLrzqt() {
        try {
            DeviceRefCodeCacheBean deviceRefCodeCacheBean = this.EZpvd;
            if (deviceRefCodeCacheBean != null) {
                return deviceRefCodeCacheBean;
            }
            DeviceRefCodeCacheBean deviceRefCodeCacheBean2 = this.EZpvd;
            return deviceRefCodeCacheBean2 != null ? deviceRefCodeCacheBean2 : KWHzl();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralDeviceCodeManager", "Failed to getDeviceCodeInfo", e);
            return null;
        }
    }

    public final DeviceRefCodeCacheBean KWHzl() {
        DeviceRefCodeCacheBean deviceRefCodeCacheBean;
        try {
            java.lang.String string = SPUtils.getString("dex_referral_device_code_info", "", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            Intrinsics.copydefault((java.lang.Object) string);
            if (string.length() > 0) {
                Json json = copydefault;
                json.getSerializersModule();
                deviceRefCodeCacheBean = (DeviceRefCodeCacheBean) json.decodeFromString(DeviceRefCodeCacheBean.Companion.serializer(), string);
            } else {
                deviceRefCodeCacheBean = null;
            }
            if (deviceRefCodeCacheBean != null) {
                this.EZpvd = deviceRefCodeCacheBean;
            }
            return deviceRefCodeCacheBean;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralDeviceCodeManager", "Failed to get device_code from SP", e);
            return null;
        }
    }

    public final boolean copydefault() {
        try {
            SPUtils.remove("dex_referral_device_code_info", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            this.EZpvd = null;
            pUU.EZpvd("ReferralDeviceCodeManager", "Removed device_code from SP");
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralDeviceCodeManager", "Failed to remove device_code from SP", e);
            return false;
        }
    }

    public final void EZpvd(@NotNull DeviceRefCodeCacheBean deviceRefCodeCacheBean) {
        Intrinsics.checkNotNullParameter(deviceRefCodeCacheBean, "");
        try {
            Json json = copydefault;
            json.getSerializersModule();
            SPUtils.put("dex_referral_device_code_info", json.encodeToString(DeviceRefCodeCacheBean.Companion.serializer(), deviceRefCodeCacheBean), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            this.EZpvd = deviceRefCodeCacheBean;
            pUU.EZpvd("ReferralDeviceCodeManager", "Saved device_code to SP: code=" + deviceRefCodeCacheBean.getCode());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralDeviceCodeManager", "Failed to save device_code to SP", e);
        }
    }
}
