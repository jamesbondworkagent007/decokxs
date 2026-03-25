package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TxTypes {
    public static final int $stable = 8;
    private final List<TxSelectType> content;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.TxTypes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxTypes copy$default(TxTypes txTypes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = txTypes.content;
        }
        return txTypes.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxSelectType> component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxTypes copy(@NotNull List<TxSelectType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TxTypes(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TxTypes) && Intrinsics.EZpvd(this.content, ((TxTypes) obj).content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxSelectType> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxTypes(content=" + this.content + ")";
    }

    public TxTypes(@NotNull List<TxSelectType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.content = list;
    }
}
