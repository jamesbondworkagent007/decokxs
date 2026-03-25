package com.okinc.business.invest_biz.di;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.iDF;
import o.iDG;
import o.iDI;
import o.iNQ;
import o.iNR;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RedeemTransactionRepositoryModule {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public static final iDF AEQbTJ(@NotNull iDG idg) {
        return Companion.copydefault(idg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public static final iDF KWHzl(@NotNull iDI idi) {
        return Companion.AEQbTJ(idi);
    }

    @yCR
    public abstract iNQ AEQbTJ(@NotNull iNR inr);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.di.RedeemTransactionRepositoryModule.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @yCR
        public final iDF AEQbTJ(@NotNull iDI idi) {
            Intrinsics.checkNotNullParameter(idi, "");
            return idi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @yCR
        public final iDF copydefault(@NotNull iDG idg) {
            Intrinsics.checkNotNullParameter(idg, "");
            return idg;
        }

        private Activity() {
        }
    }
}
