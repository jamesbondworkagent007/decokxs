package o;

import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.SupportService;
import com.okinc.biz.model.VideoQueueResult;
import com.okinc.biz.model.VipManagerInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6804aWL extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super VipManagerInfo> continuation);

    java.lang.Object AEQbTJ(@NotNull C6811aWS c6811aWS, @NotNull Continuation<? super SupportService> continuation);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, android.os.Bundle bundle);

    android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str);

    android.content.Intent EZpvd(@NotNull android.content.Context context, C6807aWO c6807aWO);

    androidx.fragment.app.Fragment EZpvd();

    void EZpvd(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, int i, Function2<? super java.lang.Boolean, ? super java.lang.Throwable, Unit> function2);

    android.content.Intent KWHzl(@NotNull android.content.Context context, C6807aWO c6807aWO);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, java.lang.String str2, Function1<? super VideoQueueResult, java.lang.Boolean> function1);

    android.content.Intent OLrzqt(@NotNull android.content.Context context);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle, java.lang.Integer num, @NotNull Continuation<? super Unit> continuation);

    void OLrzqt(@NotNull android.content.Context context, C6807aWO c6807aWO);

    java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull C6803aWK c6803aWK, @NotNull Continuation<? super Result<? extends android.content.Intent>> continuation);

    void copydefault(@NotNull android.content.Context context, @NotNull ChatBotRequest chatBotRequest);

    boolean copydefault(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.aWL$Application */
    public static final class Application {
        public static /* synthetic */ void openSupportCenter$default(InterfaceC6804aWL interfaceC6804aWL, android.content.Context context, C6807aWO c6807aWO, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSupportCenter");
            }
            if ((i & 2) != 0) {
                c6807aWO = null;
            }
            interfaceC6804aWL.OLrzqt(context, c6807aWO);
        }

        public static /* synthetic */ android.content.Intent buildSupportCenterIntent$default(InterfaceC6804aWL interfaceC6804aWL, android.content.Context context, C6807aWO c6807aWO, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildSupportCenterIntent");
            }
            if ((i & 2) != 0) {
                c6807aWO = null;
            }
            return interfaceC6804aWL.EZpvd(context, c6807aWO);
        }

        public static /* synthetic */ void openSupportWebArticle$default(InterfaceC6804aWL interfaceC6804aWL, android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSupportWebArticle");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            interfaceC6804aWL.AEQbTJ(context, str, bundle);
        }

        public static /* synthetic */ java.lang.Object openChatBotPage$default(InterfaceC6804aWL interfaceC6804aWL, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openChatBotPage");
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return interfaceC6804aWL.OLrzqt(context, bundle, num, continuation);
        }

        public static /* synthetic */ android.content.Intent buildSupportCenterHomeIntent$default(InterfaceC6804aWL interfaceC6804aWL, android.content.Context context, C6807aWO c6807aWO, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildSupportCenterHomeIntent");
            }
            if ((i & 2) != 0) {
                c6807aWO = null;
            }
            return interfaceC6804aWL.KWHzl(context, c6807aWO);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aWL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startVideoCallQueue$default(InterfaceC6804aWL interfaceC6804aWL, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startVideoCallQueue");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            interfaceC6804aWL.KWHzl(fragmentManager, str, str2, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.aWL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateCallStatus$default(InterfaceC6804aWL interfaceC6804aWL, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function2 function2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCallStatus");
            }
            interfaceC6804aWL.EZpvd(str, (i2 & 2) != 0 ? null : str2, str3, i, (i2 & 16) != 0 ? null : function2);
        }
    }
}
