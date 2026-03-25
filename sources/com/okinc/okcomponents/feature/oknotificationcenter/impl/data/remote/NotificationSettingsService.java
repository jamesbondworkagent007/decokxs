package com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SwitchNotificationSettingsChannelReq;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C43417ror;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface NotificationSettingsService {
    public static final Application Companion = Application.KWHzl;

    @GET("/priapi/v4/notify/mc/notificationSetting")
    Object getNotificationAdvanceSettings(@Query("businessType") int i, @NotNull Continuation<? super ResponseData<List<NotificationAdvancedSettings>>> continuation);

    @POST("/priapi/v4/notify/mc/notificationSetting")
    Object updateNotificationSettingsChannel(@Body @NotNull SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final NotificationSettingsService AEQbTJ() {
            return (NotificationSettingsService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(NotificationSettingsService.class));
        }
    }
}
