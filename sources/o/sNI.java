package o;

import com.okinc.okimcore.model.biz.AbsIMBizMessage;
import com.okinc.okimcore.model.biz.OKBizCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNI {
    public static final sNI AEQbTJ = new sNI();
    public static final java.util.HashMap<java.lang.String, java.lang.Class<? extends AbsIMBizMessage<?>>> copydefault = new java.util.HashMap<>();
    public static final int KWHzl = 8;

    private sNI() {
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Class<? extends AbsIMBizMessage<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        copydefault.put(str, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (oKMessage.getContent() instanceof OKBizCustomMessage) {
            OKMessageContent content = oKMessage.getContent();
            Intrinsics.copydefault(content, "");
            OKBizCustomMessage oKBizCustomMessage = (OKBizCustomMessage) content;
            java.lang.String bizType = oKBizCustomMessage.getBizType();
            java.util.HashMap<java.lang.String, java.lang.Class<? extends AbsIMBizMessage<?>>> map = copydefault;
            OKMessageContent oKMessageContent = null;
            if (map.containsKey(bizType)) {
                java.lang.Class<? extends AbsIMBizMessage<?>> cls = map.get(bizType);
                if (cls != null) {
                    try {
                        java.lang.reflect.Constructor<? extends AbsIMBizMessage<?>> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
                        AbsIMBizMessage<?> absIMBizMessageNewInstance = declaredConstructor != null ? declaredConstructor.newInstance(new java.lang.Object[0]) : null;
                        if (absIMBizMessageNewInstance != null) {
                            absIMBizMessageNewInstance.KWHzl(oKBizCustomMessage);
                        }
                        oKMessageContent = absIMBizMessageNewInstance;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (oKMessageContent != null) {
                oKMessage.setContent(oKMessageContent);
            }
        }
    }
}
