package com.okinc.websocket.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WSLoginEventBean {
    public static final int $stable = 8;
    private final List<Object> args;
    private final String op;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.websocket.bean.WSLoginEventBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSLoginEventBean copy$default(WSLoginEventBean wSLoginEventBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSLoginEventBean.op;
        }
        if ((i & 2) != 0) {
            list = wSLoginEventBean.args;
        }
        return wSLoginEventBean.copy(str, list);
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
    public final WSLoginEventBean copy(@NotNull String str, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WSLoginEventBean(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSLoginEventBean)) {
            return false;
        }
        WSLoginEventBean wSLoginEventBean = (WSLoginEventBean) obj;
        return Intrinsics.EZpvd((Object) this.op, (Object) wSLoginEventBean.op) && Intrinsics.EZpvd(this.args, wSLoginEventBean.args);
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
        return "WSLoginEventBean(op=" + this.op + ", args=" + this.args + ")";
    }

    public WSLoginEventBean(@NotNull String str, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.op = str;
        this.args = list;
    }
}
