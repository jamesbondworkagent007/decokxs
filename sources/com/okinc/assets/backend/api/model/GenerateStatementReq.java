package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class GenerateStatementReq {
    public static final int $stable = 0;
    private final String recordDate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GenerateStatementReq copy$default(GenerateStatementReq generateStatementReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateStatementReq.recordDate;
        }
        return generateStatementReq.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.recordDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GenerateStatementReq copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GenerateStatementReq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenerateStatementReq) && Intrinsics.EZpvd((Object) this.recordDate, (Object) ((GenerateStatementReq) obj).recordDate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecordDate() {
        return this.recordDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.recordDate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GenerateStatementReq(recordDate=" + this.recordDate + ")";
    }

    public GenerateStatementReq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recordDate = str;
    }
}
