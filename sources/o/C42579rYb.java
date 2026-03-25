package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42579rYb implements InterfaceC43234rlT {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.rYb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.KWHzl("NotificationCenterDeeplinkHandler", "executeDeeplink with params: " + map);
        java.lang.Object obj = map.get("categoryId");
        context.startActivity(NotificationCenterActivity.Activity.createIntent$default(NotificationCenterActivity.Companion, context, null, NotificationCategory.Companion.KWHzl(obj instanceof java.lang.String ? (java.lang.String) obj : null), null, 8, null));
    }
}
