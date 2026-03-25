package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class StatementListResp {
    public static final int $stable = 8;
    private final List<StatementMonthInfo> statements;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StatementListResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.StatementListResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatementListResp copy$default(StatementListResp statementListResp, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = statementListResp.statements;
        }
        return statementListResp.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StatementMonthInfo> component1() {
        return this.statements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatementListResp copy(@NotNull List<StatementMonthInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new StatementListResp(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatementListResp) && Intrinsics.EZpvd(this.statements, ((StatementListResp) obj).statements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StatementMonthInfo> getStatements() {
        return this.statements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.statements.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StatementListResp(statements=" + this.statements + ")";
    }

    public StatementListResp(@NotNull List<StatementMonthInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.statements = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.StatementMonthInfo>):void (m)] (LINE:20) call: com.okinc.assets.backend.api.model.StatementListResp.<init>(java.util.List):void type: THIS */
    public /* synthetic */ StatementListResp(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
