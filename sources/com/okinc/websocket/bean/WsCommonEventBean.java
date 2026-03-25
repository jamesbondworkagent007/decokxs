package com.okinc.websocket.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WsCommonEventBean {
    public static final int $stable = 8;
    private final List<Object> args;
    private final String op;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.websocket.bean.WsCommonEventBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsCommonEventBean copy$default(WsCommonEventBean wsCommonEventBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wsCommonEventBean.op;
        }
        if ((i & 2) != 0) {
            list = wsCommonEventBean.args;
        }
        return wsCommonEventBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.op;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component2() {
        return this.args;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsCommonEventBean copy(@NotNull String str, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WsCommonEventBean(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsCommonEventBean)) {
            return false;
        }
        WsCommonEventBean wsCommonEventBean = (WsCommonEventBean) obj;
        return Intrinsics.EZpvd((Object) this.op, (Object) wsCommonEventBean.op) && Intrinsics.EZpvd(this.args, wsCommonEventBean.args);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getArgs() {
        return this.args;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOp() {
        return this.op;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.op.hashCode() * 31) + this.args.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsCommonEventBean(op=" + this.op + ", args=" + this.args + ")";
    }

    public WsCommonEventBean(@NotNull String str, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.op = str;
        this.args = list;
    }
}
