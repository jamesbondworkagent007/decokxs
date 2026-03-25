package o;

import com.okinc.im.config.page.ServiceName;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36597odv {
    public static final C36597odv KWHzl = new C36597odv();
    public static final java.util.Map<InterfaceC35282nsQ, InterfaceC44291sKj> OLrzqt = new LinkedHashMap();
    public static final int EZpvd = 8;

    private C36597odv() {
    }

    public static /* synthetic */ void registerIMSimpleMessageEventManager$default(C36597odv c36597odv, InterfaceC35282nsQ interfaceC35282nsQ, java.lang.String str, ServiceName serviceName, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            serviceName = null;
        }
        c36597odv.KWHzl(interfaceC35282nsQ, str, serviceName);
    }

    /* JADX INFO: renamed from: o.odv$TaskDescription */
    public static final class TaskDescription extends C44373sNk {
        public final /* synthetic */ InterfaceC35282nsQ EZpvd;
        public final /* synthetic */ ServiceName OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        public TaskDescription(java.lang.String str, ServiceName serviceName, InterfaceC35282nsQ interfaceC35282nsQ) {
            this.copydefault = str;
            this.OLrzqt = serviceName;
            this.EZpvd = interfaceC35282nsQ;
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void KWHzl(C44467sQx c44467sQx) {
            Intrinsics.checkNotNullParameter(c44467sQx, "");
            OKMessage oKMessageCopydefault = c44467sQx.copydefault();
            java.lang.String str = this.copydefault;
            if (str == null || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) oKMessageCopydefault.getTargetId())) {
                ServiceName serviceName = this.OLrzqt;
                if (serviceName != null) {
                    OKMessageContent content = oKMessageCopydefault.getContent();
                    OKCustomMessage oKCustomMessage = content instanceof OKCustomMessage ? (OKCustomMessage) content : null;
                    if (oKCustomMessage == null || !Intrinsics.EZpvd((java.lang.Object) oKCustomMessage.getServiceName(), (java.lang.Object) serviceName.getServiceName())) {
                        return;
                    }
                }
                this.EZpvd.KWHzl(oKMessageCopydefault);
            }
        }
    }

    public final void KWHzl(@NotNull InterfaceC35282nsQ interfaceC35282nsQ, java.lang.String str, ServiceName serviceName) {
        Intrinsics.checkNotNullParameter(interfaceC35282nsQ, "");
        TaskDescription taskDescription = new TaskDescription(str, serviceName, interfaceC35282nsQ);
        OLrzqt.putIfAbsent(interfaceC35282nsQ, taskDescription);
        sDZ.AEQbTJ.isConnected().OLrzqt(taskDescription);
    }

    public final void OLrzqt(@NotNull InterfaceC35282nsQ interfaceC35282nsQ) {
        Intrinsics.checkNotNullParameter(interfaceC35282nsQ, "");
        java.util.Map<InterfaceC35282nsQ, InterfaceC44291sKj> map = OLrzqt;
        InterfaceC44291sKj interfaceC44291sKj = map.get(interfaceC35282nsQ);
        if (interfaceC44291sKj != null) {
            sDZ.AEQbTJ.isConnected().AEQbTJ(interfaceC44291sKj);
        }
        map.remove(interfaceC35282nsQ);
    }
}
