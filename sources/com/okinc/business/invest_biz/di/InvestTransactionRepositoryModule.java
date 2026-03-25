package com.okinc.business.invest_biz.di;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23637iDt;
import o.InterfaceC23643iDz;
import o.iDD;
import o.iNG;
import o.iNK;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InvestTransactionRepositoryModule {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public static final InterfaceC23643iDz EZpvd(@NotNull C23637iDt c23637iDt) {
        return Companion.AEQbTJ(c23637iDt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public static final InterfaceC23643iDz copydefault(@NotNull iDD idd) {
        return Companion.OLrzqt(idd);
    }

    @yCR
    public abstract iNG KWHzl(@NotNull iNK ink);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.di.InvestTransactionRepositoryModule.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @yCR
        public final InterfaceC23643iDz AEQbTJ(@NotNull C23637iDt c23637iDt) {
            Intrinsics.checkNotNullParameter(c23637iDt, "");
            return c23637iDt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @yCR
        public final InterfaceC23643iDz OLrzqt(@NotNull iDD idd) {
            Intrinsics.checkNotNullParameter(idd, "");
            return idd;
        }

        private ActionBar() {
        }
    }
}
