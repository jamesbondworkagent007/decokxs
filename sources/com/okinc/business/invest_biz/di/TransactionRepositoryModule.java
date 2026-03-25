package com.okinc.business.invest_biz.di;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23629iDl;
import o.iDH;
import o.iNU;
import o.iNW;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TransactionRepositoryModule {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public static final iDH EZpvd(@NotNull C23629iDl c23629iDl) {
        return Companion.KWHzl(c23629iDl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public static final iDH KWHzl(@NotNull iDH idh) {
        return Companion.AEQbTJ(idh);
    }

    @yCR
    public abstract iNW copydefault(@NotNull iNU inu);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.di.TransactionRepositoryModule.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @yCR
        public final iDH AEQbTJ(@NotNull iDH idh) {
            Intrinsics.checkNotNullParameter(idh, "");
            return idh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @yCR
        public final iDH KWHzl(@NotNull C23629iDl c23629iDl) {
            Intrinsics.checkNotNullParameter(c23629iDl, "");
            return c23629iDl;
        }

        private TaskDescription() {
        }
    }
}
